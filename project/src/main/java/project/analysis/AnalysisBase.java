package project.analysis;

import java.util.ArrayList;
import java.util.HashMap;

import project.controller.Controller;

/**
 * The base class of all analysis types.
 * Maintains both a list of years and viewers for which this analysis is valid.
 */
abstract public class AnalysisBase {
    /**
     * Stores the years for which analysis cannot be performed, loaded in at initialization time
     */
    protected ArrayList<Integer> invalidYears = new ArrayList<Integer>();

    /**
     * Stores the string representation of the valid possible viewers for the analysis type, specified at
     * initialization time.
     */
    protected ArrayList<String> validViewers = new ArrayList<String>();

    /**
     * @param c1        The country whose data you want in the numerator.
     * @param c2        The country whose data you want in the denominator.
     * @param dt1       The data type to read in for c1.
     * @param dt2       The data type to read in for c2.
     * @param startYear The year to start analysis.
     * @param endYear   The year to end analysis.
     * @return Provides a single element hashmap containing the ratio of all data between
     * years. If the divisor country's data for a year is zero, the item is not included.
     */
    HashMap<String, HashMap<Integer, Float>> getRatioHelper(String c, String dt1, String dt2, String startYear, String endYear) {
        HashMap<String, HashMap<Integer, Float>> result = new HashMap<String, HashMap<Integer, Float>>();
        HashMap<String, HashMap<Integer, Float>> cData1 = Controller.getFilteredData(c, dt1, startYear, endYear);
        HashMap<String, HashMap<Integer, Float>> cData2 = Controller.getFilteredData(c, dt2, startYear, endYear);
        HashMap<Integer, Float> ratioResult = new HashMap<>();

        for (Integer key : cData1.get(dt1).keySet()) {
            if (cData2.get(dt2).keySet().contains(key)) {
                float c1DataPoint = cData1.get(dt1).get(key);
                float c2DataPoint = cData2.get(dt2).get(key);
                if (c2DataPoint != 0.f) {
                    ratioResult.put(key, c1DataPoint / c2DataPoint);
                }
            }
        }
        result.put("Result", ratioResult);
        return result;
    }

    /**
     * @return A hashmap containing String/Hashmap pairs where each string is the data type and the
     * hashmap contains the year/data pairs for that data type.
     * <p>
     * --------------Example Result 1--------------
     * {"Ratio - GDP Per Capita and C02 Emissions" : {2001 : 20.3}, {2002 : 36.1}}
     * <p>
     * --------------Example Result 2--------------
     * {"Mortality Rate, under-5 (per 1,000 live births)" : {1998 : 5.1}, {1999 : 4.5}},
     * {"People using safely managed drinking water services (% of population)" : {1998 : 85.2}, {1999 : 88.4}}
     * @note The String portion of the outer hashmap always contains the title of the data series. The inner
     * hashmap contains the year/value pair for each data point. Year is simply left at -1 if the hashmap only
     * ever contains one value (average between years for example). It is the job of each graph to interpret
     * and render the results, but each graph can expect the same structure.
     */
    abstract public HashMap<String, HashMap<Integer, Float>> getAnalyzedData();
}

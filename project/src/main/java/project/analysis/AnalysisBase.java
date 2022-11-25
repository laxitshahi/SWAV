package project.analysis;

import java.util.ArrayList;
import java.util.HashMap;

import project.controller.Controller;

/**
 * The base class of all analysis types.
 * Maintains both a list of years and viewers for which this analysis is valid.
 */
abstract public class AnalysisBase<K, T, V> {
    static protected String country;
    static protected String startYear;
    static protected String endYear;
    /**
     * Stores the years for which analysis cannot be performed, loaded in at initialization time
     */
    protected ArrayList<Integer> invalidYears = new ArrayList<Integer>();

    /**
     * Stores the string representation of the valid possible viewers for the analysis type, specified at
     * initialization time.
     */
    protected ArrayList<String> validViewers = new ArrayList<String>();

    protected HashMap<K, ArrayList<HashMap<T, V>>> convertToGraphFormat(HashMap<K, HashMap<T, V>> preData) {
        HashMap<K, ArrayList<HashMap<T, V>>> result = new HashMap<K, ArrayList<HashMap<T, V>>>();
        for (K outerKey : preData.keySet()) {
            ArrayList<HashMap<T, V>> innerList = new ArrayList<>();
            result.put(outerKey, innerList);
            for (T innerKey : preData.get(outerKey).keySet()) {
                HashMap<T, V> innerMap = new HashMap<T, V>();
                innerMap.put(innerKey, preData.get(outerKey).get(innerKey));
                innerList.add(innerMap);
            }
        }
        return result;
    }


    /**
     * @param c        The country whose data y
     * @param dt1       The data type to read in for c1
     * @param dt2       The data type to read in for c2
     * @param startYear The year to start analysis
     * @param endYear   The year to end analysis
     * @return Provides a single element hashmap containing the ratio of all data between
     * years. If the divisor country's data for a year is zero, the item is not included.
     */

    /**
     * @return A hashmap containing String/Hashmap pairs where each string is the data type and the
     * hashmap contains the year/data pairs for that data type.
     *
     * --------------Example Result 1--------------
     * {"Ratio - GDP Per Capita and C02 Emissions" : {2001 : 20.3}, {2002 : 36.1}}
     *
     * --------------Example Result 2--------------
     * {"Mortality Rate, under-5 (per 1,000 live births)" : {1998 : 5.1}, {1999 : 4.5}},
     * {"People using safely managed drinking water services (% of population)" : {1998 : 85.2}, {1999 : 88.4}}
     * @note The String portion of the outer hashmap always contains the title of the data series. The inner
     * hashmap contains the year/value pair for each data point. Year is simply left at -1 if the hashmap only
     * ever contains one value (average between years for example). It is the job of each graph to interpret
     * and render the results, but each graph can expect the same structure.
     */
    //abstract public HashMap<String, HashMap<Integer, Float>> getAnalyzedData();
}

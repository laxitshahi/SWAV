package project.analysis;

import project.controller.Controller;

import java.util.HashMap;


/**
 * @param c        The country whose data y
 * @param dt1       The data type to read in for c1
 * @param dt2       The data type to read in for c2
 * @param startYear The year to start analysis
 * @param endYear   The year to end analysis
 * @return Provides a single element hashmap containing the ratio of all data between
 * years. If the divisor country's data for a year is zero, the item is not included.
 */
public abstract class RatioAnalysisBase extends AnalysisBase {
    static protected String country;
    static protected String numData;
    static protected String denomData;
    static protected String startYear;
    static protected String endYear;

    public HashMap<String, HashMap<Integer, Float>> getAnalyzedData() {
        HashMap<String, HashMap<Integer, Float>> result = new HashMap<String, HashMap<Integer, Float>>();
        HashMap<String, HashMap<Integer, Float>> cData1 = Controller.getFilteredData(country, numData, startYear, endYear);
        HashMap<String, HashMap<Integer, Float>> cData2 = Controller.getFilteredData(country, denomData, startYear, endYear);
        HashMap<Integer, Float> ratioResult = new HashMap<>();

        for (Integer key : cData1.get(numData).keySet()) {
            if (cData2.get(denomData).keySet().contains(key)) {
                float c1DataPoint = cData1.get(numData).get(key);
                float c2DataPoint = cData2.get(denomData).get(key);
                if (c2DataPoint != 0.f) {
                    ratioResult.put(key, c1DataPoint / c2DataPoint);
                }
            }
        }
        result.put("Ratio", ratioResult);
        return result;
    }
}

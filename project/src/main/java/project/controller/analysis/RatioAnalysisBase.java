package project.controller.analysis;

import project.controller.APIController;

import java.util.HashMap;


public abstract class RatioAnalysisBase extends AnalysisBase {
    static protected String numData;
    static protected String denomData;

    /*
    * @param cData1 the data in the numerator for this analysis type
    * @param cData2 the data in the denominator for this analysis type
    * @return The hashmap containing the resulting analyzed data
    **/
    public HashMap<String, HashMap<Integer, Float>> getAnalyzedDataHelper(HashMap<String, HashMap<Integer, Float>> cData1, HashMap<String, HashMap<Integer, Float>> cData2) {
        HashMap<String, HashMap<Integer, Float>> result = new HashMap<String, HashMap<Integer, Float>>();
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

    /*
     * @return The processed data for this analysis type
     **/
    public HashMap<String, HashMap<Integer, Float>> getAnalyzedData() {
        HashMap<String, HashMap<Integer, Float>> cData1 = APIController.getFilteredData(country, numData, startYear, endYear);
        HashMap<String, HashMap<Integer, Float>> cData2 = APIController.getFilteredData(country, denomData, startYear, endYear);
        return getAnalyzedDataHelper(cData1, cData2);
    }
}

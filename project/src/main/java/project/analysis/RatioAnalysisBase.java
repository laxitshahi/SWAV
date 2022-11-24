package project.analysis;

import project.controller.Controller;

import java.util.HashMap;


public abstract class RatioAnalysisBase extends AnalysisBase {
    static protected String numData;
    static protected String denomData;

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

package project.analysis;

import project.controller.Controller;

import java.util.ArrayList;
import java.util.HashMap;

public class AverageAnalysisBase extends AnalysisBase {
    static protected String dataSeries;

    public HashMap<String, Float> getAnalyzedDataHelper(HashMap<String, HashMap<Integer, Float>> data) {
        HashMap<String, Float> result = new HashMap<String, Float>();
        if (data.keySet().size() != 0){
            String outerKey = (new ArrayList<String>(data.keySet())).get(0);
            Float sum = 0.f;
            int pointCount = 0;

            for (Integer yearKey : data.get(outerKey).keySet()) {
                pointCount++;
                sum += data.get(outerKey).get(yearKey);
            }
            if (pointCount != 0) {
                sum /= pointCount;
                result.put(outerKey, sum);
            }
            else {
                result.put(outerKey, 0.f);
            }
        }
        return result;
    }
    public HashMap<String, Float> getAnalyzedData() {
        HashMap<String, Float> result = new HashMap<>();
        HashMap<String, HashMap<Integer, Float>> cData1 = Controller.getFilteredData(country, dataSeries, startYear, endYear);
        return getAnalyzedDataHelper(cData1);
    }
}

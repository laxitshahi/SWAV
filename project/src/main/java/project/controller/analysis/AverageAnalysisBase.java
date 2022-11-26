package project.controller.analysis;

import project.controller.APIController;

import java.util.ArrayList;
import java.util.HashMap;

public class AverageAnalysisBase extends AnalysisBase<String, String, Float> {
    static protected String dataSeries;

    public HashMap<String, HashMap<String, Float>> getAnalyzedDataHelper(HashMap<String, HashMap<Integer, Float>> data) {
        HashMap<String, HashMap<String, Float>> result = new HashMap<String, HashMap<String, Float>>();
        HashMap<String, Float> average = new HashMap<String, Float>();
        result.put(country, average);
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
                average.put(dataSeries, sum);
            }
            else {
                average.put(dataSeries, 0.f);
            }
        }
        return result;
    }
    // Adjusts for compatibility with the chart classes
    public HashMap<String, HashMap<String, Float>> getAnalyzedData() {
        HashMap<String, Float> result = new HashMap<>();
        HashMap<String, HashMap<Integer, Float>> cData1 = APIController.getFilteredData(country, dataSeries, startYear, endYear);
        return getAnalyzedDataHelper(cData1);
    }
}

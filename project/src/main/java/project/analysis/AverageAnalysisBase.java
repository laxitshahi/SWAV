package project.analysis;

import project.controller.Controller;

import java.util.HashMap;

public class AverageAnalysisBase extends AnalysisBase {
    static protected String dataSeries;

    public HashMap<String, Float> getAnalyzedData() {
        HashMap<String, Float> result = new HashMap<>();
        HashMap<String, HashMap<Integer, Float>> cData1 = Controller.getFilteredData(country, dataSeries, startYear, endYear);
        Float sum = 0.f;
        int pointCount = 0;

        for (Integer yearKey : cData1.get(dataSeries).keySet()) {
            pointCount++;
            sum += cData1.get(dataSeries).get(yearKey);
        }
        sum /= pointCount;
        result.put(dataSeries, sum);
        return result;
    }
}

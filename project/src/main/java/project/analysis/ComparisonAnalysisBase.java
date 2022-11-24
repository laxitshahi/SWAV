package project.analysis;

import project.controller.Controller;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class ComparisonAnalysisBase extends AnalysisBase {
    static protected String country;
    static protected ArrayList<String> dataSeries;
    static protected String startYear;
    static protected String endYear;

    public HashMap<String, HashMap<Integer, Float>> getAnalyzedData() {
        HashMap<String, HashMap<Integer, Float>> result = new HashMap<String, HashMap<Integer, Float>>();
        for(String series : dataSeries){
            HashMap<String, HashMap<Integer, Float>> cData1 = Controller.getFilteredData(country, series, startYear, endYear);
            result.put(series, cData1.get(series));
        }
        return result;
    }
}

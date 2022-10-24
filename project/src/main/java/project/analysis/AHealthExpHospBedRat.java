package project.analysis;

import project.controller.Controller;
import project.util.IndicatorUtils;

import java.util.HashMap;

public class AHealthExpHospBedRat extends AnalysisBase {
    String c = "", dt1 = "healthexpenditure",
            dt2 = "hospitalbeds", start = "", end = "";

    public void config(String country, String startYear, String endYear) {
        c = country;
        start = startYear;
        end = endYear;
    }

    public HashMap<String, HashMap<Integer, Float>> getAnalyzedData() {
        return getRatioHelper(c, dt1, dt2, start, end);
    }
}

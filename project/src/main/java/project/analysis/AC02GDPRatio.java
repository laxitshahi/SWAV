package project.analysis;

import java.util.HashMap;

public class AC02GDPRatio extends AnalysisBase {
    String c = "", dt1 = "co2emissions",
            dt2 = "gdppercapita", start = "", end = "";

    public void config(String country, String startYear, String endYear) {
        c = country;
        start = startYear;
        end = endYear;
    }

    public HashMap<String, HashMap<Integer, Float>> getAnalyzedData() {
        return getRatioHelper(c, dt1, dt2, start, end);
    }
}
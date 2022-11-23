package project.analysis;

import java.util.HashMap;

public class AC02GDPRat extends RatioAnalysisBase {
    private AC02GDPRat(){};
    static private AC02GDPRat analysisObj = new AC02GDPRat();

    public AC02GDPRat getAnalysisObj(String country, String startYear, String endYear) {
        AC02GDPRat.country = country;
        AC02GDPRat.numData = "co2emissions";
        AC02GDPRat.denomData = "gdppercapita";
        AC02GDPRat.startYear = startYear;
        AC02GDPRat.endYear = endYear;
        return analysisObj;
    }
}
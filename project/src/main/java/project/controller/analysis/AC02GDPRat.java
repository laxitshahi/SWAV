package project.controller.analysis;

public class AC02GDPRat extends RatioAnalysisBase {
    private AC02GDPRat(){};
    static private AC02GDPRat analysisObj = new AC02GDPRat();

    static public AC02GDPRat getAnalysisObj(String country, String startYear, String endYear) {
        AC02GDPRat.country = country;
        AC02GDPRat.title = "C02 Emissions vs GDP Per Capita";
        AC02GDPRat.yAxisTitle = "Metric Tons Per $ Per Capita";
        AC02GDPRat.numData = "co2emissions";
        AC02GDPRat.denomData = "gdppercapita";
        AC02GDPRat.startYear = startYear;
        AC02GDPRat.endYear = endYear;
        return analysisObj;
    }
}
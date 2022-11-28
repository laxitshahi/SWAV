package project.controller.analysis;

import project.view.Charts.ChartCharacteristics.ChartType;

public class AC02GDPRat extends RatioAnalysisBase {
    private AC02GDPRat(){};
    static private AC02GDPRat analysisObj = new AC02GDPRat();

    static public AC02GDPRat getAnalysisObj(String country, String startYear, String endYear) {
        AC02GDPRat.country = country;
        title = "C02 Emissions vs GDP Per Capita";
        chartType = new ChartType(true, true, false);
        yAxisTitle = "Metric Tons Per $ Per Capita";
        numData = "co2emissions";
        denomData = "gdppercapita";
        AC02GDPRat.startYear = startYear;
        AC02GDPRat.endYear = endYear;
        return analysisObj;
    }
}
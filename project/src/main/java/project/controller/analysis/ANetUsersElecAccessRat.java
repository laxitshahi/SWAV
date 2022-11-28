package project.controller.analysis;

import project.view.Charts.ChartCharacteristics.ChartType;

public class ANetUsersElecAccessRat extends RatioAnalysisBase {
    private ANetUsersElecAccessRat(){};
    static private ANetUsersElecAccessRat analysisObj = new ANetUsersElecAccessRat();

    static public ANetUsersElecAccessRat getAnalysisObj(String country, String startYear, String endYear) {
        ANetUsersElecAccessRat.country = country;
        title = "Individuals Using The Internet vs Access to Electricity (Ratio)";
        numData = "indiviualsusinginternet";
        denomData = "accesstoelectricity";
        ANetUsersElecAccessRat.title = "Individuals Using The Internet vs Access to Electricity (Ratio)";
        ANetUsersElecAccessRat.chartType = new ChartType(true, true, false);
        ANetUsersElecAccessRat.numData = "indiviualsusinginternet";
        ANetUsersElecAccessRat.denomData = "accesstoelectricity";
        ANetUsersElecAccessRat.yAxisTitle = "Net Users Per Electricity User";
        ANetUsersElecAccessRat.startYear = startYear;
        ANetUsersElecAccessRat.endYear = endYear;
        return analysisObj;
    }
}

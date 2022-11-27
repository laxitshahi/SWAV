package project.analysis;

import project.view.Charts.ChartCharacteristics.ChartType;

import java.util.HashMap;

public class ANetUsersElecAccessRat extends RatioAnalysisBase {
    private ANetUsersElecAccessRat(){};
    static private ANetUsersElecAccessRat analysisObj = new ANetUsersElecAccessRat();

    static public ANetUsersElecAccessRat getAnalysisObj(String country, String startYear, String endYear) {
        ANetUsersElecAccessRat.country = country;
<<<<<<< Updated upstream:project/src/main/java/project/analysis/ANetUsersElecAccessRat.java
=======
        title = "Individuals Using The Internet vs Access to Electricity (Ratio)";
        numData = "indiviualsusinginternet";
        denomData = "accesstoelectricity";
>>>>>>> Stashed changes:project/src/main/java/project/controller/analysis/ANetUsersElecAccessRat.java
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

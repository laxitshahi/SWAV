package project.analysis;

import java.util.HashMap;

public class ANetUsersElecAccessRat extends RatioAnalysisBase {
    private ANetUsersElecAccessRat(){};
    static private ANetUsersElecAccessRat analysisObj = new ANetUsersElecAccessRat();

    static public ANetUsersElecAccessRat getAnalysisObj(String country, String startYear, String endYear) {
        ANetUsersElecAccessRat.country = country;
        ANetUsersElecAccessRat.title = "Individuals Using The Internet vs Access to Electricity (Ratio)";
        ANetUsersElecAccessRat.numData = "indiviualsusinginternet";
        ANetUsersElecAccessRat.denomData = "accesstoelectricity";
        ANetUsersElecAccessRat.yAxisTitle = "Net Users Per Electricity User";
        ANetUsersElecAccessRat.startYear = startYear;
        ANetUsersElecAccessRat.endYear = endYear;
        return analysisObj;
    }
}

package project.analysis;

import java.util.HashMap;

public class ANetUsersElecAccessRat extends RatioAnalysisBase {
    private ANetUsersElecAccessRat(){};
    static private ANetUsersElecAccessRat analysisObj = new ANetUsersElecAccessRat();

    static public ANetUsersElecAccessRat getAnalysisObj(String country, String startYear, String endYear) {
        RatioAnalysisBase.country = country;
        RatioAnalysisBase.numData = "indiviualsusinginternet";
        RatioAnalysisBase.denomData = "accesstoelectricity";
        RatioAnalysisBase.startYear = startYear;
        RatioAnalysisBase.endYear = endYear;
        return analysisObj;
    }
}

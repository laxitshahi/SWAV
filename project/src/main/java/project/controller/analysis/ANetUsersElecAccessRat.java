package project.controller.analysis;

public class ANetUsersElecAccessRat extends RatioAnalysisBase {
    private ANetUsersElecAccessRat(){};
    static private ANetUsersElecAccessRat analysisObj = new ANetUsersElecAccessRat();

    static public ANetUsersElecAccessRat getAnalysisObj(String country, String startYear, String endYear) {
        ANetUsersElecAccessRat.country = country;
        title = "Individuals Using The Internet vs Access to Electricity (Ratio)";
        numData = "indiviualsusinginternet";
        denomData = "accesstoelectricity";
        ANetUsersElecAccessRat.startYear = startYear;
        ANetUsersElecAccessRat.endYear = endYear;
        return analysisObj;
    }
}

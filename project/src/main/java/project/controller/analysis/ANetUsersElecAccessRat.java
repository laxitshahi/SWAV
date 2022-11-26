package project.controller.analysis;

public class ANetUsersElecAccessRat extends RatioAnalysisBase {
    private ANetUsersElecAccessRat(){};
    static private ANetUsersElecAccessRat analysisObj = new ANetUsersElecAccessRat();

    static public ANetUsersElecAccessRat getAnalysisObj(String country, String startYear, String endYear) {
        ANetUsersElecAccessRat.country = country;
<<<<<<< HEAD:project/src/main/java/project/controller/analysis/ANetUsersElecAccessRat.java
        title = "Individuals Using The Internet vs Access to Electricity (Ratio)";
        numData = "indiviualsusinginternet";
        denomData = "accesstoelectricity";
=======
        ANetUsersElecAccessRat.title = "Individuals Using The Internet vs Access to Electricity (Ratio)";
        ANetUsersElecAccessRat.numData = "indiviualsusinginternet";
        ANetUsersElecAccessRat.denomData = "accesstoelectricity";
        ANetUsersElecAccessRat.yAxisTitle = "Net Users Per Electricity User";
>>>>>>> 1d322981a7f952e801847668f40dbc4861ac5291:project/src/main/java/project/analysis/ANetUsersElecAccessRat.java
        ANetUsersElecAccessRat.startYear = startYear;
        ANetUsersElecAccessRat.endYear = endYear;
        return analysisObj;
    }
}

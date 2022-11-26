package project.controller.analysis;

public class AHealthExpHospBedRat extends RatioAnalysisBase {

    private AHealthExpHospBedRat(){};
    static private AHealthExpHospBedRat analysisObj = new AHealthExpHospBedRat();

    static public AHealthExpHospBedRat getAnalysisObj(String country, String startYear, String endYear) {
        AHealthExpHospBedRat.country = country;
<<<<<<< HEAD:project/src/main/java/project/controller/analysis/AHealthExpHospBedRat.java
        title = "Health Expenditure vs Hospital Beds (Ratio)";
        numData = "healthexpenditure";
        denomData = "hospitalbeds";
=======
        AHealthExpHospBedRat.title = "Health Expenditure vs Hospital Beds (Ratio)";
        AHealthExpHospBedRat.yAxisTitle = "$ Per Bed";
        AHealthExpHospBedRat.numData = "healthexpenditure";
        AHealthExpHospBedRat.denomData = "hospitalbeds";
>>>>>>> 1d322981a7f952e801847668f40dbc4861ac5291:project/src/main/java/project/analysis/AHealthExpHospBedRat.java
        AHealthExpHospBedRat.startYear = startYear;
        AHealthExpHospBedRat.endYear = endYear;
        return analysisObj;
    }
}

package project.analysis;

import project.controller.Controller;
import project.util.IndicatorUtils;
import project.view.Charts.ChartCharacteristics.ChartType;

import java.util.HashMap;

public class AHealthExpHospBedRat extends RatioAnalysisBase {

    private AHealthExpHospBedRat(){};
    static private AHealthExpHospBedRat analysisObj = new AHealthExpHospBedRat();

    static public AHealthExpHospBedRat getAnalysisObj(String country, String startYear, String endYear) {
        AHealthExpHospBedRat.country = country;
<<<<<<< Updated upstream:project/src/main/java/project/analysis/AHealthExpHospBedRat.java
        AHealthExpHospBedRat.chartType = new ChartType(true, true, false);
=======
        title = "Health Expenditure vs Hospital Beds (Ratio)";
        numData = "healthexpenditure";
        denomData = "hospitalbeds";
>>>>>>> Stashed changes:project/src/main/java/project/controller/analysis/AHealthExpHospBedRat.java
        AHealthExpHospBedRat.title = "Health Expenditure vs Hospital Beds (Ratio)";
        AHealthExpHospBedRat.yAxisTitle = "$ Per Bed";
        AHealthExpHospBedRat.numData = "healthexpenditure";
        AHealthExpHospBedRat.denomData = "hospitalbeds";
        AHealthExpHospBedRat.startYear = startYear;
        AHealthExpHospBedRat.endYear = endYear;
        return analysisObj;
    }
}

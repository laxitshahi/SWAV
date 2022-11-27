package project.analysis;

import java.util.ArrayList;
import java.util.HashMap;

import project.controller.Controller;
import project.view.Charts.ChartCharacteristics.ChartType;


public class AForestAreaAvg extends AverageAnalysisBase {
    private AForestAreaAvg(){};
    static private AForestAreaAvg analysisObj = new AForestAreaAvg();

    static public AForestAreaAvg getAnalysisObj(String country, String startYear, String endYear) {
        AForestAreaAvg.country = country;
<<<<<<< Updated upstream:project/src/main/java/project/analysis/AForestAreaAvg.java
        AForestAreaAvg.chartType = new ChartType(false, false, true);
=======
        dataSeries = "forestarea";
        title = String.format("Land Usage, Average From %s to %s", startYear, endYear);
>>>>>>> Stashed changes:project/src/main/java/project/controller/analysis/AForestAreaAvg.java
        AForestAreaAvg.dataSeries = "forestarea";
        AForestAreaAvg.yAxisTitle = "Percent";
        AForestAreaAvg.title = "Average Forest Area Usage";
        AForestAreaAvg.startYear = startYear;
        AForestAreaAvg.endYear = endYear;
        return analysisObj;
    }
}
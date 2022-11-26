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
        AForestAreaAvg.chartType = new ChartType(false, false, true);
        AForestAreaAvg.dataSeries = "forestarea";
        AForestAreaAvg.yAxisTitle = "Percent";
        AForestAreaAvg.title = "Average Forest Area Usage";
        AForestAreaAvg.startYear = startYear;
        AForestAreaAvg.endYear = endYear;
        return analysisObj;
    }
}
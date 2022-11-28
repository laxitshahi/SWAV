package project.controller.analysis;

import project.view.Charts.ChartCharacteristics.ChartType;


public class AForestAreaAvg extends AverageAnalysisBase {
    private AForestAreaAvg(){};
    static private AForestAreaAvg analysisObj = new AForestAreaAvg();

    static public AForestAreaAvg getAnalysisObj(String country, String startYear, String endYear) {
        AForestAreaAvg.country = country;
        chartType = new ChartType(false, false, true);
        dataSeries = "forestarea";
        title = String.format("Land Usage, Average From %s to %s", startYear, endYear);
        dataSeries = "forestarea";
        yAxisTitle = "Percent";
        title = "Average Forest Area Usage";
        AForestAreaAvg.startYear = startYear;
        AForestAreaAvg.endYear = endYear;
        return analysisObj;
    }
}
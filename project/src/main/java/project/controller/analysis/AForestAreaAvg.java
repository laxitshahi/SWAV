package project.controller.analysis;


public class AForestAreaAvg extends AverageAnalysisBase {
    private AForestAreaAvg(){};
    static private AForestAreaAvg analysisObj = new AForestAreaAvg();

    static public AForestAreaAvg getAnalysisObj(String country, String startYear, String endYear) {
        AForestAreaAvg.country = country;
<<<<<<< HEAD:project/src/main/java/project/controller/analysis/AForestAreaAvg.java
        dataSeries = "forestarea";
        title = String.format("Land Usage, Average From %s to %s", startYear, endYear);
=======
        AForestAreaAvg.dataSeries = "forestarea";
        AForestAreaAvg.yAxisTitle = "Percent";
        AForestAreaAvg.title = "Average Forest Area Usage";
>>>>>>> 1d322981a7f952e801847668f40dbc4861ac5291:project/src/main/java/project/analysis/AForestAreaAvg.java
        AForestAreaAvg.startYear = startYear;
        AForestAreaAvg.endYear = endYear;
        return analysisObj;
    }
}
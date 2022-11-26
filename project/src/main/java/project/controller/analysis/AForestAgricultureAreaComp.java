package project.controller.analysis;

import java.util.ArrayList;

// Simply fetch data and add to hashmap.
public class AForestAgricultureAreaComp extends ComparisonAnalysisBase {
    private AForestAgricultureAreaComp(){};
    static private AForestAgricultureAreaComp analysisObj = new AForestAgricultureAreaComp();

    static public AForestAgricultureAreaComp getAnalysisObj(String country, String startYear, String endYear) {
        AForestAgricultureAreaComp.country = country;
<<<<<<< HEAD:project/src/main/java/project/controller/analysis/AForestAgricultureAreaComp.java
        dataSeries = new ArrayList<String>();
        title = "Forest Area vs Agricultural Land";
        dataSeries.add("forestarea");
        dataSeries.add("agriculturalland");
=======
        AForestAgricultureAreaComp.dataSeries = new ArrayList<String>();
        AForestAgricultureAreaComp.title = "Forest Area vs Agricultural Land";
        AForestAgricultureAreaComp.yAxisTitle = "% Area";
        AForestAgricultureAreaComp.dataSeries.add("forestarea");
        AForestAgricultureAreaComp.dataSeries.add("agriculturalland");
>>>>>>> 1d322981a7f952e801847668f40dbc4861ac5291:project/src/main/java/project/analysis/AForestAgricultureAreaComp.java
        AForestAgricultureAreaComp.startYear = startYear;
        AForestAgricultureAreaComp.endYear = endYear;
        return analysisObj;
    }
}
package project.analysis;

import project.view.Charts.ChartCharacteristics.ChartType;

import java.util.ArrayList;
import java.util.HashMap;

// Simply fetch data and add to hashmap.
public class AForestAgricultureAreaComp extends ComparisonAnalysisBase {
    private AForestAgricultureAreaComp(){};
    static private AForestAgricultureAreaComp analysisObj = new AForestAgricultureAreaComp();

    static public AForestAgricultureAreaComp getAnalysisObj(String country, String startYear, String endYear) {
        AForestAgricultureAreaComp.country = country;
<<<<<<< Updated upstream:project/src/main/java/project/analysis/AForestAgricultureAreaComp.java
=======
        dataSeries = new ArrayList<String>();
        title = "Forest Area vs Agricultural Land";
        dataSeries.add("forestarea");
        dataSeries.add("agriculturalland");
>>>>>>> Stashed changes:project/src/main/java/project/controller/analysis/AForestAgricultureAreaComp.java
        AForestAgricultureAreaComp.dataSeries = new ArrayList<String>();
        AForestAgricultureAreaComp.chartType = new ChartType(true, true, false);
        AForestAgricultureAreaComp.title = "Forest Area vs Agricultural Land";
        AForestAgricultureAreaComp.yAxisTitle = "% Area";
        AForestAgricultureAreaComp.dataSeries.add("forestarea");
        AForestAgricultureAreaComp.dataSeries.add("agriculturalland");
        AForestAgricultureAreaComp.startYear = startYear;
        AForestAgricultureAreaComp.endYear = endYear;
        return analysisObj;
    }
}
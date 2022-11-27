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
        dataSeries = new ArrayList<String>();
        title = "Forest Area vs Agricultural Land";
        dataSeries.add("forestarea");
        dataSeries.add("agriculturalland");

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
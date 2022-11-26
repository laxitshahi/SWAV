package project.controller.analysis;

import java.util.ArrayList;

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
        AForestAgricultureAreaComp.startYear = startYear;
        AForestAgricultureAreaComp.endYear = endYear;
        return analysisObj;
    }
}
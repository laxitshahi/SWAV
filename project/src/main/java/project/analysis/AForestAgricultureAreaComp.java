package project.analysis;

import java.util.ArrayList;
import java.util.HashMap;

// Simply fetch data and add to hashmap.
public class AForestAgricultureAreaComp extends ComparisonAnalysisBase {
    private AForestAgricultureAreaComp(){};
    static private AForestAgricultureAreaComp analysisObj = new AForestAgricultureAreaComp();

    static public AForestAgricultureAreaComp getAnalysisObj(String country, String startYear, String endYear) {
        ComparisonAnalysisBase.country = country;
        ComparisonAnalysisBase.dataSeries = new ArrayList<String>();
        ComparisonAnalysisBase.dataSeries.add("forestarea");
        ComparisonAnalysisBase.dataSeries.add("agriculturalland");
        ComparisonAnalysisBase.startYear = startYear;
        ComparisonAnalysisBase.endYear = endYear;
        return analysisObj;
    }
}
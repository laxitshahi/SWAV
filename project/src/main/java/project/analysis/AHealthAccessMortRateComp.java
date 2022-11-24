package project.analysis;

import java.util.ArrayList;
import java.util.HashMap;

// Simply fetch data and add to hashmap.
public class AHealthAccessMortRateComp extends ComparisonAnalysisBase {
    private AHealthAccessMortRateComp(){};
    static private AHealthAccessMortRateComp analysisObj = new AHealthAccessMortRateComp();

    static public AHealthAccessMortRateComp getAnalysisObj(String country, String startYear, String endYear) {
        ComparisonAnalysisBase.country = country;
        ComparisonAnalysisBase.dataSeries = new ArrayList<String>();
        ComparisonAnalysisBase.dataSeries.add("mortalityinfant");
        //ComparisonAnalysisBase.dataSeries.add("mortalityinfant");
        ComparisonAnalysisBase.startYear = startYear;
        ComparisonAnalysisBase.endYear = endYear;
        return analysisObj;
    }
}
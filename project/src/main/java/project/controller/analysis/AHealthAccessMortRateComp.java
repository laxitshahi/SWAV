package project.controller.analysis;

import java.util.ArrayList;

// Simply fetch data and add to hashmap.
public class AHealthAccessMortRateComp extends ComparisonAnalysisBase {
    private AHealthAccessMortRateComp(){};
    static private AHealthAccessMortRateComp analysisObj = new AHealthAccessMortRateComp();

    static public AHealthAccessMortRateComp getAnalysisObj(String country, String startYear, String endYear) {
        AHealthAccessMortRateComp.country = country;
        AHealthAccessMortRateComp.dataSeries = new ArrayList<String>();
        AHealthAccessMortRateComp.title = "Problems in Accessing Health Care vs Infant Mortality";
        AHealthAccessMortRateComp.yAxisTitle = "% of Women, Mort. Rate";
        AHealthAccessMortRateComp.dataSeries.add("problemsaccessinghealthcare");
        AHealthAccessMortRateComp.dataSeries.add("mortalityinfant");
        AHealthAccessMortRateComp.startYear = startYear;
        AHealthAccessMortRateComp.endYear = endYear;
        return analysisObj;
    }
}
package project.analysis;

import java.util.ArrayList;
import java.util.HashMap;

// Simply fetch data and add to hashmap.
public class AMethaneC02DisasterComp extends ComparisonAnalysisBase {
    private AMethaneC02DisasterComp(){};
    static private AMethaneC02DisasterComp analysisObj = new AMethaneC02DisasterComp();

    static public AMethaneC02DisasterComp getAnalysisObj(String country, String startYear, String endYear) {
        ComparisonAnalysisBase.country = country;
        ComparisonAnalysisBase.dataSeries = new ArrayList<String>();
        ComparisonAnalysisBase.dataSeries.add("methaneemissions");
        ComparisonAnalysisBase.dataSeries.add("co2emissions");
        ComparisonAnalysisBase.dataSeries.add("droughtsfloodsextremetemps");
        ComparisonAnalysisBase.startYear = startYear;
        ComparisonAnalysisBase.endYear = endYear;
        return analysisObj;
    }
}

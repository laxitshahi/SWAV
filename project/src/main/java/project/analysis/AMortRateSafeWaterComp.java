package project.analysis;

import java.util.ArrayList;
import java.util.HashMap;

// Simply fetch data and add to hashmap.
public class AMortRateSafeWaterComp extends ComparisonAnalysisBase {
    private AMortRateSafeWaterComp(){};
    static private AMortRateSafeWaterComp analysisObj = new AMortRateSafeWaterComp();

    static public AMortRateSafeWaterComp getAnalysisObj(String country, String startYear, String endYear) {
        ComparisonAnalysisBase.country = country;
        ComparisonAnalysisBase.dataSeries = new ArrayList<String>();
        ComparisonAnalysisBase.dataSeries.add("mortalityunder5");
        ComparisonAnalysisBase.dataSeries.add("usingwatermanaged");
        ComparisonAnalysisBase.startYear = startYear;
        ComparisonAnalysisBase.endYear = endYear;
        return analysisObj;
    }
}

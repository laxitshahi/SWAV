package project.analysis;

import project.view.Charts.ChartCharacteristics.ChartType;

import java.util.ArrayList;
import java.util.HashMap;

// Simply fetch data and add to hashmap.
public class AMortRateSafeWaterComp extends ComparisonAnalysisBase {
    private AMortRateSafeWaterComp(){};
    static private AMortRateSafeWaterComp analysisObj = new AMortRateSafeWaterComp();

    static public AMortRateSafeWaterComp getAnalysisObj(String country, String startYear, String endYear) {
        AMortRateSafeWaterComp.country = country;
<<<<<<< Updated upstream:project/src/main/java/project/analysis/AMortRateSafeWaterComp.java
        AMortRateSafeWaterComp.chartType = new ChartType(true, true, false);
=======
        dataSeries = new ArrayList<String>();
        title = "Mortality Rate vs People Using Safely Managed Drinking Water Serices";
        dataSeries.add("mortalityunder5");
        dataSeries.add("usingwatermanaged");
>>>>>>> Stashed changes:project/src/main/java/project/controller/analysis/AMortRateSafeWaterComp.java
        AMortRateSafeWaterComp.dataSeries = new ArrayList<String>();
        AMortRateSafeWaterComp.yAxisTitle = "% of Pop., Mort. Rate";
        AMortRateSafeWaterComp.title = "Mortality Rate vs People Using Safely Managed Drinking Water Services";
        AMortRateSafeWaterComp.dataSeries.add("mortalityunder5");
        AMortRateSafeWaterComp.dataSeries.add("usingwatermanaged");
        AMortRateSafeWaterComp.startYear = startYear;
        AMortRateSafeWaterComp.endYear = endYear;
        return analysisObj;
    }
}

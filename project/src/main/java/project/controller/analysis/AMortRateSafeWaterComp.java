package project.controller.analysis;

import java.util.ArrayList;

// Simply fetch data and add to hashmap.
public class AMortRateSafeWaterComp extends ComparisonAnalysisBase {
    private AMortRateSafeWaterComp(){};
    static private AMortRateSafeWaterComp analysisObj = new AMortRateSafeWaterComp();

    static public AMortRateSafeWaterComp getAnalysisObj(String country, String startYear, String endYear) {
        AMortRateSafeWaterComp.country = country;
<<<<<<< HEAD:project/src/main/java/project/controller/analysis/AMortRateSafeWaterComp.java
        dataSeries = new ArrayList<String>();
        title = "Mortality Rate vs People Using Safely Managed Drinking Water Serices";
        dataSeries.add("mortalityunder5");
        dataSeries.add("usingwatermanaged");
=======
        AMortRateSafeWaterComp.dataSeries = new ArrayList<String>();
        AMortRateSafeWaterComp.yAxisTitle = "% of Pop., Mort. Rate";
        AMortRateSafeWaterComp.title = "Mortality Rate vs People Using Safely Managed Drinking Water Services";
        AMortRateSafeWaterComp.dataSeries.add("mortalityunder5");
        AMortRateSafeWaterComp.dataSeries.add("usingwatermanaged");
>>>>>>> 1d322981a7f952e801847668f40dbc4861ac5291:project/src/main/java/project/analysis/AMortRateSafeWaterComp.java
        AMortRateSafeWaterComp.startYear = startYear;
        AMortRateSafeWaterComp.endYear = endYear;
        return analysisObj;
    }
}

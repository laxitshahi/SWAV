package project.controller.analysis;

import project.view.Charts.ChartCharacteristics.ChartType;

import java.util.ArrayList;

// Simply fetch data and add to hashmap.
public class AMortRateSafeWaterComp extends ComparisonAnalysisBase {
    private AMortRateSafeWaterComp(){};
    static private AMortRateSafeWaterComp analysisObj = new AMortRateSafeWaterComp();

    static public AMortRateSafeWaterComp getAnalysisObj(String country, String startYear, String endYear) {
        AMortRateSafeWaterComp.country = country;
        chartType = new ChartType(true, true, false);
        dataSeries = new ArrayList<String>();
        title = "Mortality Rate vs People Using Safely Managed Drinking Water Serices";
        dataSeries.add("mortalityunder5");
        dataSeries.add("usingwatermanaged");
        dataSeries = new ArrayList<String>();
        yAxisTitle = "% of Pop., Mort. Rate";
        title = "Mortality Rate vs People Using Safely Managed Drinking Water Services";
        dataSeries.add("mortalityunder5");
        dataSeries.add("usingwatermanaged");
        AMortRateSafeWaterComp.startYear = startYear;
        AMortRateSafeWaterComp.endYear = endYear;
        return analysisObj;
    }
}

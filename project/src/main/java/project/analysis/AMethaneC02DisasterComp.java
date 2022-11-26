package project.analysis;

import java.util.ArrayList;
import java.util.HashMap;

// Simply fetch data and add to hashmap.
public class AMethaneC02DisasterComp extends ComparisonAnalysisBase {
    private AMethaneC02DisasterComp(){};
    static private AMethaneC02DisasterComp analysisObj = new AMethaneC02DisasterComp();

    static public AMethaneC02DisasterComp getAnalysisObj(String country, String startYear, String endYear) {
        AMethaneC02DisasterComp.country = country;
        AMethaneC02DisasterComp.dataSeries = new ArrayList<String>();
        AMethaneC02DisasterComp.title = "Methane and CO2 Emissions vs Droughts Floods and Extreme Temperatures";
        AMortRateSafeWaterComp.yAxisTitle = "Tons Per Cap, % of Pop";
        AMethaneC02DisasterComp.dataSeries.add("methaneemissions");
        AMethaneC02DisasterComp.dataSeries.add("co2emissions");
        AMethaneC02DisasterComp.dataSeries.add("droughtsfloodsextremetemps");
        AMethaneC02DisasterComp.startYear = startYear;
        AMethaneC02DisasterComp.endYear = endYear;
        return analysisObj;
    }
}

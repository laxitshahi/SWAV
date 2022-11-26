package project.controller.analysis;

import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.plot.PlotOrientation;
import project.view.Charts.ChartCharacteristics.ChartProperties;
import project.view.Charts.ChartCharacteristics.ChartType;
import project.view.Charts.ChartMed;

/**
 * The base class of all analysis types.
 * Maintains both a list of years and viewers for which this analysis is valid.
 */
abstract public class AnalysisBase<K, T, V> {
    static protected String country;
    static protected String startYear;
    static protected String endYear;
    static protected String title;
    static protected String yAxisTitle;
    /**
     * Stores the years for which analysis cannot be performed, loaded in at initialization time
     */
    protected ArrayList<Integer> invalidYears = new ArrayList<Integer>();

    /**
     * Stores the string representation of the valid possible viewers for the analysis type, specified at
     * initialization time.
     */
    protected ArrayList<String> validViewers = new ArrayList<String>();

//    protected HashMap<K, ArrayList<HashMap<T, V>>> convertToGraphFormat(HashMap<K, HashMap<T, V>> preData) {
//        HashMap<K, ArrayList<HashMap<T, V>>> result = new HashMap<K, ArrayList<HashMap<T, V>>>();
//        for (K outerKey : preData.keySet()) {
//            ArrayList<HashMap<T, V>> innerList = new ArrayList<>();
//            result.put(outerKey, innerList);
//            for (T innerKey : preData.get(outerKey).keySet()) {
//                HashMap<T, V> innerMap = new HashMap<T, V>();
//                innerMap.put(innerKey, preData.get(outerKey).get(innerKey));
//                innerList.add(innerMap);
//            }
//        }
//        return result;
//    }

    public abstract HashMap<K, HashMap<T, V>> getAnalyzedData();
    public void startGen(ChartType chartType) {
        HashMap<K, HashMap<T, V>> data = getAnalyzedData();
        ChartProperties chartProperties = new ChartProperties(data.keySet().size(), title, "Year", yAxisTitle, PlotOrientation.VERTICAL, true, true, false);

        var chartMed = new ChartMed<>(chartType, data, chartProperties);
        chartMed.genCharts();
    }


}

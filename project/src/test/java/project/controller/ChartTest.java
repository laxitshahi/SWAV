package project.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.plot.PlotOrientation;
import org.junit.Test;

import project.view.Charts.ChartMed;
import project.view.Charts.ChartCharacteristics.ChartProperties;
import project.view.Charts.ChartCharacteristics.ChartType;

public class ChartTest {
    public static void main(String[] args) {
        HashMap<String, HashMap<Integer, Integer>> data = genDataExample();
        ChartProperties chartProperties = genChartPropertiesExample();

        var chartMed = new ChartMed<>(new ChartType(true, true, true), data, chartProperties);
        chartMed.genCharts();
    }

    public void testCharts(ChartType chartType) {
        HashMap<String, HashMap<Integer, Integer>> data = genDataExample();
        ChartProperties chartProperties = genChartPropertiesExample();

        var chartMed = new ChartMed<>(chartType, data, chartProperties);
        chartMed.genCharts();
    }

    @Test
    public static <K, T, V> HashMap<K, HashMap<T, V>> genDataExample() {
        HashMap<K, HashMap<T, V>> data = new HashMap<>();

        HashMap<T, V> yorkMap = new HashMap<>();
        yorkMap.put((T) "Gold", (V) ((Object) 10));
        yorkMap.put((T) "Silver", (V) ((Object) 20));
        yorkMap.put((T) "Bronze", (V) ((Object) 30));
        data.put((K) "York", yorkMap);

        HashMap<T, V> torontoMap = new HashMap<>();
        torontoMap.put((T) "Gold", (V) ((Object) 40));
        torontoMap.put((T) "Silver", (V) ((Object) 50));
        torontoMap.put((T) "Bronze", (V) ((Object) 60));
        data.put((K) "Toronto", torontoMap);
    
 
        return data;
    }

    // make sure series is the same for all data (must be less than or equal to the number of data points per entry)
    public static ChartProperties genChartPropertiesExample() {
        return new ChartProperties(3, "Canada MONEYS", "Country", "Medals", PlotOrientation.VERTICAL, true, true, false);
    }
}


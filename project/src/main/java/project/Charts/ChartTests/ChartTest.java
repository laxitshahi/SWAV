package project.Charts.ChartTests;

import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.plot.PlotOrientation;

import project.Charts.ChartMed;
import project.Charts.ChartCharacteristics.ChartProperties;
import project.Charts.ChartCharacteristics.ChartType;

public class ChartTest {
    public static void main(String[] args) {
        HashMap<String, ArrayList<HashMap<String, Integer>>> data = genDataExample();
        ChartProperties chartProperties = genChartPropertiesExample();

        var chartMed = new ChartMed<>(new ChartType(true, false, false), data, chartProperties);
        chartMed.genCharts();
    }
    
    public static HashMap<String, ArrayList<HashMap<String, Integer>>> genDataExample() {
        HashMap<String, ArrayList<HashMap<String, Integer>>> data = new HashMap<>();

        ArrayList<HashMap<String, Integer>> YorkList = new ArrayList<>();
        YorkList.add(new HashMap<>(){{put("Gold", 4);}});
        YorkList.add(new HashMap<>(){{put("Silver", 8);}});
        YorkList.add(new HashMap<>(){{put("Bronze", 13);}});

        ArrayList<HashMap<String, Integer>> TorontoList = new ArrayList<>();
        TorontoList.add(new HashMap<>(){{put("Gold", 2);}});
        TorontoList.add(new HashMap<>(){{put("Silver", 7);}});
        TorontoList.add(new HashMap<>(){{put("Bronze", 14);}});

        data.put("York", YorkList);
        data.put("Toronto", TorontoList);

        return data;
    }

    // make sure series is the same for all data (must be less than or equal to the number of data points per entry)
    public static ChartProperties genChartPropertiesExample() {
        return new ChartProperties(3, "Sports", "Country", "Medals", PlotOrientation.VERTICAL, true, true, false);
    }
}


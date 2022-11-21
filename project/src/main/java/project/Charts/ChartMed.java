package project.Charts;

import java.util.ArrayList;
import java.util.HashMap;

import project.Charts.ChartCharacteristics.ChartProperties;
import project.Charts.ChartCharacteristics.ChartType;

public class ChartMed<K, V> {
    private ChartType chartType;
    private ChartProperties chartProperties;
    private HashMap<K, ArrayList<HashMap<K, V>>> data;

    /**
     * takes in the types of charts to produce, the data, and chart properties
     * The data is structure as HashMap<K, ArrayList<HashMap<K, V>>>
     *     For ex, for a 3 series, York -> {["Gold", 3], ["Silver", 6], ["Bronze", 8]}
     *
     * @param chartType
     * @param data
     * @param chartProperties
     */
    public ChartMed(ChartType chartType, HashMap<K, ArrayList<HashMap<K, V>>> data, ChartProperties chartProperties) {
        this.chartType = chartType;
        this.data = data;
        this.chartProperties = chartProperties;
    }
     

    /**
     * generates charts based on the valid chart types
     */
    // TODO is there a better way to design this?
    public void genCharts() {
        if(chartType.BarChart) {
            BarChart barChart = new BarChart<>(chartProperties, data);
            barChart.setVisible(true);
        }
        // if(chartType.LineChart) {
        //     LineChart lineChart = new LineChart(chartProperties, data);
        //     lineChart.setVisible(true);
        // }
        // if(chartType.PieChart) {
        //     PieChart pieChart = new PieChart(chartProperties, data);
        //     pieChart.setVisible(true);
        // }
    }
}

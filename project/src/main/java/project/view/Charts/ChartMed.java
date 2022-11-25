package project.view.Charts;

import java.util.ArrayList;
import java.util.HashMap;

import project.view.Charts.ChartCharacteristics.ChartProperties;
import project.view.Charts.ChartCharacteristics.ChartType;
import project.view.Charts.ChartTypes.BarChart;
import project.view.Charts.ChartTypes.LineChart;
import project.view.Charts.ChartTypes.PieChart;

public class ChartMed<K, V, T, E> {
    private ChartType chartType;
    private ChartProperties chartProperties;
    private HashMap<K, ArrayList<HashMap<T, V>>> data;

    public ChartMed(ChartType chartType, HashMap<K, ArrayList<HashMap<T, V>>> data, ChartProperties chartProperties) {
        this.chartType = chartType;
        this.data = data;
        this.chartProperties = chartProperties;
    }
     
    public void genCharts() {
        if(chartType.BarChart) {
            BarChart<K, V, T, E> barChart = new BarChart<>(chartProperties, data);
            // barChart.setVisible(true);
        }
        if(chartType.LineChart) {
            LineChart<K, V, T, E> lineChart = new LineChart<>(chartProperties, data);
            // lineChart.setVisible(true);
        }
        if(chartType.PieChart) {
            PieChart<K, V, T, E> pieChart = new PieChart<>(chartProperties, data);
            // pieChart.setVisible(true);
        }
    }
}

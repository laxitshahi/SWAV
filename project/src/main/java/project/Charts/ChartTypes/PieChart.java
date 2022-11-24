package project.Charts.ChartTypes;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import project.Charts.ChartCharacteristics.ChartProperties;

public class PieChart<K, V, T, E> extends Chart<K, V, T, E> {

    public PieChart(ChartProperties chartProperties, HashMap<K, ArrayList<HashMap<T, V>>> data) {
        E dataset = this.createDataset(data, chartProperties.series);
        JFreeChart chart = this.createChart(chartProperties, dataset);
        this.initUI(chart, BorderLayout.LINE_END);
    }

    /**
     * Percentage of the pie chart must sum to 100
     */
    public E createDataset(HashMap<K, ArrayList<HashMap<T, V>>> data, int series) {
        // go through keys in data
        E dataset = (E) new DefaultPieDataset();
        
        for(K key : data.keySet()) {
            for(HashMap<T, V> map : data.get(key)) {
                ((DefaultPieDataset) dataset).setValue(map.keySet().toArray()[0].toString(), (Number) map.get(map.keySet().toArray()[0]));
            }
        }

        return dataset;
    }

    public JFreeChart createChart(ChartProperties chartProperties, E dataset) {
        return ChartFactory.createPieChart(chartProperties.title, (DefaultPieDataset) dataset, chartProperties.legend, chartProperties.tooltips, chartProperties.url);
    }
    
}

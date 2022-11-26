package project.view.Charts.ChartTypes;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import project.view.Charts.ChartCharacteristics.ChartProperties;
import project.view.Charts.ChartCharacteristics.ChartType;

public class PieChart<K, V, T, E> extends Chart<K, V, T, E> {

    public PieChart(ChartProperties chartProperties, HashMap<K, HashMap<T, V>> data) {
        E dataset = this.createDataset(data, chartProperties.series);
        JFreeChart chart = this.createChart(chartProperties, dataset);
        this.initUI(chart, new ChartType(false, false, true));
    }

    /**
     * Percentage of the pie chart must sum to 100
     */
    public E createDataset(HashMap<K, HashMap<T, V>> data, int series) {
        // go through keys in data
        E dataset = (E) new DefaultPieDataset();
        
        for(K key : data.keySet()) {
            for(T innerKey : data.get(key).keySet()) {
                ((DefaultPieDataset) dataset).setValue(innerKey.toString(), (Number) data.get(key).get(innerKey));
            }
        }

        return dataset;
    }

    public JFreeChart createChart(ChartProperties chartProperties, E dataset) {
        return ChartFactory.createPieChart(chartProperties.title, (DefaultPieDataset) dataset, chartProperties.legend, chartProperties.tooltips, chartProperties.url);
    }
    
}

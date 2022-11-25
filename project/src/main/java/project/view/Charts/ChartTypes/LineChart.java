package project.view.Charts.ChartTypes;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;

import project.view.Charts.ChartCharacteristics.ChartProperties;
import project.view.Charts.ChartCharacteristics.ChartType;

public class LineChart<K, V, T, E> extends Chart<K, V, T, E> {

    public LineChart(ChartProperties chartProperties, HashMap<K, HashMap<T, V>> data) {
        E dataset = this.createDataset(data, chartProperties.series);
        JFreeChart chart = this.createChart(chartProperties, dataset);
        this.initUI(chart, new ChartType(false, true, false));
    }

    public E createDataset(HashMap<K, HashMap<T, V>> data, int series) {
        E dataset = (E) new DefaultXYDataset();

        // iterate through the data hashmap
        for(K key : data.keySet()) {
            // create a new XYSeries for each key
            XYSeries series1 = new XYSeries(key.toString());
            // iterate through the arraylist of hashmaps
            for(T innerKey : data.get(key).keySet()) {
                // add the data to the XYSeries
                series1.add((Number) innerKey, (Number) data.get(key).get(innerKey));
            }
            ((DefaultXYDataset) dataset).addSeries(key.toString(), series1.toArray());
        }
        
        return dataset;
    }

    public JFreeChart createChart(ChartProperties chartProperties, E dataset) {
        return ChartFactory.createXYLineChart(chartProperties.title, chartProperties.categoryAxisLabel, chartProperties.valueAxisLabel, (XYDataset) dataset, chartProperties.orientation, chartProperties.legend, chartProperties.tooltips, chartProperties.url);
    }
}

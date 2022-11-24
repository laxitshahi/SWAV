package project.Charts.ChartTypes;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import project.Charts.ChartCharacteristics.ChartProperties;

public class LineChart<K, V, T, E> extends Chart<K, V, T, E> {

    public LineChart(ChartProperties chartProperties, HashMap<K, ArrayList<HashMap<T, V>>> data) {
        E dataset = this.createDataset(data, chartProperties.series);
        JFreeChart chart = this.createChart(chartProperties, dataset);
        this.initUI(chart, BorderLayout.CENTER);
    }

    public E createDataset(HashMap<K, ArrayList<HashMap<T, V>>> data, int series) {
        E dataset = (E) new DefaultXYDataset();

        // iterate through the data hashmap
        for(K key : data.keySet()) {
            // create a new XYSeries for each key
            XYSeries series1 = new XYSeries(key.toString());
            // iterate through the arraylist of hashmaps
            for(HashMap<T, V> map : data.get(key)) {
                // add the data to the XYSeries
                series1.add((Number) map.keySet().toArray()[0], (Number) map.get(map.keySet().toArray()[0]));
            }
            ((DefaultXYDataset) dataset).addSeries(key.toString(), series1.toArray());
        }
        
        return dataset;
    }

    public JFreeChart createChart(ChartProperties chartProperties, E dataset) {
        return ChartFactory.createXYLineChart(chartProperties.title, chartProperties.categoryAxisLabel, chartProperties.valueAxisLabel, (XYDataset) dataset, chartProperties.orientation, chartProperties.legend, chartProperties.tooltips, chartProperties.url);
    }
}

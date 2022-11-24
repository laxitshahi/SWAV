package project.Charts.ChartTypes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import project.Charts.ChartCharacteristics.ChartProperties;
import javax.swing.JFrame;

public class BarChart<K, V, T, E> extends Chart<K, V, T, E> {

    public BarChart(ChartProperties chartProperties, HashMap<K, ArrayList<HashMap<T, V>>> data) {
        E dataset = this.createDataset(data, chartProperties.series);
        JFreeChart chart = this.createChart(chartProperties, dataset);
        this.initUI(chart, BorderLayout.LINE_START);
    }

    public E createDataset(HashMap<K, ArrayList<HashMap<T, V>>> data, int series) {
        E dataset = (E) new DefaultCategoryDataset();
        
        for(K key : data.keySet()) {
            for(int i = 0; i < series; i++) {
                ((DefaultCategoryDataset) dataset).setValue((Number) data.get(key).get(i).get(data.get(key).get(i).keySet().toArray()[0]) , data.get(key).get(i).keySet().toArray()[0].toString() , key.toString());
            }
        }
        
        return dataset;
    }

    public JFreeChart createChart(ChartProperties chartProperties, E dataset) {
        return ChartFactory.createBarChart(chartProperties.title, chartProperties.categoryAxisLabel, chartProperties.valueAxisLabel, (CategoryDataset) dataset, chartProperties.orientation, chartProperties.legend, chartProperties.tooltips, chartProperties.url);
    }
}

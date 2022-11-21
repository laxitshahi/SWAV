package project.Charts;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import project.Charts.ChartCharacteristics.ChartProperties;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class BarChart<K, V> extends JFrame {

    public BarChart(ChartProperties chartProperties, HashMap<K, ArrayList<HashMap<K, V>>> data) {
        initUI(chartProperties, data);
    }

    private void initUI(ChartProperties chartProperties, HashMap<K, ArrayList<HashMap<K, V>>> data) {
        CategoryDataset dataset = createDataset(data, chartProperties.series);

        JFreeChart chart = createChart(chartProperties.title, dataset, chartProperties.categoryAxisLabel, chartProperties.valueAxisLabel, chartProperties.orientation, chartProperties.legend, chartProperties.tooltips, chartProperties.url);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private CategoryDataset createDataset(HashMap<K, ArrayList<HashMap<K, V>>> data, int series) {
        var dataset = new DefaultCategoryDataset();
        
        for(K key : data.keySet()) {
            for(int i = 0; i < series; i++) {
                dataset.setValue((Number) data.get(key).get(i).get(data.get(key).get(i).keySet().toArray()[0]) , data.get(key).get(i).keySet().toArray()[0].toString() , key.toString());
            }
        }
        
        return dataset;
    }

    private JFreeChart createChart(String title, CategoryDataset dataset, String categoryAxisLabel, String valueAxisLabel, PlotOrientation orientation, boolean legend, boolean tooltips, boolean url) {
        JFreeChart barChart = ChartFactory.createBarChart(
                title,
                categoryAxisLabel,
                valueAxisLabel,
                dataset,
                orientation,
                legend, tooltips, url);

        return barChart;
    }   
}

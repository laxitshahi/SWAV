package project.Charts.ChartTypes;

import java.util.HashMap;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

import project.Charts.ChartCharacteristics.ChartProperties;

public class BarChart implements Chart<> {



    // public BarChart(ChartProperties chartProperties, HashMap<K, ArrayList<HashMap<K, V>>> data) {
    //     CategoryDataset dataset = this.createDataset(data, chartProperties.series);
    //     JFreeChart chart = this.createChart(chartProperties, dataset);
    //     this.initUI(chart);
    // }

    // public CategoryDataset createDataset(HashMap<K, ArrayList<HashMap<K, V>>> data, int series) {
    //     var dataset = new DefaultCategoryDataset();
        
    //     for(K key : data.keySet()) {
    //         for(int i = 0; i < series; i++) {
    //             dataset.setValue((Number) data.get(key).get(i).get(data.get(key).get(i).keySet().toArray()[0]) , data.get(key).get(i).keySet().toArray()[0].toString() , key.toString());
    //         }
    //     }
        
    //     return dataset;
    // }

    // public JFreeChart createChart(ChartProperties chartProperties, CategoryDataset dataset) {
    //     return ChartFactory.createBarChart(chartProperties.title, chartProperties.categoryAxisLabel, chartProperties.valueAxisLabel, dataset, chartProperties.orientation, chartProperties.legend, chartProperties.tooltips, chartProperties.url);
    // }

    // public void initUI(JFreeChart chart) {
    //     ChartPanel chartPanel = new ChartPanel(chart);
    //     chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    //     chartPanel.setBackground(Color.white);
    //     add(chartPanel);

    //     pack();
    //     setLocationRelativeTo(null);
    //     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // }
}

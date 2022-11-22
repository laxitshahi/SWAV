package project.Charts.ChartTypes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import project.Charts.ChartCharacteristics.ChartProperties;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public abstract class Chart<K, V, T, E> extends JFrame {
    public abstract E createDataset(HashMap<K, ArrayList<HashMap<T, V>>> data, int series);

    public abstract JFreeChart createChart(ChartProperties chartProperties, E dataset);

    public void initUI(JFreeChart chart) {
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
}

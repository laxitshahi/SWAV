package project.view.Charts.ChartTypes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import project.view.Charts.ChartCharacteristics.ChartProperties;
import project.view.Charts.ChartCharacteristics.ChartType;
import project.view.MainUI;
import project.view.WelcomePage;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public abstract class Chart<K, V, T, E> extends JFrame {
    public abstract E createDataset(HashMap<K, HashMap<T, V>> data, int series);

    public abstract JFreeChart createChart(ChartProperties chartProperties, E dataset);

    public void initUI(JFreeChart chart, ChartType ct) {
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        
        MainUI.getInstance().addChart(chartPanel, ct);
        // pack();
        // validate();
        // setLocationRelativeTo(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
}

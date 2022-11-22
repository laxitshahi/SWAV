package project.Charts.ChartTypes;

import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.JFreeChart;

import project.Charts.ChartCharacteristics.ChartProperties;

public interface Chart<K, V, T, E> extends JFrame {
    public E createDataset(HashMap<K, ArrayList<HashMap<T, V>>> data, int series);

    public JFreeChart createChart(ChartProperties chartProperties, E dataset);

    public void initUI(JFreeChart chart);
}

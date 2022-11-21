package project.Charts.ChartCharacteristics;

public class ChartType {
    public boolean BarChart;
    public boolean LineChart;
    public boolean PieChart;

    public ChartType(boolean BarChart, boolean LineChart, boolean PieChart) {
        this.BarChart = BarChart;
        this.LineChart = LineChart;
        this.PieChart = PieChart;
    }
}

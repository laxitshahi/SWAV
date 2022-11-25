package project.view.Charts.ChartCharacteristics;

import org.jfree.chart.plot.PlotOrientation;

// TODO figure out what type of refactoring/design pattern this is
public class ChartProperties {
    public int series;
    public String title;
    public String categoryAxisLabel;
    public String valueAxisLabel;
    public PlotOrientation orientation;
    public boolean legend;
    public boolean tooltips;
    public boolean url;

    public ChartProperties(int series, String title, String categoryAxisLabel, String valueAxisLabel, PlotOrientation orientation, boolean legend, boolean tooltips, boolean url) {
        this.series = series;
        this.title = title;
        this.categoryAxisLabel = categoryAxisLabel;
        this.valueAxisLabel = valueAxisLabel;
        this.orientation = orientation;
        this.legend = legend;
        this.tooltips = tooltips;
        this.url = url;
    }

}

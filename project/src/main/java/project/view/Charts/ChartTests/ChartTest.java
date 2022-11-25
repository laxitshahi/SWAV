package project.view.Charts.ChartTests;

import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.plot.PlotOrientation;

import project.view.Charts.ChartMed;
import project.view.Charts.ChartCharacteristics.ChartProperties;
import project.view.Charts.ChartCharacteristics.ChartType;

public class ChartTest {
    public static void main(String[] args) {
        HashMap<String, ArrayList<HashMap<Integer, Integer>>> data = genDataExample();
        ChartProperties chartProperties = genChartPropertiesExample();

        var chartMed = new ChartMed<>(new ChartType(true, true, true), data, chartProperties);
        chartMed.genCharts();
    }

    public void testCharts(ChartType chartType) {
        HashMap<String, ArrayList<HashMap<Integer, Integer>>> data = genDataExample();
        ChartProperties chartProperties = genChartPropertiesExample();

        var chartMed = new ChartMed<>(chartType, data, chartProperties);
        chartMed.genCharts();
    }

    
    public static <K, T, V> HashMap<K, ArrayList<HashMap<T, V>>> genDataExample() {
        HashMap<K, ArrayList<HashMap<T, V>>> data = new HashMap<>();

        // ArrayList<HashMap<T, V>> YorkList = new ArrayList<>();
        // YorkList.add(new HashMap<T, V>() {{ put((T) "Gold", (V)((Object) 1)); }});
        // YorkList.add(new HashMap<T, V>() {{ put((T) "Silver", (V)((Object) 4)); }});
        // YorkList.add(new HashMap<T, V>() {{ put((T) "Bronze", (V)((Object) 6)); }});


        // ArrayList<HashMap<T, V>> TorontoList = new ArrayList<>();
        // TorontoList.add(new HashMap<T, V>() {{ put((T) "Gold", (V)((Object) 4)); }});
        // TorontoList.add(new HashMap<T, V>() {{ put((T) "Silver", (V)((Object) 7)); }});
        // TorontoList.add(new HashMap<T, V>() {{ put((T) "Bronze", (V)((Object) 11)); }});


        // data.put((K) "York", YorkList);
        // data.put((K) "Toronto", TorontoList);

        ArrayList<HashMap<T, V>> canadaList = new ArrayList<>();
        // add population at year
        canadaList.add(new HashMap<>(){{put((T)((Object)2020), (V)((Object)2000));}});
        canadaList.add(new HashMap<>(){{put((T)((Object)2021), (V)((Object)1500));}});
        canadaList.add(new HashMap<>(){{put((T)((Object)2022), (V)((Object)1000));}});


        ArrayList<HashMap<T, V>> usList = new ArrayList<>();
        // add population at year
        usList.add(new HashMap<>(){{put((T)((Object)2020), (V)((Object)4000));}});
        usList.add(new HashMap<>(){{put((T)((Object)2021), (V)((Object)3000));}});
        usList.add(new HashMap<>(){{put((T)((Object)2022), (V)((Object)2000));}});

        ArrayList<HashMap<T, V>> uList = new ArrayList<>();
        // add population at year
        uList.add(new HashMap<>(){{put((T)((Object)2020), (V)((Object)400));}});
        uList.add(new HashMap<>(){{put((T)((Object)2021), (V)((Object)300));}});
        uList.add(new HashMap<>(){{put((T)((Object)2022), (V)((Object)200));}});

        data.put((K)"Canada", canadaList);
        data.put((K)"US", usList);
        data.put((K)"U", uList);


        // ArrayList<HashMap<T, V>> CanadaProfits = new ArrayList<>();
        // // add different areas of revenue
        // CanadaProfits.add(new HashMap<>(){{put((T)((Object)"Imports"), (V)((Object)32));}});
        // CanadaProfits.add(new HashMap<>(){{put((T)((Object)"Exports"), (V)((Object)42));}});
        // CanadaProfits.add(new HashMap<>(){{put((T)((Object)"Taxes"), (V)((Object)12));}});
        // CanadaProfits.add(new HashMap<>(){{put((T)((Object)"Other"), (V)((Object)14));}});

        // // add to hasmap
        // data.put((K)"Canada", CanadaProfits);
        return data;
    }

    // make sure series is the same for all data (must be less than or equal to the number of data points per entry)
    public static ChartProperties genChartPropertiesExample() {
        return new ChartProperties(3, "Canada MONEYS", "Country", "Medals", PlotOrientation.VERTICAL, true, true, false);
    }
}


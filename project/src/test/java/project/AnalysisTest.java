package project;

import org.junit.Test;

import project.controller.analysis.AForestAreaAvg;
import project.controller.analysis.AHealthExpHospBedRat;
import project.controller.analysis.AMortRateSafeWaterComp;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;

public class AnalysisTest {
    
    @Test
    public void test_ratio_analysis() {
        HashMap<String, HashMap<Integer, Float>> country1Data = new HashMap<String, HashMap<Integer, Float>>();
        HashMap<Integer, Float> numeratorData = new HashMap<Integer, Float>();
        numeratorData.put(2000, 10.f);
        numeratorData.put(2001, 10.f);
        numeratorData.put(2002, 10.f);
        numeratorData.put(2003, 10.f);
        country1Data.put("healthexpenditure", numeratorData);

        HashMap<String, HashMap<Integer, Float>> country2Data = new HashMap<String, HashMap<Integer, Float>>();
        HashMap<Integer, Float> denominatorData = new HashMap<Integer, Float>();
        denominatorData.put(2000, 10.f);
        denominatorData.put(2001, 5.f);
        denominatorData.put(2002, 2.f);
        denominatorData.put(2003, 1.f);
        country2Data.put("hospitalbeds", denominatorData);

        HashMap<String, HashMap<Integer, Float>> data = AHealthExpHospBedRat.getAnalysisObj("DNC", "DNC", "DNC").getAnalyzedDataHelper(country1Data, country2Data);
        Assert.assertEquals( 1.f, data.get("Ratio").get(2000), 0.01f);
        Assert.assertEquals( 2.f, data.get("Ratio").get(2001), 0.01f);
        Assert.assertEquals( 5.f, data.get("Ratio").get(2002), 0.01f);
        Assert.assertEquals( 10.f, data.get("Ratio").get(2003), 0.01f);

    }
    
    @Test
    public void test_ratio_analysis_empty() {
        HashMap<String, HashMap<Integer, Float>> country1Data = new HashMap<String, HashMap<Integer, Float>>();
        HashMap<Integer, Float> numeratorData = new HashMap<Integer, Float>();
        country1Data.put("healthexpenditure", numeratorData);

        HashMap<String, HashMap<Integer, Float>> country2Data = new HashMap<String, HashMap<Integer, Float>>();
        HashMap<Integer, Float> denominatorData = new HashMap<Integer, Float>();
        country2Data.put("hospitalbeds", denominatorData);

        // Ensure there are no divide by 0 exceptions
        HashMap<String, HashMap<Integer, Float>> data = AHealthExpHospBedRat.getAnalysisObj("DNC", "DNC", "DNC").getAnalyzedDataHelper(country1Data, country2Data);      

    }

    @Test
    public void test_comparison_analysis() {
        ArrayList<HashMap<String, HashMap<Integer, Float>>> allCountryData = new ArrayList<HashMap<String, HashMap<Integer, Float>>>();
        HashMap<String, HashMap<Integer, Float>> country1Data = new HashMap<String, HashMap<Integer, Float>>();
        HashMap<Integer, Float> data1 = new HashMap<Integer, Float>();
        data1.put(2000, 10.f);
        data1.put(2001, 20.f);
        data1.put(2002, 30.f);
        data1.put(2003, 40.f);
        country1Data.put("mortalityunder5", data1);

        HashMap<String, HashMap<Integer, Float>> country2Data = new HashMap<String, HashMap<Integer, Float>>();
        HashMap<Integer, Float> data2 = new HashMap<Integer, Float>();
        data2.put(2000, 10.f);
        data2.put(2001, 5.f);
        data2.put(2002, 2.f);
        data2.put(2003, 1.f);
        country2Data.put("usingwatermanaged", data2);

        allCountryData.add(country1Data);
        allCountryData.add(country2Data);

        HashMap<String, HashMap<Integer, Float>> data = AMortRateSafeWaterComp.getAnalysisObj("DNC", "DNC", "DNC").getAnalyzedDataHelper(allCountryData);
        Assert.assertEquals( 10.f, data.get("mortalityunder5").get(2000), 0.01f);
        Assert.assertEquals( 20.f, data.get("mortalityunder5").get(2001), 0.01f);
        Assert.assertEquals( 30.f, data.get("mortalityunder5").get(2002), 0.01f);
        Assert.assertEquals( 40.f, data.get("mortalityunder5").get(2003), 0.01f);
        Assert.assertEquals( 10.f, data.get("usingwatermanaged").get(2000), 0.01f);
        Assert.assertEquals( 5.f, data.get("usingwatermanaged").get(2001), 0.01f);
        Assert.assertEquals( 2.f, data.get("usingwatermanaged").get(2002), 0.01f);
        Assert.assertEquals( 1.f, data.get("usingwatermanaged").get(2003), 0.01f);

    }
    
    @Test
    public void test_comparison_analysis_empty() {
        ArrayList<HashMap<String, HashMap<Integer, Float>>> allCountryData = new ArrayList<HashMap<String, HashMap<Integer, Float>>>();
        HashMap<String, HashMap<Integer, Float>> country1Data = new HashMap<String, HashMap<Integer, Float>>();
        HashMap<Integer, Float> data1 = new HashMap<Integer, Float>();
        country1Data.put("mortalityunder5", data1);

        HashMap<String, HashMap<Integer, Float>> country2Data = new HashMap<String, HashMap<Integer, Float>>();
        HashMap<Integer, Float> data2 = new HashMap<Integer, Float>();
        country2Data.put("usingwatermanaged", data2);

        allCountryData.add(country1Data);
        allCountryData.add(country2Data);

        // Ensure there are 
        HashMap<String, HashMap<Integer, Float>> data = AMortRateSafeWaterComp.getAnalysisObj("DNC", "DNC", "DNC").getAnalyzedDataHelper(allCountryData);

    }

    @Test
    public void test_average_analysis() {
        HashMap<String, HashMap<Integer, Float>> country1Data = new HashMap<String, HashMap<Integer, Float>>();

        HashMap<String, HashMap<String,Float>> data = AForestAreaAvg.getAnalysisObj("DNC", "DNC", "DNC").getAnalyzedDataHelper(country1Data);

        // Tests
        HashMap<Integer, Float> data1 = new HashMap<Integer, Float>();
        data1.put(2000, 10.f);
        country1Data.put("forestarea", data1);

        data = AForestAreaAvg.getAnalysisObj("DNC", "DNC", "DNC").getAnalyzedDataHelper(country1Data);
        Assert.assertEquals( 10.f, data.get("DNC").get("forestarea"), 0.01f);

        data1.put(2001, 2.f);
        country1Data.put("forestarea", data1);

        data = AForestAreaAvg.getAnalysisObj("DNC", "DNC", "DNC").getAnalyzedDataHelper(country1Data);
        Assert.assertEquals( 6.f, data.get("DNC").get("forestarea"), 0.01f);

    }
    
    @Test
    public void test_average_analysis_empty() {
        HashMap<String, HashMap<Integer, Float>> country1Data = new HashMap<String, HashMap<Integer, Float>>();

        // Input is empty
        HashMap<String, HashMap<String,Float>> data = AForestAreaAvg.getAnalysisObj("DNC", "DNC", "DNC").getAnalyzedDataHelper(country1Data);
        assert (data.get("DNC").keySet().size() == 0);



    }
}
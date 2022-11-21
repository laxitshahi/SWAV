package project.analysis;

import java.util.HashMap;

public class AnalysisTest {
    public static void main(String[] args) {
        ANetUsersElecAccessRat healthExpHospBedRat = new ANetUsersElecAccessRat();
        healthExpHospBedRat.config("US", "2010", "2015");

        HashMap<String, HashMap<Integer, Float>> data = healthExpHospBedRat.getAnalyzedData();

    }
}

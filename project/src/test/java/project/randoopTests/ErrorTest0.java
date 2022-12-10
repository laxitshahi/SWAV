package project.randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("invalid.key", "User [name=null, id=0, email=, password=null]", "");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp7 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList8 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap9 = aForestAgricultureAreaComp7.getAnalyzedDataHelper(strMapList8);
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp13 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList14 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap15 = aForestAgricultureAreaComp13.getAnalyzedDataHelper(strMapList14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap16 = aC02GDPRat3.getAnalyzedDataHelper(strMap9, strMap15);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("invalid.key", "", "CA");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp7 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList8 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap9 = aForestAgricultureAreaComp7.getAnalyzedDataHelper(strMapList8);
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp13 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList14 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap15 = aForestAgricultureAreaComp13.getAnalyzedDataHelper(strMapList14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap16 = aHealthExpHospBedRat3.getAnalyzedDataHelper(strMap9, strMap15);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("", "", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp7 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList8 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap9 = aForestAgricultureAreaComp7.getAnalyzedDataHelper(strMapList8);
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp13 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList14 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap15 = aForestAgricultureAreaComp13.getAnalyzedDataHelper(strMapList14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap16 = aNetUsersElecAccessRat3.getAnalyzedDataHelper(strMap9, strMap15);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("", "invalid.key", "CA");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp7 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList8 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap9 = aForestAgricultureAreaComp7.getAnalyzedDataHelper(strMapList8);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase10 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp14 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp18 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList19 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap20 = aForestAgricultureAreaComp18.getAnalyzedDataHelper(strMapList19);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap21 = aHealthAccessMortRateComp14.getAnalyzedDataHelper(strMapList19);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap22 = averageAnalysisBase10.getAnalyzedDataHelper(strMap21);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase23 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp27 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp31 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList32 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap33 = aForestAgricultureAreaComp31.getAnalyzedDataHelper(strMapList32);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap34 = aHealthAccessMortRateComp27.getAnalyzedDataHelper(strMapList32);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap35 = averageAnalysisBase23.getAnalyzedDataHelper(strMap34);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap36 = averageAnalysisBase10.getAnalyzedDataHelper(strMap34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap37 = aC02GDPRat3.getAnalyzedDataHelper(strMap9, strMap34);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("", "", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp7 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp11 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList12 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap13 = aForestAgricultureAreaComp11.getAnalyzedDataHelper(strMapList12);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap14 = aHealthAccessMortRateComp7.getAnalyzedDataHelper(strMapList12);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase15 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp19 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp23 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList24 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap25 = aForestAgricultureAreaComp23.getAnalyzedDataHelper(strMapList24);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap26 = aHealthAccessMortRateComp19.getAnalyzedDataHelper(strMapList24);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap27 = averageAnalysisBase15.getAnalyzedDataHelper(strMap26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap28 = aNetUsersElecAccessRat3.getAnalyzedDataHelper(strMap14, strMap26);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("", "CA", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp7 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("hi!", "User [name=null, id=0, email=, password=null]", "CA");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp11 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList12 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap13 = aForestAgricultureAreaComp11.getAnalyzedDataHelper(strMapList12);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap14 = aMortRateSafeWaterComp7.getAnalyzedDataHelper(strMapList12);
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp18 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList19 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap20 = aForestAgricultureAreaComp18.getAnalyzedDataHelper(strMapList19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap21 = aHealthExpHospBedRat3.getAnalyzedDataHelper(strMap14, strMap20);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=null, id=0, email=, password=null]", "", "invalid.key");
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase4 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp8 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp12 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList13 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap14 = aForestAgricultureAreaComp12.getAnalyzedDataHelper(strMapList13);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap15 = aHealthAccessMortRateComp8.getAnalyzedDataHelper(strMapList13);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap16 = averageAnalysisBase4.getAnalyzedDataHelper(strMap15);
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp20 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp24 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList25 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap26 = aForestAgricultureAreaComp24.getAnalyzedDataHelper(strMapList25);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap27 = aHealthAccessMortRateComp20.getAnalyzedDataHelper(strMapList25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap28 = aHealthExpHospBedRat3.getAnalyzedDataHelper(strMap15, strMap27);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("CA", "User [name=hi!, id=0, email=hi!, password=null]", "");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg7 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "", "invalid.key");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp11 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("", "invalid.key", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp15 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp19 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList20 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap21 = aForestAgricultureAreaComp19.getAnalyzedDataHelper(strMapList20);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap22 = aHealthAccessMortRateComp15.getAnalyzedDataHelper(strMapList20);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap23 = aMethaneC02DisasterComp11.getAnalyzedDataHelper(strMapList20);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap24 = aForestAreaAvg7.getAnalyzedDataHelper(strMap23);
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp28 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp32 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList33 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap34 = aForestAgricultureAreaComp32.getAnalyzedDataHelper(strMapList33);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap35 = aHealthAccessMortRateComp28.getAnalyzedDataHelper(strMapList33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap36 = aHealthExpHospBedRat3.getAnalyzedDataHelper(strMap23, strMap35);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("invalid.key", "CA", "invalid.key");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp7 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("", "invalid.key", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp11 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp15 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList16 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap17 = aForestAgricultureAreaComp15.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aHealthAccessMortRateComp11.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aMethaneC02DisasterComp7.getAnalyzedDataHelper(strMapList16);
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp23 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("hi!", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp27 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp31 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList32 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap33 = aForestAgricultureAreaComp31.getAnalyzedDataHelper(strMapList32);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap34 = aHealthAccessMortRateComp27.getAnalyzedDataHelper(strMapList32);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap35 = aMethaneC02DisasterComp23.getAnalyzedDataHelper(strMapList32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap36 = aNetUsersElecAccessRat3.getAnalyzedDataHelper(strMap19, strMap35);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("User [name=null, id=0, email=CA, password=]", "hi!", "");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg7 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=CA, id=0, email=, password=null]", "invalid.key");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp11 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("hi!", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp15 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp19 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList20 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap21 = aForestAgricultureAreaComp19.getAnalyzedDataHelper(strMapList20);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap22 = aHealthAccessMortRateComp15.getAnalyzedDataHelper(strMapList20);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap23 = aMethaneC02DisasterComp11.getAnalyzedDataHelper(strMapList20);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap24 = aForestAreaAvg7.getAnalyzedDataHelper(strMap23);
        project.controller.analysis.AForestAreaAvg aForestAreaAvg28 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "", "invalid.key");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp32 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("", "invalid.key", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp36 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp40 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList41 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap42 = aForestAgricultureAreaComp40.getAnalyzedDataHelper(strMapList41);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap43 = aHealthAccessMortRateComp36.getAnalyzedDataHelper(strMapList41);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap44 = aMethaneC02DisasterComp32.getAnalyzedDataHelper(strMapList41);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap45 = aForestAreaAvg28.getAnalyzedDataHelper(strMap44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap46 = aC02GDPRat3.getAnalyzedDataHelper(strMap23, strMap44);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("", "invalid.key", "CA");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg7 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "", "invalid.key");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp11 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("", "invalid.key", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp15 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp19 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList20 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap21 = aForestAgricultureAreaComp19.getAnalyzedDataHelper(strMapList20);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap22 = aHealthAccessMortRateComp15.getAnalyzedDataHelper(strMapList20);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap23 = aMethaneC02DisasterComp11.getAnalyzedDataHelper(strMapList20);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap24 = aForestAreaAvg7.getAnalyzedDataHelper(strMap23);
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp28 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=null, id=0, email=, password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp32 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp36 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList37 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap38 = aForestAgricultureAreaComp36.getAnalyzedDataHelper(strMapList37);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap39 = aHealthAccessMortRateComp32.getAnalyzedDataHelper(strMapList37);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap40 = aMortRateSafeWaterComp28.getAnalyzedDataHelper(strMapList37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap41 = aC02GDPRat3.getAnalyzedDataHelper(strMap23, strMap40);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("", "CA", "CA");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp7 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("CA", "invalid.key", "User [name=CA, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp11 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp15 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList16 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap17 = aForestAgricultureAreaComp15.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aHealthAccessMortRateComp11.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aForestAgricultureAreaComp7.getAnalyzedDataHelper(strMapList16);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase20 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp24 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp28 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList29 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap30 = aForestAgricultureAreaComp28.getAnalyzedDataHelper(strMapList29);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap31 = aHealthAccessMortRateComp24.getAnalyzedDataHelper(strMapList29);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap32 = averageAnalysisBase20.getAnalyzedDataHelper(strMap31);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase33 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp37 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp41 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList42 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap43 = aForestAgricultureAreaComp41.getAnalyzedDataHelper(strMapList42);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap44 = aHealthAccessMortRateComp37.getAnalyzedDataHelper(strMapList42);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap45 = averageAnalysisBase33.getAnalyzedDataHelper(strMap44);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap46 = averageAnalysisBase20.getAnalyzedDataHelper(strMap44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap47 = aC02GDPRat3.getAnalyzedDataHelper(strMap19, strMap44);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("CA", "User [name=hi!, id=0, email=hi!, password=null]", "CA");
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase4 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp8 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp12 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList13 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap14 = aForestAgricultureAreaComp12.getAnalyzedDataHelper(strMapList13);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap15 = aHealthAccessMortRateComp8.getAnalyzedDataHelper(strMapList13);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap16 = averageAnalysisBase4.getAnalyzedDataHelper(strMap15);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase17 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp21 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp25 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList26 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap27 = aForestAgricultureAreaComp25.getAnalyzedDataHelper(strMapList26);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap28 = aHealthAccessMortRateComp21.getAnalyzedDataHelper(strMapList26);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap29 = averageAnalysisBase17.getAnalyzedDataHelper(strMap28);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap30 = averageAnalysisBase4.getAnalyzedDataHelper(strMap28);
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp34 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("hi!", "CA", "");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp38 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=null, id=0, email=, password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp42 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp46 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList47 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap48 = aForestAgricultureAreaComp46.getAnalyzedDataHelper(strMapList47);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap49 = aHealthAccessMortRateComp42.getAnalyzedDataHelper(strMapList47);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap50 = aMortRateSafeWaterComp38.getAnalyzedDataHelper(strMapList47);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap51 = aMethaneC02DisasterComp34.getAnalyzedDataHelper(strMapList47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap52 = aNetUsersElecAccessRat3.getAnalyzedDataHelper(strMap28, strMap51);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("CA", "", "CA");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp7 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp11 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp15 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList16 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap17 = aForestAgricultureAreaComp15.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aHealthAccessMortRateComp11.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aForestAgricultureAreaComp7.getAnalyzedDataHelper(strMapList16);
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp23 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("invalid.key", "User [name=hi!, id=0, email=hi!, password=null]", "User [name=hi!, id=0, email=hi!, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp27 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp31 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList32 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap33 = aForestAgricultureAreaComp31.getAnalyzedDataHelper(strMapList32);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap34 = aHealthAccessMortRateComp27.getAnalyzedDataHelper(strMapList32);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap35 = aMortRateSafeWaterComp23.getAnalyzedDataHelper(strMapList32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap36 = aNetUsersElecAccessRat3.getAnalyzedDataHelper(strMap19, strMap35);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=null, id=0, email=, password=null]", "", "invalid.key");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp7 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("hi!", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp11 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp15 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList16 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap17 = aForestAgricultureAreaComp15.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aHealthAccessMortRateComp11.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aMethaneC02DisasterComp7.getAnalyzedDataHelper(strMapList16);
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp23 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("hi!", "User [name=null, id=0, email=, password=null]", "CA");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp27 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList28 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap29 = aForestAgricultureAreaComp27.getAnalyzedDataHelper(strMapList28);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap30 = aMortRateSafeWaterComp23.getAnalyzedDataHelper(strMapList28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap31 = aHealthExpHospBedRat3.getAnalyzedDataHelper(strMap19, strMap30);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("", "invalid.key", "CA");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp7 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("invalid.key", "User [name=hi!, id=0, email=hi!, password=null]", "User [name=hi!, id=0, email=hi!, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp11 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp15 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList16 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap17 = aForestAgricultureAreaComp15.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aHealthAccessMortRateComp11.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aMortRateSafeWaterComp7.getAnalyzedDataHelper(strMapList16);
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp23 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("hi!", "User [name=null, id=0, email=, password=null]", "CA");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp27 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList28 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap29 = aForestAgricultureAreaComp27.getAnalyzedDataHelper(strMapList28);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap30 = aMortRateSafeWaterComp23.getAnalyzedDataHelper(strMapList28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap31 = aC02GDPRat3.getAnalyzedDataHelper(strMap19, strMap30);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=hi!, id=0, email=invalid.key, password=]", "", "hi!");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg7 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("CA", "User [name=null, id=0, email=CA, password=]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg11 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("invalid.key", "CA", "invalid.key");
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase12 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp16 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp20 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList21 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap22 = aForestAgricultureAreaComp20.getAnalyzedDataHelper(strMapList21);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap23 = aHealthAccessMortRateComp16.getAnalyzedDataHelper(strMapList21);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap24 = averageAnalysisBase12.getAnalyzedDataHelper(strMap23);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase25 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp29 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp33 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList34 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap35 = aForestAgricultureAreaComp33.getAnalyzedDataHelper(strMapList34);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap36 = aHealthAccessMortRateComp29.getAnalyzedDataHelper(strMapList34);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap37 = averageAnalysisBase25.getAnalyzedDataHelper(strMap36);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap38 = averageAnalysisBase12.getAnalyzedDataHelper(strMap36);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap39 = aForestAreaAvg11.getAnalyzedDataHelper(strMap36);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap40 = aForestAreaAvg7.getAnalyzedDataHelper(strMap36);
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp44 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("CA", "invalid.key", "User [name=CA, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp48 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp52 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList53 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap54 = aForestAgricultureAreaComp52.getAnalyzedDataHelper(strMapList53);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap55 = aHealthAccessMortRateComp48.getAnalyzedDataHelper(strMapList53);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap56 = aForestAgricultureAreaComp44.getAnalyzedDataHelper(strMapList53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap57 = aHealthExpHospBedRat3.getAnalyzedDataHelper(strMap36, strMap56);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("User [name=hi!, id=0, email=hi!, password=null]", "User [name=null, id=0, email=CA, password=]", "User [name=null, id=0, email=CA, password=]");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp7 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=CA, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp11 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp15 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList16 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap17 = aForestAgricultureAreaComp15.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aHealthAccessMortRateComp11.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aMortRateSafeWaterComp7.getAnalyzedDataHelper(strMapList16);
        project.controller.analysis.AForestAreaAvg aForestAreaAvg23 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "", "invalid.key");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp27 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("", "invalid.key", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp31 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp35 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList36 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap37 = aForestAgricultureAreaComp35.getAnalyzedDataHelper(strMapList36);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap38 = aHealthAccessMortRateComp31.getAnalyzedDataHelper(strMapList36);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap39 = aMethaneC02DisasterComp27.getAnalyzedDataHelper(strMapList36);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap40 = aForestAreaAvg23.getAnalyzedDataHelper(strMap39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap41 = aNetUsersElecAccessRat3.getAnalyzedDataHelper(strMap19, strMap39);
    }
}


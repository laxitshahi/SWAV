package project.randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("hi!", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        project.util.IndicatorUtils indicatorUtils0 = new project.util.IndicatorUtils();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String[] strArray0 = project.util.CountryCodes.getCountryArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        project.model.MaintainUser maintainUser0 = new project.model.MaintainUser();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str1 = project.util.CountryCodes.getCode("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CA" + "'", str1.equals("CA"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str1 = project.util.IndicatorUtils.returnIndicator("CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "invalid.key" + "'", str1.equals("invalid.key"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str1 = project.util.CountryCodes.getCode("invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CA" + "'", str1.equals("CA"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("", "invalid.key", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("", "invalid.key", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("", "CA", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("", "CA", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = project.util.CountryCodes.countryMap;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("", "CA", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        project.App app0 = new project.App();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        project.model.StartApp startApp0 = new project.model.StartApp();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        project.util.CountryCodes countryCodes0 = new project.util.CountryCodes();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str1 = project.util.IndicatorUtils.returnIndicator("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "invalid.key" + "'", str1.equals("invalid.key"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("", "CA", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("", "User [name=null, id=0, email=, password=null]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("invalid.key", "", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str1 = project.util.IndicatorUtils.returnIndicator("invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "invalid.key" + "'", str1.equals("invalid.key"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("invalid.key", "User [name=null, id=0, email=, password=null]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=null, id=0, email=, password=null]", "", "invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str1 = project.util.CountryCodes.getCode("User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CA" + "'", str1.equals("CA"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str1 = project.util.IndicatorUtils.returnIndicator("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "invalid.key" + "'", str1.equals("invalid.key"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("invalid.key", "User [name=null, id=0, email=, password=null]", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        project.model.User user4 = new project.model.User("CA", (int) (byte) 1, "invalid.key", "invalid.key");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("", "", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        int int8 = user0.getId();
        int int9 = user0.id;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str1 = project.util.CountryCodes.getCode("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CA" + "'", str1.equals("CA"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        int int4 = user0.id;
        user0.setName("CA");
        java.lang.String str7 = user0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [name=CA, id=0, email=, password=null]" + "'", str7.equals("User [name=CA, id=0, email=, password=null]"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("CA", "User [name=CA, id=0, email=, password=null]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.email = "invalid.key";
        java.lang.String str9 = user0.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        user0.setName("User [name=null, id=0, email=, password=null]");
        java.lang.String str12 = user0.toString();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]" + "'", str12.equals("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getPassword();
        user0.id = (byte) 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("CA", "hi!", "invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        project.model.User user4 = new project.model.User("CA", 1, "User [name=null, id=0, email=, password=null]", "hi!");
        int int5 = user4.id;
        user4.email = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("CA", "hi!", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        java.lang.Class<?> wildcardClass4 = aHealthAccessMortRateComp3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("invalid.key", "CA", "invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("CA", "invalid.key", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase0 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp4 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp8 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList9 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap10 = aForestAgricultureAreaComp8.getAnalyzedDataHelper(strMapList9);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap11 = aHealthAccessMortRateComp4.getAnalyzedDataHelper(strMapList9);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap12 = averageAnalysisBase0.getAnalyzedDataHelper(strMap11);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase13 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp17 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp21 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList22 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap23 = aForestAgricultureAreaComp21.getAnalyzedDataHelper(strMapList22);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap24 = aHealthAccessMortRateComp17.getAnalyzedDataHelper(strMapList22);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap25 = averageAnalysisBase13.getAnalyzedDataHelper(strMap24);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap26 = averageAnalysisBase0.getAnalyzedDataHelper(strMap24);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap28 = averageAnalysisBase0.getAnalyzedDataHelper(strMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.keySet()\" because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        project.model.User user4 = new project.model.User("hi!", (int) (short) 0, "User [name=null, id=0, email=, password=null]", "invalid.key");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("CA", "hi!", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("invalid.key", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.name;
        int int7 = user0.id;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("hi!", "User [name=hi!, id=0, email=hi!, password=null]", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("", "User [name=CA, id=0, email=, password=null]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        user0.email = "User [name=null, id=0, email=, password=null]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("invalid.key", "", "invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("User [name=hi!, id=0, email=hi!, password=null]", "User [name=CA, id=0, email=, password=null]", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("hi!", "User [name=null, id=0, email=, password=null]", "CA");
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
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase36 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp40 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp44 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList45 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap46 = aForestAgricultureAreaComp44.getAnalyzedDataHelper(strMapList45);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap47 = aHealthAccessMortRateComp40.getAnalyzedDataHelper(strMapList45);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap48 = averageAnalysisBase36.getAnalyzedDataHelper(strMap47);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap49 = averageAnalysisBase23.getAnalyzedDataHelper(strMap47);
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList50 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        boolean boolean51 = strMapList50.add(strMap9);
        boolean boolean52 = strMapList50.add(strMap21);
        boolean boolean53 = strMapList50.add(strMap47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap54 = aMortRateSafeWaterComp3.getAnalyzedDataHelper(strMapList50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.name;
        user0.setPassword("User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=CA, id=0, email=, password=null]", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("User [name=hi!, id=0, email=hi!, password=null]", "User [name=null, id=0, email=, password=null]", "User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.name = "";
        user0.id = (short) 10;
        user0.setId(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("", "CA", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str1 = project.util.CountryCodes.getCode("CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CA" + "'", str1.equals("CA"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getPassword();
        user0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.name;
        user0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("CA", "User [name=CA, id=0, email=, password=null]", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("CA", "User [name=CA, id=0, email=, password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        user0.password = "hi!";
        user0.password = "CA";
        user0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        project.model.User user4 = new project.model.User("", 10, "", "hi!");
        user4.email = "User [name=null, id=0, email=, password=null]";
        int int7 = user4.getId();
        user4.id = 100;
        java.lang.String str10 = user4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("CA", "User [name=hi!, id=0, email=hi!, password=null]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        user0.email = "CA";
        java.lang.String str10 = user0.name;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("User [name=hi!, id=0, email=hi!, password=null]", "invalid.key", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=hi!, id=0, email=hi!, password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.setName("hi!");
        user0.email = "invalid.key";
        user0.password = "User [name=CA, id=0, email=, password=null]";
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        project.model.User user4 = new project.model.User("", 10, "", "hi!");
        user4.email = "User [name=null, id=0, email=, password=null]";
        int int7 = user4.getId();
        user4.id = 100;
        java.lang.String str10 = user4.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        project.model.User user4 = new project.model.User("CA", (int) '4', "", "User [name=null, id=0, email=CA, password=]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.getEmail();
        user0.email = "CA";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "CA" + "'", str6.equals("CA"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        user0.email = "CA";
        user0.email = "User [name=hi!, id=0, email=hi!, password=null]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        project.model.User user4 = new project.model.User("User [name=null, id=0, email=, password=null]", (int) '#', "User [name=CA, id=0, email=, password=null]", "");
        user4.password = "hi!";
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        user0.email = "CA";
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.name;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [name=null, id=0, email=CA, password=]" + "'", str10.equals("User [name=null, id=0, email=CA, password=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        project.model.User user4 = new project.model.User("", 10, "", "hi!");
        java.lang.String str5 = user4.email;
        int int6 = user4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("hi!", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=null, id=0, email=, password=null]", "User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        user0.email = "CA";
        java.lang.String str10 = user0.toString();
        user0.email = "User [name=hi!, id=0, email=hi!, password=null]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [name=null, id=0, email=CA, password=]" + "'", str10.equals("User [name=null, id=0, email=CA, password=]"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("User [name=null, id=0, email=CA, password=]", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase0 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase1 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp5 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp9 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList10 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap11 = aForestAgricultureAreaComp9.getAnalyzedDataHelper(strMapList10);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap12 = aHealthAccessMortRateComp5.getAnalyzedDataHelper(strMapList10);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap13 = averageAnalysisBase1.getAnalyzedDataHelper(strMap12);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap14 = averageAnalysisBase0.getAnalyzedDataHelper(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=null, id=0, email=CA, password=]", "invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.email = "invalid.key";
        java.lang.String str9 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "invalid.key" + "'", str9.equals("invalid.key"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        int int6 = user0.getId();
        java.lang.String str7 = user0.password;
        java.lang.String str8 = user0.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("CA", "User [name=CA, id=0, email=, password=null]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("invalid.key", "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.name = "";
        java.lang.String str9 = user0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.setName("hi!");
        java.lang.String str7 = user0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        project.model.User user4 = new project.model.User("", 1, "", "User [name=CA, id=0, email=, password=null]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("invalid.key", "CA", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        user0.email = "invalid.key";
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=null, id=0, email=CA, password=]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=hi!, id=0, email=hi!, password=null]", "User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("User [name=null, id=0, email=, password=null]", "", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("CA", "", "invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("User [name=null, id=0, email=CA, password=]", "invalid.key", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        project.model.User user4 = new project.model.User("User [name=null, id=0, email=, password=null]", (int) '#', "User [name=CA, id=0, email=, password=null]", "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        user0.setName("User [name=null, id=0, email=, password=null]");
        java.lang.String str12 = user0.toString();
        user0.setId((int) '4');
        user0.setId((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]" + "'", str12.equals("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "", "invalid.key");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp7 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("", "invalid.key", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp11 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp15 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList16 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap17 = aForestAgricultureAreaComp15.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aHealthAccessMortRateComp11.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aMethaneC02DisasterComp7.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap20 = aForestAreaAvg3.getAnalyzedDataHelper(strMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=hi!, id=0, email=hi!, password=null]", "User [name=null, id=0, email=, password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("hi!", "", "User [name=null, id=0, email=CA, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("CA", "User [name=null, id=0, email=CA, password=]", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase0 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp4 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp8 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList9 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap10 = aForestAgricultureAreaComp8.getAnalyzedDataHelper(strMapList9);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap11 = aHealthAccessMortRateComp4.getAnalyzedDataHelper(strMapList9);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap12 = averageAnalysisBase0.getAnalyzedDataHelper(strMap11);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase13 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp17 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp21 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList22 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap23 = aForestAgricultureAreaComp21.getAnalyzedDataHelper(strMapList22);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap24 = aHealthAccessMortRateComp17.getAnalyzedDataHelper(strMapList22);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap25 = averageAnalysisBase13.getAnalyzedDataHelper(strMap24);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap26 = averageAnalysisBase0.getAnalyzedDataHelper(strMap24);
        java.lang.Class<?> wildcardClass27 = strMap24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=null, id=0, email=, password=null]", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        project.model.User user0 = new project.model.User();
        user0.email = "CA";
        int int3 = user0.id;
        user0.id = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getPassword();
        user0.name = "";
        user0.password = "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        int int3 = user0.id;
        user0.setId((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        project.model.User user4 = new project.model.User("CA", 1, "User [name=null, id=0, email=, password=null]", "hi!");
        int int5 = user4.id;
        user4.setName("CA");
        java.lang.String str8 = user4.password;
        user4.name = "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        project.controller.Controller controller0 = new project.controller.Controller();
        java.lang.Class<?> wildcardClass1 = controller0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str1 = project.util.IndicatorUtils.returnIndicator("User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "invalid.key" + "'", str1.equals("invalid.key"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getPassword();
        int int5 = user0.getId();
        user0.setId((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String str1 = project.util.CountryCodes.getCode("User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CA" + "'", str1.equals("CA"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        int int6 = user0.getId();
        java.lang.String str7 = user0.password;
        int int8 = user0.getId();
        java.lang.String str9 = user0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "invalid.key" + "'", str9.equals("invalid.key"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.name;
        java.lang.String str9 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        user0.setName("User [name=null, id=0, email=, password=null]");
        int int12 = user0.getId();
        java.lang.String str13 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "invalid.key" + "'", str13.equals("invalid.key"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "invalid.key", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        project.model.User user4 = new project.model.User("CA", 1, "User [name=null, id=0, email=, password=null]", "hi!");
        java.lang.String str5 = user4.name;
        java.lang.String str6 = user4.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CA" + "'", str5.equals("CA"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str6.equals("User [name=null, id=0, email=, password=null]"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str1 = project.util.IndicatorUtils.returnIndicator("User [name=null, id=0, email=CA, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "invalid.key" + "'", str1.equals("invalid.key"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "hi!", "invalid.key");
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
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList31 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        boolean boolean32 = strMapList31.add(strMap28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap33 = aHealthAccessMortRateComp3.getAnalyzedDataHelper(strMapList31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=CA, id=0, email=, password=null]", "invalid.key");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp7 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("hi!", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp11 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp15 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList16 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap17 = aForestAgricultureAreaComp15.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aHealthAccessMortRateComp11.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aMethaneC02DisasterComp7.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap20 = aForestAreaAvg3.getAnalyzedDataHelper(strMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("User [name=hi!, id=0, email=hi!, password=null]", "hi!", "invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.name = "User [name=null, id=0, email=, password=null]";
        user0.id = 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        user0.email = "CA";
        java.lang.String str10 = user0.toString();
        user0.setEmail("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "User [name=null, id=0, email=CA, password=]" + "'", str10.equals("User [name=null, id=0, email=CA, password=]"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.name;
        user0.password = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.name = "";
        user0.id = (short) 10;
        user0.name = "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]";
        user0.setPassword("CA");
        user0.email = "CA";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        project.model.User user4 = new project.model.User("CA", 1, "User [name=null, id=0, email=, password=null]", "hi!");
        user4.setId(100);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("invalid.key", "CA", "User [name=null, id=0, email=CA, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("User [name=null, id=0, email=, password=null]", "CA", "invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.name;
        user0.setId((int) (byte) 0);
        user0.setName("hi!");
        java.lang.String str13 = user0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("User [name=null, id=0, email=CA, password=]", "User [name=CA, id=0, email=, password=null]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.name = "";
        user0.id = (short) 10;
        user0.name = "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]";
        user0.setPassword("CA");
        user0.setId((int) (byte) 0);
        java.lang.String str17 = user0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "invalid.key" + "'", str17.equals("invalid.key"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        project.model.User user4 = new project.model.User("", 10, "", "hi!");
        user4.setPassword("User [name=null, id=0, email=, password=null]");
        java.lang.String str7 = user4.getPassword();
        int int8 = user4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str7.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.setName("hi!");
        user0.email = "invalid.key";
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("hi!", "User [name=CA, id=0, email=, password=null]", "invalid.key");
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap4 = null;
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp8 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=null, id=0, email=, password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp12 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp16 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList17 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aForestAgricultureAreaComp16.getAnalyzedDataHelper(strMapList17);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aHealthAccessMortRateComp12.getAnalyzedDataHelper(strMapList17);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap20 = aMortRateSafeWaterComp8.getAnalyzedDataHelper(strMapList17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap21 = aNetUsersElecAccessRat3.getAnalyzedDataHelper(strMap4, strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"cData1\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("CA", "", "User [name=null, id=0, email=CA, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("", "User [name=null, id=0, email=CA, password=]", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        project.model.User user4 = new project.model.User("User [name=null, id=0, email=, password=null]", 0, "hi!", "invalid.key");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("invalid.key", "User [name=null, id=0, email=CA, password=]", "User [name=null, id=0, email=CA, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        project.model.User user4 = new project.model.User("CA", 1, "User [name=null, id=0, email=, password=null]", "hi!");
        java.lang.String str5 = user4.name;
        user4.setName("User [name=null, id=0, email=, password=null]");
        user4.setPassword("User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CA" + "'", str5.equals("CA"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("hi!", "invalid.key", "User [name=null, id=0, email=CA, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("CA", "User [name=hi!, id=0, email=hi!, password=null]", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=null, id=0, email=CA, password=]", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.name;
        java.lang.String str7 = user0.email;
        java.lang.String str8 = user0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [name=null, id=0, email=, password=hi!]" + "'", str8.equals("User [name=null, id=0, email=, password=hi!]"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("CA", "", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.name = "";
        user0.id = (short) 10;
        java.lang.String str11 = user0.getName();
        user0.setEmail("User [name=null, id=0, email=, password=null]");
        java.lang.String str14 = user0.getEmail();
        user0.name = "invalid.key";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str14.equals("User [name=null, id=0, email=, password=null]"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        user0.setName("CA");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("User [name=null, id=0, email=CA, password=]", "User [name=null, id=0, email=, password=hi!]", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "", "User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "CA", "invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("", "invalid.key", "User [name=null, id=0, email=, password=null]");
        java.lang.Class<?> wildcardClass4 = aMethaneC02DisasterComp3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        int int6 = user0.getId();
        java.lang.String str7 = user0.password;
        user0.id = (short) 0;
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "invalid.key" + "'", str10.equals("invalid.key"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid.key" + "'", str11.equals("invalid.key"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=null, id=0, email=, password=null]", "CA", "User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=null, id=0, email=CA, password=]", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("User [name=hi!, id=0, email=hi!, password=null]", "User [name=null, id=0, email=, password=hi!]", "User [name=null, id=0, email=, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("hi!", "", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.name = "";
        user0.id = (short) 10;
        java.lang.String str11 = user0.getName();
        user0.setEmail("User [name=null, id=0, email=, password=null]");
        java.lang.String str14 = user0.getEmail();
        java.lang.String str15 = user0.email;
        java.lang.String str16 = user0.name;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str14.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str15.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("CA", "User [name=hi!, id=0, email=hi!, password=null]", "CA");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp7 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList8 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap9 = aForestAgricultureAreaComp7.getAnalyzedDataHelper(strMapList8);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap10 = aForestAgricultureAreaComp3.getAnalyzedDataHelper(strMapList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.name;
        user0.setId((int) (byte) 0);
        user0.password = "hi!";
        user0.id = 0;
        java.lang.String str15 = user0.name;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getName();
        java.lang.String str6 = user0.name;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("User [name=null, id=0, email=CA, password=]", "", "User [name=null, id=0, email=, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=null, id=0, email=CA, password=]", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        user0.setName("User [name=null, id=0, email=, password=null]");
        java.lang.String str12 = user0.name;
        user0.name = "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str12.equals("User [name=null, id=0, email=, password=null]"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str1 = project.util.IndicatorUtils.returnIndicator("User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "invalid.key" + "'", str1.equals("invalid.key"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        int int4 = user0.id;
        user0.password = "User [name=null, id=0, email=, password=null]";
        user0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        int int6 = user0.getId();
        java.lang.String str7 = user0.password;
        java.lang.String str8 = user0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.name;
        user0.setId((int) (byte) 0);
        user0.password = "hi!";
        user0.id = 0;
        user0.setId((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.name;
        user0.name = "User [name=null, id=0, email=, password=null]";
        user0.email = "User [name=hi!, id=0, email=hi!, password=null]";
        java.lang.String str11 = user0.email;
        java.lang.String str12 = user0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [name=hi!, id=0, email=hi!, password=null]" + "'", str11.equals("User [name=hi!, id=0, email=hi!, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str12.equals("User [name=null, id=0, email=, password=null]"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        int int6 = user0.getId();
        java.lang.String str7 = user0.password;
        user0.id = (short) 0;
        java.lang.String str10 = user0.getName();
        user0.email = "User [name=hi!, id=0, email=hi!, password=null]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.setEmail("CA");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.name = "";
        user0.id = (short) 10;
        user0.name = "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]";
        int int13 = user0.getId();
        user0.setEmail("CA");
        user0.password = "User [name=null, id=0, email=, password=hi!]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        user0.password = "hi!";
        int int10 = user0.id;
        java.lang.String str11 = user0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [name=null, id=0, email=, password=hi!]" + "'", str11.equals("User [name=null, id=0, email=, password=hi!]"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        int int10 = user0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        project.model.User user4 = new project.model.User("", 10, "", "hi!");
        user4.setPassword("User [name=null, id=0, email=, password=null]");
        int int7 = user4.getId();
        java.lang.String str8 = user4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str8.equals("User [name=null, id=0, email=, password=null]"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        user0.setName("User [name=null, id=0, email=, password=null]");
        java.lang.String str12 = user0.toString();
        java.lang.String str13 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]" + "'", str12.equals("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "invalid.key" + "'", str13.equals("invalid.key"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("CA", "", "CA");
        java.lang.Class<?> wildcardClass4 = aHealthAccessMortRateComp3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("CA", "", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        user0.setName("User [name=null, id=0, email=, password=null]");
        int int12 = user0.id;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=null, id=0, email=, password=hi!]", "User [name=null, id=0, email=, password=]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("User [name=null, id=0, email=, password=hi!]", "User [name=null, id=0, email=, password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        user0.password = "hi!";
        java.lang.String str10 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("CA", "User [name=null, id=0, email=CA, password=]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg7 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("invalid.key", "CA", "invalid.key");
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase8 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp12 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp16 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList17 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aForestAgricultureAreaComp16.getAnalyzedDataHelper(strMapList17);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aHealthAccessMortRateComp12.getAnalyzedDataHelper(strMapList17);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap20 = averageAnalysisBase8.getAnalyzedDataHelper(strMap19);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase21 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp25 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp29 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList30 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap31 = aForestAgricultureAreaComp29.getAnalyzedDataHelper(strMapList30);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap32 = aHealthAccessMortRateComp25.getAnalyzedDataHelper(strMapList30);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap33 = averageAnalysisBase21.getAnalyzedDataHelper(strMap32);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap34 = averageAnalysisBase8.getAnalyzedDataHelper(strMap32);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap35 = aForestAreaAvg7.getAnalyzedDataHelper(strMap32);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap36 = aForestAreaAvg3.getAnalyzedDataHelper(strMap32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getPassword();
        int int5 = user0.getId();
        java.lang.String str6 = user0.name;
        java.lang.String str7 = user0.getName();
        user0.setPassword("invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.name;
        java.lang.String str7 = user0.email;
        user0.password = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=null, id=0, email=, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.setName("hi!");
        int int7 = user0.id;
        java.lang.String str8 = user0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [name=hi!, id=0, email=invalid.key, password=]" + "'", str8.equals("User [name=hi!, id=0, email=invalid.key, password=]"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("", "User [name=hi!, id=0, email=invalid.key, password=]", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.name;
        user0.setId((int) (byte) 0);
        user0.setName("hi!");
        int int13 = user0.id;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase0 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp4 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp8 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList9 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap10 = aForestAgricultureAreaComp8.getAnalyzedDataHelper(strMapList9);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap11 = aHealthAccessMortRateComp4.getAnalyzedDataHelper(strMapList9);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap12 = averageAnalysisBase0.getAnalyzedDataHelper(strMap11);
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp16 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("hi!", "CA", "");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp20 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=null, id=0, email=, password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp24 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp28 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList29 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap30 = aForestAgricultureAreaComp28.getAnalyzedDataHelper(strMapList29);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap31 = aHealthAccessMortRateComp24.getAnalyzedDataHelper(strMapList29);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap32 = aMortRateSafeWaterComp20.getAnalyzedDataHelper(strMapList29);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap33 = aMethaneC02DisasterComp16.getAnalyzedDataHelper(strMapList29);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap34 = averageAnalysisBase0.getAnalyzedDataHelper(strMap33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=hi!, id=0, email=invalid.key, password=]", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.setName("hi!");
        user0.email = "invalid.key";
        user0.setName("");
        java.lang.String str11 = user0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [name=, id=0, email=invalid.key, password=]" + "'", str11.equals("User [name=, id=0, email=invalid.key, password=]"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.password;
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "CA" + "'", str6.equals("CA"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        int int6 = user0.getId();
        java.lang.String str7 = user0.password;
        user0.id = (short) 0;
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "invalid.key" + "'", str10.equals("invalid.key"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid.key" + "'", str11.equals("invalid.key"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "invalid.key" + "'", str12.equals("invalid.key"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        java.lang.String str3 = user0.password;
        user0.name = "User [name=null, id=0, email=CA, password=]";
        java.lang.String str6 = user0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [name=null, id=0, email=CA, password=]" + "'", str6.equals("User [name=null, id=0, email=CA, password=]"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        project.model.User user4 = new project.model.User("User [name=null, id=0, email=, password=]", (int) 'a', "User [name=null, id=0, email=CA, password=]", "User [name=hi!, id=0, email=invalid.key, password=]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.toString();
        user0.password = "User [name=null, id=0, email=, password=]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [name=null, id=0, email=, password=]" + "'", str8.equals("User [name=null, id=0, email=, password=]"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str1 = project.util.CountryCodes.getCode("User [name=null, id=0, email=, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CA" + "'", str1.equals("CA"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("hi!", "User [name=null, id=0, email=, password=null]", "User [name=null, id=0, email=CA, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.name;
        user0.name = "User [name=null, id=0, email=, password=null]";
        user0.password = "User [name=null, id=0, email=CA, password=]";
        java.lang.String str11 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "CA" + "'", str11.equals("CA"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp7 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp11 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList12 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap13 = aForestAgricultureAreaComp11.getAnalyzedDataHelper(strMapList12);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap14 = aHealthAccessMortRateComp7.getAnalyzedDataHelper(strMapList12);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap15 = aForestAgricultureAreaComp3.getAnalyzedDataHelper(strMapList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("invalid.key", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=hi!, id=0, email=hi!, password=null]", "User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        int int4 = user0.id;
        int int5 = user0.id;
        user0.setId(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("CA", "User [name=, id=0, email=invalid.key, password=]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.name;
        user0.setId((int) (byte) 0);
        user0.password = "hi!";
        user0.id = 0;
        java.lang.String str15 = user0.password;
        java.lang.String str16 = user0.name;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        int int4 = user0.id;
        int int5 = user0.getId();
        java.lang.String str6 = user0.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=null, id=0, email=CA, password=]", "invalid.key", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        project.model.User user4 = new project.model.User("User [name=null, id=0, email=CA, password=]", (int) ' ', "", "User [name=null, id=0, email=CA, password=]");
        user4.setName("User [name=CA, id=0, email=, password=null]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("User [name=null, id=0, email=, password=hi!]", "User [name=hi!, id=0, email=invalid.key, password=]", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("hi!", "User [name=null, id=0, email=, password=hi!]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        int int4 = user0.id;
        int int5 = user0.getId();
        java.lang.String str6 = user0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str6.equals("User [name=null, id=0, email=, password=null]"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        user0.password = "invalid.key";
        java.lang.String str5 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        int int4 = user0.id;
        user0.setName("CA");
        user0.name = "User [name=null, id=0, email=, password=]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.name = "";
        int int6 = user0.getId();
        java.lang.String str7 = user0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.setName("hi!");
        user0.email = "invalid.key";
        java.lang.String str9 = user0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "invalid.key" + "'", str9.equals("invalid.key"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("User [name=hi!, id=0, email=hi!, password=null]", "User [name=hi!, id=0, email=hi!, password=null]", "User [name=hi!, id=0, email=invalid.key, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=hi!, id=0, email=hi!, password=null]", "User [name=null, id=0, email=, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.String str1 = project.util.CountryCodes.getCode("User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CA" + "'", str1.equals("CA"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.email;
        java.lang.String str5 = user0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str5.equals("User [name=null, id=0, email=, password=null]"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.name;
        user0.name = "User [name=null, id=0, email=, password=null]";
        user0.password = "User [name=null, id=0, email=CA, password=]";
        user0.password = "User [name=null, id=0, email=CA, password=]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.setName("hi!");
        user0.setPassword("User [name=hi!, id=0, email=invalid.key, password=]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        user0.setName("User [name=null, id=0, email=, password=null]");
        java.lang.String str12 = user0.name;
        user0.setEmail("");
        user0.setPassword("User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str12.equals("User [name=null, id=0, email=, password=null]"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        int int6 = user0.getId();
        java.lang.String str7 = user0.password;
        user0.id = (short) 0;
        user0.setPassword("User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("", "User [name=hi!, id=0, email=hi!, password=null]", "User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        project.model.User user0 = new project.model.User();
        java.lang.String str1 = user0.password;
        java.lang.String str2 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        user0.setName("User [name=null, id=0, email=, password=null]");
        java.lang.String str12 = user0.toString();
        user0.setId((int) '4');
        java.lang.String str15 = user0.password;
        user0.email = "User [name=null, id=0, email=CA, password=]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]" + "'", str12.equals("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=CA, id=0, email=, password=null]", "User [name=CA, id=0, email=, password=null]");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp7 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=CA, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp11 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp15 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList16 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap17 = aForestAgricultureAreaComp15.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aHealthAccessMortRateComp11.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aMortRateSafeWaterComp7.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap20 = aMortRateSafeWaterComp3.getAnalyzedDataHelper(strMapList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("User [name=hi!, id=0, email=hi!, password=null]", "User [name=null, id=0, email=CA, password=]", "User [name=null, id=0, email=CA, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.String str1 = project.util.CountryCodes.getCode("User [name=, id=0, email=invalid.key, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CA" + "'", str1.equals("CA"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.name;
        user0.name = "User [name=null, id=0, email=, password=null]";
        user0.email = "User [name=null, id=0, email=, password=null]";
        user0.setName("User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase0 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp4 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp8 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList9 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap10 = aForestAgricultureAreaComp8.getAnalyzedDataHelper(strMapList9);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap11 = aHealthAccessMortRateComp4.getAnalyzedDataHelper(strMapList9);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap12 = averageAnalysisBase0.getAnalyzedDataHelper(strMap11);
        project.controller.analysis.AForestAreaAvg aForestAreaAvg16 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("invalid.key", "CA", "invalid.key");
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase17 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp21 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp25 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList26 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap27 = aForestAgricultureAreaComp25.getAnalyzedDataHelper(strMapList26);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap28 = aHealthAccessMortRateComp21.getAnalyzedDataHelper(strMapList26);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap29 = averageAnalysisBase17.getAnalyzedDataHelper(strMap28);
        project.controller.analysis.AverageAnalysisBase averageAnalysisBase30 = new project.controller.analysis.AverageAnalysisBase();
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp34 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp38 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList39 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap40 = aForestAgricultureAreaComp38.getAnalyzedDataHelper(strMapList39);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap41 = aHealthAccessMortRateComp34.getAnalyzedDataHelper(strMapList39);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap42 = averageAnalysisBase30.getAnalyzedDataHelper(strMap41);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap43 = averageAnalysisBase17.getAnalyzedDataHelper(strMap41);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap44 = aForestAreaAvg16.getAnalyzedDataHelper(strMap41);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Float>> strMap45 = averageAnalysisBase0.getAnalyzedDataHelper(strMap41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap45);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getPassword();
        user0.name = "";
        user0.password = "invalid.key";
        java.lang.String str9 = user0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "invalid.key" + "'", str9.equals("invalid.key"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        user0.name = "CA";
        user0.password = "User [name=, id=0, email=invalid.key, password=]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("invalid.key", "invalid.key", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("CA", "hi!", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.name;
        user0.name = "User [name=null, id=0, email=, password=null]";
        user0.email = "User [name=hi!, id=0, email=hi!, password=null]";
        user0.setEmail("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        java.lang.String str13 = user0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=, password=null], id=0, email=User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!], password=null]" + "'", str13.equals("User [name=User [name=null, id=0, email=, password=null], id=0, email=User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!], password=null]"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=, id=0, email=invalid.key, password=]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "CA", "User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.password = "User [name=CA, id=0, email=, password=null]";
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=null, id=0, email=, password=hi!]", "invalid.key");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        project.model.User user4 = new project.model.User("CA", 1, "User [name=null, id=0, email=, password=null]", "hi!");
        int int5 = user4.id;
        java.lang.String str6 = user4.password;
        java.lang.String str7 = user4.name;
        user4.email = "invalid.key";
        java.lang.String str10 = user4.password;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "CA" + "'", str7.equals("CA"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        project.model.User user4 = new project.model.User("", 100, "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=hi!, id=0, email=hi!, password=null]");
        java.lang.String str5 = user4.name;
        user4.setEmail("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        user4.email = "hi!";
        java.lang.Class<?> wildcardClass10 = user4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        project.model.User user4 = new project.model.User("", (int) (short) 0, "", "hi!");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        user0.password = "invalid.key";
        java.lang.String str5 = user0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        user0.setName("User [name=null, id=0, email=, password=null]");
        java.lang.String str12 = user0.getPassword();
        user0.id = 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "invalid.key" + "'", str5.equals("invalid.key"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "invalid.key" + "'", str6.equals("invalid.key"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        project.model.User user4 = new project.model.User("", 100, "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=hi!, id=0, email=hi!, password=null]");
        java.lang.String str5 = user4.name;
        user4.setEmail("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        user4.setId((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        project.model.User user4 = new project.model.User("User [name=null, id=0, email=CA, password=]", (-1), "", "CA");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=null, id=0, email=, password=hi!]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.password;
        user0.email = "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp7 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList8 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap9 = aForestAgricultureAreaComp7.getAnalyzedDataHelper(strMapList8);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap10 = aHealthAccessMortRateComp3.getAnalyzedDataHelper(strMapList8);
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp14 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("hi!", "User [name=null, id=0, email=, password=null]", "CA");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp18 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList19 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap20 = aForestAgricultureAreaComp18.getAnalyzedDataHelper(strMapList19);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap21 = aMortRateSafeWaterComp14.getAnalyzedDataHelper(strMapList19);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap22 = aHealthAccessMortRateComp3.getAnalyzedDataHelper(strMapList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        user0.id = (byte) 10;
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        java.lang.String str3 = user0.password;
        user0.setId((int) (short) 10);
        user0.email = "User [name=null, id=0, email=CA, password=]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("User [name=, id=0, email=invalid.key, password=]", "", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.name = "";
        user0.id = (short) 10;
        user0.name = "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]";
        user0.setPassword("CA");
        user0.password = "CA";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        project.model.User user4 = new project.model.User("User [name=null, id=0, email=, password=]", (int) (short) 100, "", "invalid.key");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.name;
        user0.setId((int) (byte) 0);
        user0.setName("hi!");
        user0.setId((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.setName("hi!");
        int int7 = user0.id;
        user0.id = 1;
        java.lang.String str10 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "invalid.key" + "'", str10.equals("invalid.key"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.name;
        user0.setId((int) (byte) 0);
        user0.setName("hi!");
        user0.setName("User [name=null, id=0, email=, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "CA", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getPassword();
        user0.name = "";
        user0.password = "invalid.key";
        java.lang.String str9 = user0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!], password=null]", "User [name=hi!, id=0, email=invalid.key, password=]", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("User [name=null, id=-1, email=null, password=null]", "CA", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.name;
        user0.name = "User [name=null, id=0, email=, password=null]";
        user0.email = "User [name=null, id=0, email=, password=null]";
        user0.setEmail("");
        user0.id = (short) 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.setName("hi!");
        user0.email = "invalid.key";
        int int9 = user0.id;
        user0.email = "User [name=hi!, id=0, email=hi!, password=null]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        project.model.User user4 = new project.model.User("CA", 1, "User [name=null, id=0, email=, password=null]", "hi!");
        int int5 = user4.id;
        user4.setName("CA");
        java.lang.String str8 = user4.name;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "CA" + "'", str8.equals("CA"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.password = "";
        user0.email = "";
        java.lang.String str7 = user0.getPassword();
        user0.password = "hi!";
        java.lang.String str10 = user0.getEmail();
        user0.id = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=hi!, id=0, email=invalid.key, password=]", "User [name=null, id=0, email=CA, password=]", "User [name=CA, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        project.model.User user4 = new project.model.User("", 10, "", "hi!");
        user4.email = "User [name=null, id=0, email=, password=null]";
        user4.password = "User [name=CA, id=0, email=, password=null]";
        user4.setEmail("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.email = "invalid.key";
        user0.setName("hi!");
        java.lang.String str11 = user0.email;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "invalid.key" + "'", str11.equals("invalid.key"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp7 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList8 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap9 = aForestAgricultureAreaComp7.getAnalyzedDataHelper(strMapList8);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap10 = aHealthAccessMortRateComp3.getAnalyzedDataHelper(strMapList8);
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp14 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("invalid.key", "User [name=hi!, id=0, email=hi!, password=null]", "User [name=hi!, id=0, email=hi!, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp18 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp22 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList23 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap24 = aForestAgricultureAreaComp22.getAnalyzedDataHelper(strMapList23);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap25 = aHealthAccessMortRateComp18.getAnalyzedDataHelper(strMapList23);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap26 = aMortRateSafeWaterComp14.getAnalyzedDataHelper(strMapList23);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap27 = aHealthAccessMortRateComp3.getAnalyzedDataHelper(strMapList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        project.controller.analysis.AC02GDPRat aC02GDPRat3 = project.controller.analysis.AC02GDPRat.getAnalysisObj("", "", "");
        java.lang.Class<?> wildcardClass4 = aC02GDPRat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aC02GDPRat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("invalid.key", "User [name=null, id=0, email=, password=hi!]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        java.lang.String str5 = user0.getEmail();
        int int6 = user0.id;
        int int7 = user0.id;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "invalid.key" + "'", str5.equals("invalid.key"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getName();
        user0.name = "CA";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [name=hi!, id=0, email=hi!, password=null]" + "'", str8.equals("User [name=hi!, id=0, email=hi!, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.email = "invalid.key";
        user0.setId((int) (byte) 0);
        user0.setName("User [name=null, id=0, email=, password=null]");
        java.lang.String str12 = user0.name;
        java.lang.String str13 = user0.getEmail();
        user0.password = "User [name=CA, id=0, email=, password=null]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str12.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "invalid.key" + "'", str13.equals("invalid.key"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=-1, email=null, password=null]", "hi!", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        project.model.User user4 = new project.model.User("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", (int) ' ', "User [name=CA, id=0, email=, password=null]", "User [name=hi!, id=0, email=invalid.key, password=]");
        java.lang.String str5 = user4.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "User [name=hi!, id=0, email=invalid.key, password=]" + "'", str5.equals("User [name=hi!, id=0, email=invalid.key, password=]"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp3 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("invalid.key", "hi!", "User [name=null, id=0, email=, password=null]");
        project.controller.analysis.AMortRateSafeWaterComp aMortRateSafeWaterComp7 = project.controller.analysis.AMortRateSafeWaterComp.getAnalysisObj("hi!", "User [name=null, id=0, email=, password=null]", "CA");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp11 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList12 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap13 = aForestAgricultureAreaComp11.getAnalyzedDataHelper(strMapList12);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap14 = aMortRateSafeWaterComp7.getAnalyzedDataHelper(strMapList12);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap15 = aMortRateSafeWaterComp3.getAnalyzedDataHelper(strMapList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMortRateSafeWaterComp7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=CA, id=0, email=, password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=null, id=0, email=CA, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        user0.name = "hi!";
        int int5 = user0.getId();
        user0.email = "hi!";
        java.lang.String str8 = user0.name;
        user0.setId((int) (byte) 0);
        user0.password = "hi!";
        user0.id = 0;
        user0.setName("User [name=null, id=0, email=CA, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        project.controller.analysis.ANetUsersElecAccessRat aNetUsersElecAccessRat3 = project.controller.analysis.ANetUsersElecAccessRat.getAnalysisObj("User [name=hi!, id=0, email=invalid.key, password=]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!], password=null]", "User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aNetUsersElecAccessRat3);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp3 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("hi!", "User [name=, id=0, email=invalid.key, password=]", "CA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.lang.String str1 = project.util.CountryCodes.getCode("User [name=User [name=null, id=0, email=, password=null], id=0, email=User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!], password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "CA" + "'", str1.equals("CA"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        project.model.User user0 = new project.model.User();
        user0.setId((int) (short) -1);
        java.lang.String str3 = user0.toString();
        user0.name = "User [name=User [name=null, id=0, email=, password=null], id=0, email=User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!], password=null]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=-1, email=null, password=null]" + "'", str3.equals("User [name=null, id=-1, email=null, password=null]"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        project.model.User user4 = new project.model.User("", (int) '4', "hi!", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        java.lang.String str5 = user4.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        project.model.User user4 = new project.model.User("", 100, "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=hi!, id=0, email=hi!, password=null]");
        java.lang.String str5 = user4.name;
        user4.setEmail("User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        user4.email = "hi!";
        user4.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        project.model.User user0 = new project.model.User();
        user0.email = "";
        java.lang.String str3 = user0.toString();
        user0.email = "CA";
        java.lang.String str6 = user0.name;
        user0.name = "User [name=null, id=0, email=, password=null]";
        user0.email = "User [name=null, id=0, email=, password=null]";
        user0.name = "User [name=null, id=0, email=, password=]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [name=null, id=0, email=, password=null]" + "'", str3.equals("User [name=null, id=0, email=, password=null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        project.model.User user4 = new project.model.User("CA", 1, "User [name=null, id=0, email=, password=null]", "hi!");
        int int5 = user4.id;
        user4.setName("CA");
        int int8 = user4.id;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("User [name=null, id=0, email=, password=null]", "", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        project.model.User user4 = new project.model.User("CA", 1, "User [name=null, id=0, email=, password=null]", "hi!");
        int int5 = user4.id;
        user4.setName("CA");
        int int8 = user4.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        project.controller.analysis.AHealthExpHospBedRat aHealthExpHospBedRat3 = project.controller.analysis.AHealthExpHospBedRat.getAnalysisObj("hi!", "CA", "User [name=null, id=0, email=, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthExpHospBedRat3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("User [name=null, id=0, email=CA, password=]", "CA", "");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp7 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("CA", "invalid.key", "User [name=CA, id=0, email=, password=null]");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp11 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("", "invalid.key", "hi!");
        project.controller.analysis.AForestAgricultureAreaComp aForestAgricultureAreaComp15 = project.controller.analysis.AForestAgricultureAreaComp.getAnalysisObj("User [name=null, id=0, email=, password=null]", "invalid.key", "hi!");
        java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>> strMapList16 = new java.util.ArrayList<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>>>();
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap17 = aForestAgricultureAreaComp15.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap18 = aHealthAccessMortRateComp11.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap19 = aForestAgricultureAreaComp7.getAnalyzedDataHelper(strMapList16);
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.Float>> strMap20 = aHealthAccessMortRateComp3.getAnalyzedDataHelper(strMapList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAgricultureAreaComp15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        project.controller.analysis.AForestAreaAvg aForestAreaAvg3 = project.controller.analysis.AForestAreaAvg.getAnalysisObj("User [name=, id=0, email=invalid.key, password=]", "User [name=null, id=0, email=, password=]", "User [name=null, id=0, email=, password=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aForestAreaAvg3);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        project.controller.analysis.AMethaneC02DisasterComp aMethaneC02DisasterComp3 = project.controller.analysis.AMethaneC02DisasterComp.getAnalysisObj("User [name=User [name=null, id=0, email=, password=null], id=0, email=User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!], password=null]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]", "User [name=User [name=null, id=0, email=, password=null], id=0, email=invalid.key, password=hi!]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aMethaneC02DisasterComp3);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        project.model.User user0 = new project.model.User();
        user0.setEmail("invalid.key");
        int int3 = user0.id;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        project.model.User user4 = new project.model.User("", 10, "", "hi!");
        user4.email = "User [name=null, id=0, email=, password=null]";
        user4.setId((int) (short) 100);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        project.controller.analysis.AHealthAccessMortRateComp aHealthAccessMortRateComp3 = project.controller.analysis.AHealthAccessMortRateComp.getAnalysisObj("User [name=null, id=0, email=CA, password=]", "hi!", "User [name=null, id=0, email=, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aHealthAccessMortRateComp3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.String str1 = project.util.IndicatorUtils.returnIndicator("User [name=hi!, id=0, email=hi!, password=null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "invalid.key" + "'", str1.equals("invalid.key"));
    }
}


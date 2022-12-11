package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import project.util.CountryCodes;
import project.util.IndicatorUtils;

class UtilTests {
    
    @Test
    void countryCode() {
    /*
     * @Test 1
     * @Description: Tests with valid country
     */
    String code = CountryCodes.getCode("Canada");
    assertEquals("CA", code);
    
    /*
     * @Test 2
     * @Description: Test with invalid key
     */
    String code2 = CountryCodes.getCode("invalid.country");
    assertEquals("CA", code2);
    
    /*
     * @Test 3
     * @Description: Test with blank input
     */
    String code3 = CountryCodes.getCode("");
    assertNotNull(code3);
   
    /*
     * @Test 4
     * @Description: Test with spaced out country
     */
    String code4 = CountryCodes.getCode("Saint Vincent & Grenadines");
    assertEquals("VC", code4);
    /*
     * @Test 5
     * @Description: Ensure getCountryArray method returns the correct array
     */
    String[] countryArray = CountryCodes.getCountryArray();
    assertNotNull(countryArray );
    assertEquals("-Select-", countryArray[0]);
    
    /*
     * @Test 6
     * @Description: Ensure all countries return a country code 
     */
    for (String country : countryArray) {
        if (country == "-Select-") continue;
        String testcode = CountryCodes.getCode(country);
        assertNotNull(testcode);
    }
    System.out.println("✅: Country Code Tests passed");
    }
    
    
    
    @Test
    void indicatorUtils() {
    /*
     * @Test 7
     * @Description: Test valid indicator
     */
        String out1 = IndicatorUtils.returnIndicator("population");
        assertEquals("SP.POP.TOTL", out1);
       
    /*
     * @Test 8
     * @Description: Test invalid indiactor
     */
        String out2 = IndicatorUtils.returnIndicator("invalid.indicator");
        assertNotNull(out2);
        assertEquals("invalid.key", out2);
        
    /*
     * @Test 9
     * @Description: Test null indicator
     */
        String out3 = IndicatorUtils.returnIndicator("");
        assertNotNull(out3);
        System.out.println("✅: IndicatorUtils Tests passed");
        
   }
    
}

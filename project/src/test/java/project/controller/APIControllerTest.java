package project.controller;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static project.controller.APIController.*;

class APIControllerTest {

    @Test
    void yearlyData() {
        String aCountry, dataType, startYear, endYear;
        aCountry = "US";
        dataType = "population";
        startYear = "2000";
        endYear = "2001";

        HashMap<Integer, Float> yearlyData = getFilteredData(aCountry, dataType, startYear, endYear).get(dataType);

        /*
         * @Test 1
         * @Description: Ensure that the values are not null
         */
        int numOfYears = 0;
        for (HashMap.Entry<Integer, Float> data : yearlyData.entrySet()) {
            Integer key;
            Float value;
            key = data.getKey();
            value = data.getValue();
            assertNotNull(key);
            assertNotNull(value);
            numOfYears += 1;
        }
        System.out.println("✅ Data Returned");
        /*
         * @Test 2
         * @Description: Ensure data for each year was returned
         */
        assertEquals(Integer.parseInt(endYear) - Integer.parseInt(startYear) + 1, numOfYears);
        System.out.println("✅ Found data for each year");
    }

}

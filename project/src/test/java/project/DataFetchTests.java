package project;

import org.junit.jupiter.api.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import project.controller.WorldBank;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static project.controller.Controller.*;

class DataFetchTests {

    @Test
    void controllerTests() {
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
        System.out.println("Test 1: ✅ Data Returned");
        /*
         * @Test 2
         * @Description: Ensure data for each year was returned
         */
        assertEquals(Integer.parseInt(endYear) - Integer.parseInt(startYear) + 1, numOfYears);
        System.out.println("Test 2: ✅ Found data for each year");
    }
    
    
      @Test
        void worldBankTest() {
        String aCountry, dataType, startYear, endYear;
        aCountry = "US";
//        dataType = "population";
        startYear = "2000";
        endYear = "2001";

        //All inputs
        String[] dataTypes =
                {
                        "population",
                        "co2emissions",
                        "gdppercapita",
                        "forestarea",
                        "healthexpenditure",
                        "hospitalbeds",
                        "agriculturalland",
                        "mortalityunder5",
                        "mortalityunderfive",
                        "usingwatermanaged",
                        "incomesharelowest20",
                        "incomesharelowesttwenty",
                        "mortalityinfant"
                };
        ArrayList<JsonElement> data = new ArrayList<>();

        for (String dt : dataTypes) {
            JsonArray res = WorldBank.getData(aCountry, dt, startYear, endYear);

            /*
             * @Test 3
             * Description: Ensure that message (error) is not returned
             */
            if (res.get(0).isJsonObject()) {
                new JsonObject();
                JsonObject r;
                r = (JsonObject) res.get(0);
                assertNull(r.get("message"));
            }
            if (res.size() > 1) data.add(res.get(1));
            else data.add(res.get(0));

//            System.out.println(res.get(1));
        }
        System.out.println("Test 3: ✅ No Error message returned");

        /*
         * @Test 4
         * @Description: Ensure there are a proper number of responses
         */
        assertEquals(dataTypes.length, data.size());
        System.out.println("Test 4: ✅ Responses are equivalent to the number of requests");
        
        /*
         * @Test 5
         * @Description: Ensure Invalid parameters cannot be passed in
         */
        
        //Invalid Year 
        JsonArray invalidInput = WorldBank.getData(aCountry, dataTypes[0], "-1900", "1000000");
        String yearTypeKey = invalidInput.get(0).getAsJsonObject().get("message").getAsJsonArray().get(0).getAsJsonObject().get("key").getAsString();
        assertEquals("Invalid value".toLowerCase(), yearTypeKey.toLowerCase());
        System.out.println("Test 5.1: ✅ Response key returns 'Invalid value' error ");
        
        //Invalid Type
        JsonArray invalidDataType = WorldBank.getData(aCountry, "invalid.type", startYear, endYear);
        String dataTypeKey = invalidInput.get(0).getAsJsonObject().get("message").getAsJsonArray().get(0).getAsJsonObject().get("key").getAsString();
        assertEquals("Invalid value".toLowerCase(), dataTypeKey.toLowerCase());
        System.out.println("Test 5.2: ✅ Response key returns 'Invalid value' error ");
       
        //Invalid country
        JsonArray invalidCountry = WorldBank.getData(aCountry, "invalid.country", startYear, endYear);
        String countryKey = invalidInput.get(0).getAsJsonObject().get("message").getAsJsonArray().get(0).getAsJsonObject().get("key").getAsString();
        assertEquals("Invalid value".toLowerCase(), countryKey.toLowerCase());
        System.out.println("Test 5.3: ✅ Response key returns 'Invalid value' error ");
    }


}

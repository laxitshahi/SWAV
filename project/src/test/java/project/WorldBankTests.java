package project;

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;

import project.controller.WorldBank;

import java.util.ArrayList;

class WorlBankTests {

    @Test
    void apiCall() {
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
             * @Test 1
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
        }
        System.out.println("✅ No Error message returned");

        /*
         * @Test 2
         * @Description: Ensure there are a proper number of responses
         */
        assertEquals(dataTypes.length, data.size());
        System.out.println("✅ Responses are equivalent to the number of requests");

        /*
         * @Test 2
         * @Description: Ensure that each response is correct by checking data type
         */

    }

}

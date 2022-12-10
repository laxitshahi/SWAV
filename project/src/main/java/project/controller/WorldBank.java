/*************************************************
 * FALL 2022
 * EECS 3311 http Client SAMPLE CODE
 * ONLT AS A REFERENCE TO SEE THE USE OF http INVOCATIONS THROUGH JAVA
 * THE CODE BELOW DOES NOT DEPICT THE DESIGN TO BE FOLLOWED 
 */
package project.controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import static project.util.IndicatorUtils.returnIndicator;

public class WorldBank {

    public static JsonArray getData(String aCountry, String dataType, String startYear, String endYear) {

        String refDataType = dataType.replaceAll("\\s", "").toLowerCase();
        String indicator = returnIndicator(refDataType);

        String urlString = String.format(
                "http://api.worldbank.org/v2/country/%s/indicator/%s?date=%s:%s&format=json", aCountry, indicator, startYear, endYear);

//        System.out.println(urlString);
        JsonArray jsonData = null;

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode = conn.getResponseCode(); //Always returns 200
            if (responsecode == 200) {
                String inline = "";
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    inline += sc.nextLine();
                }
                sc.close();
                jsonData = new JsonParser().parse(inline).getAsJsonArray();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return jsonData;

    }
}



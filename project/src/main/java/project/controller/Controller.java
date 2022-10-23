package project.controller;

import java.util.HashMap;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import static project.util.FilterData.filterDataAsFloat;

public class Controller {

    public static HashMap<String, HashMap<Integer, Float>> getFilteredData(String aCountry, String dataType, String startYear, String endYear) {
        JsonArray jsonArray = WorldBank.getData(aCountry, dataType, startYear, endYear);

        JsonElement responseData = jsonArray.get(1);

//        Indicator
//        String d = returnData.getAsJsonArray().get(0).getAsJsonObject().get("indicator").getAsJsonObject().get("value").getAsString();

        HashMap<String, HashMap<Integer, Float>> data = new HashMap<>();
        HashMap<Integer, Float> yearlyData = filterDataAsFloat(responseData);
        data.put(dataType, yearlyData);
        return data;

    }

    public static void main(String[] args) {
        String aCountry, startYear, endYear;
        aCountry = "US";
        startYear = "1700";
        endYear = "1701";

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

        for (String d : dataTypes) {
            HashMap<String, HashMap<Integer, Float>> jsonArray = getFilteredData(aCountry, d, startYear, endYear);
            System.out.println("priting here");
            System.out.println(jsonArray);
            System.out.println(jsonArray.get(d));
        }
    }
}

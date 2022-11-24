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
}

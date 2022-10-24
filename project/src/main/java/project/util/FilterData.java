package project.util;

import com.google.gson.JsonElement;

import java.util.HashMap;

public class FilterData {

    public static HashMap<Integer, Float> filterDataAsFloat(JsonElement returnData) {
        HashMap<Integer, Float> yearlyData = new HashMap<>();

        try {
            int sizeOfResults = returnData.getAsJsonArray().size();
            int year;
            float value;

            for (int i = 0; i < sizeOfResults; i++) {
                year = returnData.getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
                if (returnData.getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
                    value = 0;
                else
                    value = returnData.getAsJsonArray().get(i).getAsJsonObject().get("value")
                            .getAsFloat();

                yearlyData.put(year, value);
//                cummulativePopulation = cummulativePopulation + populationForYear;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return yearlyData;

    }
}

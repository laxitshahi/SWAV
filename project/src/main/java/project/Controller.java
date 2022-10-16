package project;

import java.util.HashMap;

import com.google.gson.JsonArray;

public class Controller {

	public static HashMap<Integer,Integer> getYearlyPopulation(String aCountry, String dataType, String startYear, String endYear) {
		
		JsonArray jsonArray = GetData.getData(aCountry, dataType, startYear, endYear);
		
		int populationForYear = 0;
		int cummulativePopulation = 0;
		
		
		HashMap<Integer, Integer>yearlyData = new HashMap<>();
		
		try {
			int sizeOfResults = jsonArray.get(1).getAsJsonArray().size();
			int year;
			
			
			for (int i = 0; i < sizeOfResults; i++) {
				year = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
				if (jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
					populationForYear = 0;
				else
					populationForYear = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value")
							.getAsInt();

				yearlyData.put(year, populationForYear);
				System.out.println("Population for " + aCountry + " in " + year + " is " + populationForYear);
				cummulativePopulation = cummulativePopulation + populationForYear;
			}
		}
		catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
		return yearlyData;
		
	}
}

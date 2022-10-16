/*************************************************
 * FALL 2022
 * EECS 3311 http Client SAMPLE CODE
 * ONLT AS A REFERENCE TO SEE THE USE OF http INVOCATIONS THROUGH JAVA
 * THE CODE BELOW DOES NOT DEPICT THE DESIGN TO BE FOLLOWED 
 */
package project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class GetData {
	
	public static JsonArray getData(String aCountry, String dataType, String startYear, String endYear) {
	
		String urlString = String.format(
				"http://api.worldbank.org/v2/country/%s/indicator/%s?date=%s:%s&format=json", aCountry, dataType, startYear, endYear);
		
		System.out.println("URL:" + urlString);
		
		JsonArray jsonData = null;
	
		

		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();
			if (responsecode == 200) {
				String inline = "";
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				sc.close();
				JsonArray jsonArray = new JsonParser().parse(inline).getAsJsonArray();
		
				jsonData = jsonArray;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block e.printStackTrace();
		}
		return jsonData;

	}

}



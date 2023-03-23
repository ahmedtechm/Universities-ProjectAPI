package UniProjectAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class UniversitiesAPI {

	public static void main(String[] args) {
		
		// Define the API URL to retrieve a list of universities in Oman
		String apiUrl = "http://universities.hipolabs.com/search?country=Oman";
		
		try {
			// Create a URL object and establish a connection to the API
			URL url = new URL(apiUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			// Set the HTTP request method and Accept header
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			
			// Check if the HTTP response code indicates success (code 200)
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("HTTP error code : " + conn.getResponseCode());
			}
			
			// Read the API response and store it as a JSON string
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			StringBuilder json = new StringBuilder();

			while ((output = br.readLine()) != null) {
				json.append(output);
			}

			conn.disconnect();
			
			// Parse the JSON string into a Java object using Gson library
			Gson gson = new Gson();
			MyObject myObj = gson.fromJson(json.toString(), MyObject.class);
			
			// TODO: Use myObj for further processing (e.g. print university names, etc.)



		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



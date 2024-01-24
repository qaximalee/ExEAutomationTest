package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpResponseCodeExample {
	 public static void main(String[] args) {
	        try {
	            // Specify the URL you want to send the GET request to
	            URL url = new URL("https://www.google.com");

	            // Open a connection to the URL
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            // Set the request method to GET
	            connection.setRequestMethod("GET");

	            // Get the response code
	            int responseCode = connection.getResponseCode();
	            System.out.println("Response Code: " + responseCode);

	            // Read and print the response content (if needed)
	            

	            // Print the response content (if needed)
	            //System.out.println("Response Content:\n" + responseContent.toString());

	            // Close the connection
	            connection.disconnect();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}

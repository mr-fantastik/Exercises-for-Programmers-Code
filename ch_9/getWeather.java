package ch_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class getWeather {
	
	public static BufferedReader retrieveWeather() throws Exception {
		Scanner sc = new Scanner(System.in);
		String inputString;
		System.out.println("Enter an input city");
		inputString = sc.nextLine();
        sc.close();
		
		String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" 
		+ inputString + "&units=imperial&APPID=";
		
		URL aURL = new URL(urlString);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));
		
		return in;		
	}
	
	public static void jsonProcess(JsonParser jsonParser) {	
		
		while (jsonParser.hasNext()) { 
			Event event = jsonParser.next();
		
			 if (event.equals(JsonParser.Event.KEY_NAME)) {
				String keyname = jsonParser.getString();
				switch(keyname) {
				case "description":
					jsonParser.next();
					System.out.println(jsonParser.getString());
					break;
				case "temp": 	
					jsonParser.next();
					System.out.println(jsonParser.getString() + " degrees Fahrenheit");
					break;
				case "humidity":	
					jsonParser.next();
					System.out.println(jsonParser.getString() + "% humidity");
					break;
				}
			}						  
		}		
	}
	

	public static void main(String[] args) throws Exception {
		
		JsonParser jsonParser = Json.createParser(retrieveWeather());
		
		jsonProcess(jsonParser);

	}
}

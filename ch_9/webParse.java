package ch_9;

import java.io.InputStream;
import java.net.URL;
import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;


public class webParse {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://api.open-notify.org/astros.json");
		InputStream is = url.openStream();
		 
		JsonParser jsonParser = Json.createParser(is);
		
		while (jsonParser.hasNext()) { 
			//Returns the event for the next parsing state 
			  Event event = jsonParser.next(); 
			//Start of a JSON object,  
			//position of the parser is after'{' 
			  if (event.equals(JsonParser.Event.KEY_NAME)){
				  String keyName = jsonParser.getString();
				  switch (keyName) {
				  case "number":
					  jsonParser.next();
					  System.out.println("There are " + jsonParser.getString() + " people in space right now.\n");
				  case "people": 
					  System.out.println("Name              |Craft   ");
					  System.out.println("------------------|--------");
				  case "name":
					  jsonParser.next();
				      System.out.print(jsonParser.getString());
				      break;
				  case "craft":
					  jsonParser.next();
				      System.out.println("    |    " + jsonParser.getString());
				  }
			  }
				  
		}		  
	}

}
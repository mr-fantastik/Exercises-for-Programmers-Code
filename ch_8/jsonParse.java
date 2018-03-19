package ch_8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class jsonParse {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String element;
		
		System.out.print("Enter a value:");
		element = sc.nextLine();
		
        try {
            FileInputStream json = new FileInputStream("products.json");
            JsonParser jsonParser = Json.createParser(json);          
            
            Event event = null;                   

            parseElement(event, jsonParser, element);     
     
        } catch(Exception e){
            // Handle the exception logic here
        }
    }

	public static void parseElement(Event event, JsonParser jsonParser, String element) {
        while(jsonParser.hasNext()) {
            event = jsonParser.next();
            
            if(event == Event.VALUE_STRING && element.equals(jsonParser.getString())) {
        	System.out.println ("name = " + jsonParser.getString());
            event = jsonParser.next();
            printData(event, jsonParser);
            } 
        }    
    }

    private static void printData(Event event, JsonParser jsonParser){
        while(event != Event.END_OBJECT) {
            switch(event) {
                case KEY_NAME: {
                    System.out.print(jsonParser.getString());
                    System.out.print(" = ");
                    break;
                }
                case VALUE_FALSE: {
                    System.out.println(false);
                    break;
                }
                case VALUE_NULL: {
                    System.out.println("null");
                    break;
                }
                case VALUE_NUMBER: {
                    if(jsonParser.isIntegralNumber()) {
                        System.out.println(jsonParser.getInt());
                    } else {
                        System.out.println(jsonParser.getBigDecimal());
                    }
                    break;
                }
                case VALUE_STRING: {
                    System.out.println(jsonParser.getString());
                    break;
                }
                case VALUE_TRUE: {
                    System.out.println(true);
                    break;
                }
                default: {
                }
            }
            event = jsonParser.next();
        }
    }
}

package collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String [] args) {
		
		Map<String,Integer> countries = new LinkedHashMap<String,Integer>();
		
		countries.put("India", 01);
		countries.put("America", 02);
		countries.put("UK", 03);
		countries.put("Japan", 04);
		
		System.out.println(countries);
		
	}

}

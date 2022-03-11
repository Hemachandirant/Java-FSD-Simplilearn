package collection.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Arraylist {
	
	public static void main (String [] args) {
		List<String> listofnames = new ArrayList<String>();
		
		listofnames.add("Hemachandiran");
		listofnames.add("Kumar");
		listofnames.add("Vikram");
		System.out.println(listofnames);
		
		
		//using iterator
		Iterator<String> itr = listofnames.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		//using enhanced for loop
			
		for(String name: listofnames) {
			System.out.println(name);
		}
		
		//using for loop
		
		for(int index = 0;index<listofnames.size();index++) {
			System.out.println(listofnames.get(index));
		}
		}
	}

}

package collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[]args) {
		TreeSet<String> name = new TreeSet<String>();
		
		name.add("John Wick");
		name.add("Harry Potter");
		name.add("Game of Thrones");
		name.add("John Wick");
		name.add("Money Heist");
		
		
		System.out.println(name);
		System.out.println("----------------------");
		for(String Name:name) {
			System.out.println(Name);
		}
		System.out.println("----------------------");
		
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		for(String Name:name.descendingSet()) {
			System.out.println(Name);
		}
		System.out.println("----------------------");
		
		Iterator<String> itrdesc = name.descendingIterator();
		while(itrdesc.hasNext()) {
			System.out.println(itrdesc.next());
		}
	}

}

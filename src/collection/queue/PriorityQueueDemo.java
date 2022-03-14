package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<String> continents = new PriorityQueue<String>();
		
		continents.add("Asia");
		continents.add("Japan");
		continents.add("Africa");
		continents.add("Australia");
		continents.add("South America");
		continents.add("North America");
		continents.add("Europe");
		
		System.out.println(continents);
		
		System.out.println("-----------------------");
		
		System.out.println("first element: "+continents.peek());
		System.out.println("First elements: "+continents.element());
		
		
		String RemoveEle1 = continents.poll();
		System.out.println("Removed Element: "+RemoveEle1);
		
		System.out.println("-----------------------");
		
		for(String continent: continents) {
			System.out.println(continent);
		}

		

	}

}

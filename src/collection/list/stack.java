package collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class stack {
	public static void main (String [] args) {
		
		List <Integer> marks = new Stack<Integer>();
		
		// Adding values to the marks
		
		marks.add(78);
		marks.add(98);
		marks.add(71);
		marks.add(100);
		marks.add(65);
		
		System.out.println(marks);
		
		
		//using for loop for iterating the data's
		
		for(int index = 0;index<marks.size();index++) {
			System.out.println("The marks at index "+index+" is : "+marks.get(index));
		}
		System.out.println("-----------------------------------------");
		//using iterator for iterating the data's
		
		Iterator<Integer> itr = marks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("-----------------------------------------");		
		//using enhanced for loop
			
		for(int mark:marks) {
			System.out.println(mark);
		}
	}

}

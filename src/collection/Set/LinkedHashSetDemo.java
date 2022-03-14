package collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	
		Set<Integer> marks = new LinkedHashSet<Integer>();
		
		marks.add(89);
		marks.add(98);
		marks.add(69);
		marks.add(98);
		marks.add(49);
		marks.add(78);
		
		System.out.println(marks);

		System.out.println("-------------------------------");
		
		Iterator<Integer> itr = marks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

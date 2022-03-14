package collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[]args) {
		//FIFO
		Queue<String> Movies = new ArrayDeque<String>();
		
		Movies.add("The Adam Project");
		Movies.add("Harry Potter");
		Movies.add("2012");
		Movies.add("John Wick");
		Movies.add("Avengers");
		Movies.add("Doctor Strange");
		
		System.out.println(Movies);
		System.out.println("------------------------");
		
		//checking top element
		System.out.println(Movies.peek());
		System.out.println(Movies.element());
		
		
		System.out.println("------------------------------");
		
		String removeEle1 = Movies.poll();
		System.out.println("Removed Element: "+removeEle1);
		System.out.println("--------------------------");
		
		for(String movie: Movies) {
			System.out.println(movie);
		}
		
	}
}

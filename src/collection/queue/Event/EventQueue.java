package collection.queue.Event;

import java.util.ArrayDeque;
import java.util.Queue;

public class EventQueue {

	public static void main(String[] args) {
		
		
		Queue<EventMain> event = new ArrayDeque<EventMain>();
		
		event.add(new EventMain(101, "Kumar", "12-12-2022","13-12-2022", "BirthdayParty"));
		event.add(new EventMain(102,"John","01-01-2022","03-01-2022","Reception"));
		event.add(new EventMain(103, "Rahul", "16-12-2022","18-12-2022", "BirthdayParty"));
		event.add(new EventMain(102,"Kunal","04-01-2022","05-01-2022","Corporate Event"));
		
		for(EventMain Event: event) {
			System.out.println(Event.ID);
			System.out.println(Event.Name);
			System.out.println(Event.Startdate);
			System.out.println(Event.EndDate);
			System.out.println(Event.EventType);
			System.out.println("-------------------------------");
			
		}

	}

}

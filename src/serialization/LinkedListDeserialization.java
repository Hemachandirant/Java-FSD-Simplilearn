package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDeserialization {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream file = new FileInputStream("LinkedlistSerialized.xml");
			ObjectInputStream  out = new ObjectInputStream(file);
			
			List<Employee> employee =  (LinkedList<Employee>) out.readObject();
			System.out.println("Deserialization is complete");
			file.close();
			out.close();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

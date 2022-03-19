package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistSerializationDemo {

	public static void main(String[] args) {
		
		List<Employee> employee = new LinkedList<Employee>();
		
		employee.add(new Employee(1232, "Hemachandiran", "Engineering", 4234.230));
		employee.add(new Employee(1234, "David", "IT", 42124.230));
		employee.add(new Employee(1235, "John", "Engineering", 4234.230));
		employee.add(new Employee(1236, "kumar", "Engineering", 4234.230));
		employee.add(new Employee(1237, "Kunal", "Engineering", 4234.230));
		
		try {
			FileOutputStream file = new FileOutputStream("LinkedlistSerialized.xml");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(employee);
			System.out.println("Serialization is finished");
			out.close();
			file.close();
			
		} catch (IOException e) {
			System.out.println("Error occured : "+e.getClass());
			System.out.println("Error message: "+e.getMessage());
		}

	}

}

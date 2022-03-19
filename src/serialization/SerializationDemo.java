package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo  {

	public static void main(String[] args) {
		
		Employee employee = new Employee(12312, "David", "IT", 3423.230);
		
		
		try {
			FileOutputStream file = new FileOutputStream("SerializedEmployee.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(employee);
			System.out.println("Serialization is completed!!");
			out.close();
			file.close();
		} catch (Exception e) {
			System.out.println("Error Message : "+e.getMessage());
			System.out.println("Error occured : "+e.getClass());
			

	}

}
}


package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream file = new FileInputStream("SerializedEmployee.txt");
			ObjectInputStream out = new ObjectInputStream(file);
			
			Employee employee = (Employee) out.readObject(); 
			System.out.println("Deserialization is completed!!");
			out.close();
			file.close();
			System.out.println(employee.Dept);
			System.out.println(employee.Dept);
			System.out.println(employee.Empno);
			System.out.println(employee.Name);
		} catch (Exception e) {
			System.out.println("The error occured: "+e.getClass());
			System.out.println("Error Message: "+e.getMessage());
		}
	}

}

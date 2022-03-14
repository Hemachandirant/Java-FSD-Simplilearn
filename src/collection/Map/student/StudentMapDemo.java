package collection.Map.student;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Student> student = new LinkedHashMap<Integer, Student>();
		
		student.put(01, new Student("John Snow",121212,98));
		student.put(02, new Student("Arya Stark",121212,97));
		student.put(03, new Student("John Smith",12323,78));
		student.put(03, new Student("Will Smith",1232123,75));
		student.put(03, new Student("David",12323112,71));
		student.put(03, new Student("Ali",1232345,79));
		
		System.out.println(student);
		
		for(Map.Entry<Integer, Student> entry: student.entrySet()) {
			System.out.println("Key: " +entry.getKey());
			System.out.println("Value: "+entry.getValue());
			System.out.println("----------------------------");
		}
		

	}

}

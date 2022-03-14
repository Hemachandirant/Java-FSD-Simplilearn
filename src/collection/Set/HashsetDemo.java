package collection.Set;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[]args) {
		
		HashSet<Float> Temp = new HashSet<Float>();
		
		Temp.add(89.34F);
		Temp.add(78.32F);
		Temp.add(67.23F);
		Temp.add(89.34F);
		Temp.add(72.32F);
		Temp.add(66.23F);
		Temp.add(99.34F);
		Temp.add(78.32F);
		Temp.add(57.23F);
		
		System.out.println(Temp);
		
		System.out.println("---------------------------------");
		
		for(float temp:Temp) {
			System.out.println("The Temperature is : "+temp);
		}
		
		
	}

}

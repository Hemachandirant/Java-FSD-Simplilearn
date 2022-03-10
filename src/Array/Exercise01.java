package Array;

public class Exercise01 {

	public static void main(String[] args) {
		// WAP to create collection price array => float[]
				// access data by index and iterate over all values.
		
		float [] price = new float[5];
		
		//Inserting values
		price[0] = (float) 1123.12;
		price[1] = (float) 432.23;
		price[2] = (float) 3534.23;
		price[3] = (float) 342.12;
		price[4] = (float) 654.23;
		
		//Accessing by using indexes
		
		System.out.println("The price at index 0 : "+price[0]);
		System.out.println("The price at index 1 : "+price[1]);
		System.out.println("The price at index 2 : "+price[2]);
		System.out.println("The price at index 3 : "+price[3]);
		System.out.println("The price at index 4 : "+price[4]);
		
		System.out.println("--------------------------");
		
		//iterating over all values
		
		for(int index = 0;index<price.length;index++) {
			System.out.println("The price at index "+index+" is "+price[index]);
		}
		

	}

}

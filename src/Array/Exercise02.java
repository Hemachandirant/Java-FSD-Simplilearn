package Array;

import java.util.Iterator;

public class Exercise02 {
	public static void main(String[] args) {
		
		String [] IPAddress = {"192.168.11.13","192.168.11.14","192.168.11.16","192.168.11.18","192.168.11.19"};
		
		//Accessing using Indexes
		
		System.out.println("The IPAddress at index 0 is : "+IPAddress[0]);
		System.out.println("The IPAddress at index 1 is : "+IPAddress[1]);
		System.out.println("The IPAddress at index 2 is : "+IPAddress[2]);
		System.out.println("The IPAddress at index 3 is : "+IPAddress[3]);
		System.out.println("The IPAddress at index 4 is : "+IPAddress[4]);
		
		System.out.println("-------------------------------------------------");
		//Accessing using Iteration
		
		for(int index = 0;index<IPAddress.length;index++) {
			System.out.println("The IPAddress at index "+index+ " is : "+IPAddress[index]);
		}
		
	}

}

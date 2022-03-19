package ExceptionHandling;
import java.util.Scanner;

public class AgeValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		try {
		int age = sc.nextInt();
		
		validAge(age);
		}catch(Exception e) {
			e.getMessage();
		}

	}
	
	public static void validAge(int age) {
		if(age>18) {
			System.out.println("Your age is : "+age+" and you are eligible to vote");
		}
		if(age<18){
			System.out.println("You are not eligible ");
			}
			
		

	}

}

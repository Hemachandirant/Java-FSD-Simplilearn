package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int number1;
		int number2;
		int answer;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		try {
			answer = number1/number2;
			System.out.println(answer);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println((e.getClass()));
			
		}finally {
			System.out.println("Program had been executed");
		}
		
		

	}

}

package Bank;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(112312312,12333,"Hemachandiran","hema@sbi.com");
		
		Bankoperations bankoperations = new Bankoperations();
		
		System.out.println("Welcome to "+ bankoperations.Bankname);
		
		System.out.println("Please Enter the Options to Proceed further:\n 1.Deposit\n 2.Withdrawl\n 3.ShowBalance");
		
		
		while (true){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Options: ");
		int options = input.nextInt();
		if(options==1) {
			System.out.print("Enter the Amount to deposit: ");
			double amount = input.nextDouble();
			System.out.println("Deposited amount is : "+ bankoperations.deposit(amount, account));
			break;
			
		}if(options==2) {
			System.out.print("Enter the Amount to Withdraw: ");
			double amount = input.nextDouble();
			System.out.println("Withdrawn amount is : "+ bankoperations.withdrawl(amount, account));
			break;
			
			
		}if(options==3) {
			System.out.println("Your account balance is: "+bankoperations.showbalance(account));
			break;
			
		}
		
		else {
			System.out.println("Enter a valid options");
		}
		}
		
	}

}

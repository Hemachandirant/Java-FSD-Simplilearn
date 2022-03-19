package filehandling.account;

import Bank.Account;

public class BankOperation {
	
	public String bankName ="Indian Bank";
	
	
	public double showBalance(filehandling.account.Account account) {
		if(account !=null) {
			return account.balance;
		}
		return 0;
	}
	
	
	public double depositAmount(filehandling.account.Account account, double amount) {
		System.out.println(account.username+" balance before deposit is : "+account.balance);
		if(amount>0) {
			account.balance += amount ;  
			System.out.println(account.username+" balance after deposit is : "+account.balance) ;
			return account.balance;
		} else {
			System.out.println("Invalid deposit Amount");
			return 0;
			
		}
	}
	

	public void withdrawAmount(filehandling.account.Account account, double amount) {
		System.out.println(account.username+" balance before whithdrawl is : "+account.balance);
		if(amount>0) {
			account.balance -= amount ;  
			System.out.println(account.username+" balance after withdrawl is : "+account.balance);
		} else {
			System.out.println("Invalid withdraw Amount");
			
		}
	}
}

package Bank;

public class Bankoperations {
	
	// Deposit
	String Bankname = "State Bank of India";
	
	public double deposit(double amount, Account account) {
		if(amount>0) {
			account.balance+=amount;
			return account.balance;
			
		}else {
			System.out.println("Please Enter valid amount!!");
			return 0;
		}
	}
	
	// Withdrawal
	
	public double withdrawl(double amount, Account account) {
		if(amount>0) {
			account.balance-=amount;
			return account.balance;
		}else {
			System.out.println("Enter valid amount!!");
			return 0;
		}
	}
	
	//ShowBalance
	
	public double showbalance(Account account) {
		if(account!=null) {
			return account.balance;
		}else {
			return 0;
		}
	}

}

package filehandling.account;

import java.io.Serializable;

public class Account  {
	
	
	
	public long accNo;
	public double balance;
	public String username;
	

	

	public Account(long accNo, double balance, String username) {
		this.accNo = accNo;
		this.balance = balance;
		this.username = username;
		
	}
}

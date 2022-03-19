package filehandling;
import java.io.Serializable;

public class Account implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public String Bankname;
	public String AccountHolderName;
	public long AccountNo;
	public double Balance;
	
	



	public  Account (String bankname, String accountHolderName, long accountNo, double balance) {
		
		this.Bankname = bankname;
		this.AccountHolderName = accountHolderName;
		this.AccountNo = accountNo;
		this.Balance = balance;
	}
	
	@Override
	public String toString() {
		return " [Bankname=" + Bankname + ", AccountHolderName=" + AccountHolderName + ", AccountNo="
				+ AccountNo + ", Balance=" + Balance + "]";
	}
	

}

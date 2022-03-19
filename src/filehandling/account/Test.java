package filehandling.account;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Flow;

public class Test {

	public static void main(String[] args) {
		
		activity();
		

	}
	public static void activity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username: ");
		String username = sc.next();
		username.trim();
		Account account = new Account(23123, 12332.21, username);
		BankOperation opr = new BankOperation();
		
		//Create a file with username file
		
		String filenameExtension =".txt";
		File file = new File("C:\\Users\\hemac\\Desktop\\JAVA FSD Simplilearn\\src\\filehandling\\account"+username+filenameExtension);
		boolean respone;
		try {
			respone = file.createNewFile();
			if(respone) {
				System.out.println("File is created Successfully");
			}else {
				System.out.println("File already exists");
			}
		} catch (Exception e) {
			System.out.printf(e.getMessage(), e.getClass());
			
		}
		try {
			FileWriter writer = new FileWriter(file);
			writer.append("Username: "+username+"AccountNumber"+Double.toString(account.balance));
		} catch (Exception e) {
			System.out.printf(e.getMessage(), e.getClass());
		}
		while(true){
			System.out.println("Enter 1 to view Balance"+"\n");
			System.out.println(("Enter 2 to Deposit Amount"+"\n"));
			System.out.println("Enter 3 to Withdraw Amount"+"\n");
			System.out.println("Enter 4 to Exit"+"\n");
			
			System.out.println("Enter your choice: "+"\n");
			int option = sc.nextInt();
			switch(option) {
			
			case 1: 
				
				opr.showBalance(account);
				try {
					@SuppressWarnings("resource")
					FileWriter writer = new FileWriter(file);
					writer.append("Username: "+account.username+"Balance: "+Double.toString(account.balance));
				} catch ( Exception e) {
					System.out.println(e.getMessage());
				}break;
				
			case 2 :
				System.out.print("Enter the amount to Deposit: ");
				double amt = sc.nextDouble();
				opr.depositAmount(account, amt);
				String oldbal = Double.toString(account.balance);
				try {
				@SuppressWarnings("resource")
				FileWriter writer = new FileWriter(file);
				writer.append("Username: "+account.username+"amount Before deposit : "+oldbal);
				writer.append("Username: "+account.username+"amount depostied : "+Double.toString(account.balance));
			} catch ( Exception e) {
				System.out.println(e.getMessage());
			
			}break;
				
			case 3 :
				System.out.print("Enter the amount to Deposit: ");
				double amt1 = sc.nextDouble();
				opr.withdrawAmount(account, amt1);
				String oldbal1 = Double.toString(account.balance);
				try {
				@SuppressWarnings("resource")
				FileWriter writer = new FileWriter(file);
				writer.append("Username: "+account.username+"amount Before withdrawl : "+oldbal1);
				writer.append("Username: "+account.username+"amount withdrawal : "+Double.toString(account.balance));
			} catch ( Exception e) {
				System.out.println(e.getMessage());
			
			}break;
			
			case 4:
				try {
					FileWriter writer = new FileWriter(file);
						writer.close();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice");
			}
			}
			
		}
		
		
		
	}

			
			
			
			
	


		

	
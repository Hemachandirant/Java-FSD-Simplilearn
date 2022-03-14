package collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, Double> account = new TreeMap<String, Double>();
		
		account.put("Kumar", 32432.423);
		account.put("David", 54654.34);
		account.put("Krish", 213.21);
		account.put("Pravin", 345345.34);
		account.put("John", 12313.123);
		
		System.out.println(account);
		
		for(Map.Entry<String, Double> entry: account.entrySet()) {
			System.out.println("Account Holder Name: "+entry.getKey());
			System.out.println("Balance: "+entry.getValue());
			
			System.out.println("----------------------------");
		}
		
	}
}

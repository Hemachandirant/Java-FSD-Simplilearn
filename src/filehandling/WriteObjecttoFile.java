package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteObjecttoFile {

	public static void main(String[] args) {
		// Todo 1: create a dir(folder) and add file within dir
		// Todo : create file and add object(Account) data to file
		
		
		
		createDIRandFileObject("newDir/", "Hema.txt");
		


	}
	
	public static void createDIRandFileObject(String dir, String filename) {
		try {

		File Dir = new File(dir);
		
		boolean response = Dir.mkdir();
		if(response) {
			System.out.println("File Directory Created");
			
		}else {
			System.out.println("File Directory already exists");
			
		}
		File file = new File(dir+filename);
		
		boolean res = file.createNewFile();
		if (res) {
			System.out.println("File created successfully");
		}else {
			System.out.println("File already exists");
		}
		Account acc = new Account("Indian Bank","Hemachandiran",123123,123123.123);
		System.out.println(acc);
		FileOutputStream file1 = new FileOutputStream(dir+filename);
		ObjectOutputStream out = new ObjectOutputStream(file1);
		
		out.writeObject(acc);
		System.out.println("Serialization is completed!!");
		out.close();
		file1.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			
		}
		
		
		
	}
	

}

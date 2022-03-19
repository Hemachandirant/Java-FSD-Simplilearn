package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateAndWriteFile {

	public static void main(String[] args) {
		
		createFile("abc.txt");
		

	}
	
	public static void createFile(String filename) {
		File file = new File(filename);
		boolean response;
		try {
			response = file.createNewFile();
			if(response) {
				System.out.println("File is created Successfully");
			}else {
				System.out.println("File already exist");
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the information you need to write on the file: ");
			String msg = sc.nextLine();
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(msg);
			System.out.println("write operation is completed");
			fileWriter.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

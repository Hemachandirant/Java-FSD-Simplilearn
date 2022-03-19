package filehandling;

import java.io.FileInputStream;

public class FileRead {

	public static void main(String[] args) {
	 readFile("abc.txt");

	}

	public static void readFile(String filename) {
		FileInputStream fileinputstream;
		try {
			fileinputstream = new FileInputStream(filename);
			int count = fileinputstream.read();
			//System.out.println(count);
			while(((count=fileinputstream.read())!=-1)) {
				System.out.println((char)count);
			}
			System.out.println("File is read successfully!");
			fileinputstream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

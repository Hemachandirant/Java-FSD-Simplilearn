package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFile {

	public static void main(String[] args) {
		
		copyFile("abc.txt", "aac.txt");
		
	}
	
	public static void copyFile(String inputfile, String outputfile) {
		try {
			FileInputStream input = new FileInputStream(inputfile);
			FileOutputStream output = new FileOutputStream(outputfile);
			
			int count ;
			while((count = input.read())!=-1) {
				output.write(count);
			}
			System.out.println("File is copied");
			input.close();
			output.close();
		} catch (IOException e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
		
	}

}

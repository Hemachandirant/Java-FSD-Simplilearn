package filehandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReadFileintoList {

	public static void main(String[] args) {
		
		List<String> lines = readFileintoList("abc.txt", "C:\\Users\\hemac\\Desktop\\JAVA FSD Simplilearn/");
		//System.out.println(lines);
		for(String line:lines) {
			System.out.println(line);
		}
	

	}
	private static List<String> readFileintoList(String filename, String filepath){
		List <String> lines =Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(filepath+filename),StandardCharsets.UTF_8);
		} catch (Exception e) {
			System.out.println("Erro occured: "+e.getClass());
			System.out.println("Error Message: "+e.getMessage());
			
		}return lines;
		
	}
	
}

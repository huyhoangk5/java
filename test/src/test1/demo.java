package test1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class demo {
	public static void main(String[] args) {	
		String path = "C:\\Users\\Administrator\\eclipse-workspace\\test\\src\\test1\\";
		File file = new File(path + "test.txt");
		
		List<human> humans =new ArrayList<>();
		humans.add(new human("nguyen van a",  28));
		humans.add(new human("nguyen van b",  30));
		humans.add(new human("nguyen thi c",  26));
	}
	public static void writer (File file, human humans) {
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(humans);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void reader(File file) {
		try {
			FileReader fileReader = new FileReader(file);
			int a = 0;
			while ((a = fileReader.read()) != -1){
				System.out.println((char) a);
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

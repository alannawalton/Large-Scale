package edu.howardsys363.collections;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Test {
	
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Alanna/workspace/JavaCollections/src/main/resources/nomials.txt");
		FileInputStream fis = new FileInputStream(file);
		 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] array = line.split(";"); 
			Polynomial poly = new Polynomial();
			for (int i=1; i < array.length; i = i+2) {
				poly.Insert(Integer.parseInt(array[i]), Integer.parseInt(array[i+1]));
				System.out.println(array[0]+ "(X)" + " = " + poly.Product());
			}
			
			
		}
	 
		br.close();

	}
	
}

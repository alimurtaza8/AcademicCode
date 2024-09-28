package filling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FillingPractice {

	public static void main(String[] args) {

//		String filePath = "myfile.txt";
//
//		
//		try {
//            FileReader fileReader = new FileReader(filePath);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
		
		
	
		// For numeric data
		
		
		
		String filePath = "myfile1.txt";
		
		
		try {
			FileReader fileReader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			int sum = 0;
			
			String line;
			while((line = bufferedReader.readLine()) !=null) {
				
				int number = Integer.parseInt(line);
				sum +=number;
			}
			bufferedReader.close();
			System.out.println("result is "+ sum);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		

		
	}

}

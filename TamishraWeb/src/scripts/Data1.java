package scripts;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Data1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("/Users/priyabratahota/Documents/TamiTxt.txt");
		BufferedReader br= new BufferedReader(new InputStreamReader(fis));
		
//		System.out.println(br.readLine());
		String value;
		while((value=br.readLine()) !=null) {
			
			System.out.println(value);
		}
	}

}

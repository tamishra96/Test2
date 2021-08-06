package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Data3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("/Users/priyabratahota/Documents/Tamiexc1.xlsx");
		
		Xls_Reader reader= new Xls_Reader("/Users/priyabratahota/Documents/Tamiexc1.xlsx");
		
		String p2=reader.getCellData("Sheet 1", "Uname", 3);
		System.out.println(p2);
		
	}

}

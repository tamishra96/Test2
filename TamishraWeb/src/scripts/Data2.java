package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Data2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("/Users/priyabratahota/eclipse-workspace/TamishraWeb/src/scripts/OR.property");
		
		Properties pr= new Properties();
		
		pr.load(fis);
		
		String p1=pr.getProperty("bing.search");
		System.out.println(p1);

	}

}

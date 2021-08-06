package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://login.salesforce.com/");
		
		String value=wd.findElement(By.id("Login")).getAttribute("value");
		System.out.println(value);
		
		Thread.sleep(6500);
		wd.quit();
		

	}

}

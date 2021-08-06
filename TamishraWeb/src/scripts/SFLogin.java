package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SFLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://login.salesforce.com/?locale=in");
		
		wd.findElement(By.id("username")).sendKeys("surendra9863258@mailinator.com");
		wd.findElement(By.id("password")).sendKeys("NewPass@123");
		wd.findElement(By.id("rememberUn")).click();
		wd.findElement(By.id("Login")).click();
		
		Thread.sleep(6500);
		wd.quit();
		

	}

}

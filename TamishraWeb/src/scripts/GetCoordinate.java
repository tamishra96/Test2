package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCoordinate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://login.salesforce.com/");
		
		Point p=wd.findElement(By.id("Login")).getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Dimension d=wd.findElement(By.id("Login")).getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
	
		
		Thread.sleep(6500);
		wd.quit();
		

	}

}

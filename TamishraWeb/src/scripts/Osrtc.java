package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Osrtc {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		wd.manage().window().fullscreen();
		
		wd.get("https://www.redbus.in/");
		Thread.sleep(6500);
		
		wd.findElement(By.id("src")).click();
		wd.findElement(By.id("src")).sendKeys("Bhubaneswar");
				
		
		Thread.sleep(6500);
		wd.quit();

	}
}

package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://www.bing.com/");
		
		wd.findElement(By.id("sb_form_q")).sendKeys("Tamishra");
		
		List<WebElement> ob=wd.findElements(By.xpath("//span[@class='sa_tm_text']"));
		
		Thread.sleep(6500);
		wd.quit();//to terminate the browser

	}

}

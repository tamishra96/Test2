package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindElements {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://www.bing.com/");
		
		List<WebElement> objects=wd.findElements(By.tagName("a"));
		System.out.println(objects.size());
		
		Thread.sleep(6500);
		wd.quit();
	}

}

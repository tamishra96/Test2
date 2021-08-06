package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingAuto {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.bing.com/");
		
//		wd.findElement(By.id("sb_form_q")).sendKeys("Tamish");
//		List<WebElement> auto=wd.findElements(By.xpath("//span[@class='sa_tm_text']"));
//		System.out.println(auto.size());
		
		Thread.sleep(6500);
		wd.quit();

	}

}

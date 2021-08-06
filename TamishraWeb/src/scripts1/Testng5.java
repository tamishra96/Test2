package scripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng5 {
  @Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://www.bing.com/");
		
		wd.findElement(By.id("sb_form_q")).sendKeys("Tamishra");
		
//		List<WebElement> ob=wd.findElements(By.xpath("//span[@class='sa_tm_text']"));
		
		Thread.sleep(6500);
		wd.quit();//to terminate the browser

  }
}

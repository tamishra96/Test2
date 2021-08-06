package scripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng3 {
  @Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://jqueryui.com/datepicker/");
		
		WebElement fr=wd.findElement(By.className("demo-frame"));
		
		wd.switchTo().frame(fr);
		
		wd.findElement(By.id("datepicker")).click();
		
		wd.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		wd.findElement(By.linkText("9")).click();
		
		
		Thread.sleep(6500);
		wd.quit();
  }
}

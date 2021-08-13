package scripts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/tamishra/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://login.salesforce.com/?locale=in");
		
		wd.findElement(By.id("username")).sendKeys("surendra9863258@mailinator.com");
		wd.findElement(By.id("password")).sendKeys("NewPass@123");
		wd.findElement(By.id("rememberUn")).click();
		wd.findElement(By.id("Login")).click();
		Thread.sleep(9500);
		
		//xpath-tagname[contains(text(),'text value')]
		wd.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
		wd.findElement(By.className("slds-align-middle")).click();
		Thread.sleep(9500);
		
		WebElement fr1=wd.findElement(By.xpath("//iframe[@title='New User ~ Salesforce - Developer Edition']"));
		wd.switchTo().frame(fr1);
		
		
		wd.findElement(By.xpath("//input[@id='name_firstName']")).sendKeys("Tamishra");
		
		Set<String> mul=wd.getWindowHandles();
		Iterator<String> win=mul.iterator();
		String first=win.next();
		String second=win.next();
		
		wd.switchTo().window(second);
		
		wd.findElement(By.xpath("//img[@alt='Call Center Lookup (New Window)']")).click();
		WebElement dd=wd.findElement(By.id("searchFrame"));
		wd.switchTo().frame(dd);
		wd.findElement(By.id("lksrch")).sendKeys("Tamishra");
		
	
		Thread.sleep(6500);
		wd.quit();
		
	}
	

}

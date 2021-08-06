package scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		wd.get("https://login.salesforce.com/?locale=in");
		
		wd.findElement(By.id("username")).sendKeys("surendra9863258@mailinator.com");
		wd.findElement(By.id("password")).sendKeys("NewPass@123");
		wd.findElement(By.id("rememberUn")).click();
		WebDriverWait wait= new WebDriverWait(wd,45);
		/*
		 * for an element
		 * for an alert
		 * attribute to display there r multiple conditions we can use on this explicit wait 
		 */
		wait.until(ExpectedConditions.alertIsPresent());
		
		wd.findElement(By.id("Login")).click();
		Thread.sleep(9500);
		
		//xpath-tagname[contains(text(),'text value')]
		wd.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
		wd.findElement(By.className("slds-align-middle")).click();
		Thread.sleep(9500);
		
		WebElement fr1=wd.findElement(By.xpath("//iframe[@title='New User ~ Salesforce - Developer Edition']"));
		wd.switchTo().frame(fr1);
		
		
		wd.findElement(By.xpath("//input[@id='name_firstName']")).sendKeys("Tamishra");
		wd.findElement(By.id("name_lastName")).sendKeys("Senapati");
		wd.findElement(By.id("Alias")).sendKeys("Alias");
		wd.findElement(By.id("Email")).sendKeys("Email");
		wd.findElement(By.id("Username")).sendKeys("Username");
		wd.findElement(By.id("CommunityNickname")).sendKeys("CommunityNickname");
		wd.findElement(By.id("Title")).sendKeys("Title");
		wd.findElement(By.id("CompanyName")).sendKeys("CompanyName");
		wd.findElement(By.id("Department")).sendKeys("Department");
		wd.findElement(By.id("Division")).sendKeys("Division");
		
		WebElement dd1=wd.findElement(By.id("role"));
		Select s= new Select(dd1);
		s.selectByVisibleText("Channel Sales Team");
		
		WebElement dd2=wd.findElement(By.id("user_license_id"));
		Select s1=new Select(dd2);
		s1.selectByVisibleText("Force.com - App Subscription");
		
		WebElement dd3=wd.findElement(By.id("EmailEncodingKey"));
		Select s2= new Select(dd3);
		s2.selectByVisibleText("Japanese (Shift-JIS)");
		
		WebElement dd4=wd.findElement(By.id("TimeZoneSidKey"));
		Select s3= new Select(dd4);
		s3.selectByVisibleText("(GMT+13:00) Phoenix Islands Time (Pacific/Enderbury)");
		
		WebElement dd5=wd.findElement(By.id("LocaleSidKey"));
		Select s4= new Select(dd5);
		s4.selectByVisibleText("English (India)");
		
		WebElement dd6=wd.findElement(By.id("LanguageLocaleKey"));
		Select s5= new Select(dd6);
		s5.selectByVisibleText("English");
		
		WebElement dd7=wd.findElement(By.id("receiveApprovalsEmails"));
		Select s6= new Select(dd7);
		s6.selectByValue("SEND_APPROVER");
		
		wd.findElement(By.id("new_password")).click();
		
		wd.findElement(By.className("btn")).click();
		
		Thread.sleep(6500);
		wd.quit();
		
	}
	

}

package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	WebDriver wd;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/tamishra/chromedriver");
		wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wd.manage().deleteAllCookies();
		wd.get("https://freecrm.com/");
		
	}
	
	@Test
	public void verifyPageTitleTest() {
		String title= wd.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
	}
	
	@Test
	public void FreeCRMLogoTest() {
		boolean flag= wd.findElement(By.xpath("//a[@title='free crm home'][1]")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown() {
		
		wd.quit();
	}

}

package scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
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
		login("tamishra", "test@123");
		
	}
	
	@Test
	public void clickOnContactsLinkTest() {
		
	}
	
	@Test
	public void clickOnDeals() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		wd.quit();
	}
	
	public void login(String username, String password) {
		
		
		
	}

}

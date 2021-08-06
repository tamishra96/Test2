package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://ui.cogmento.com/");
		Thread.sleep(9500);
		
		String value=wd.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).getText();
		System.out.println(value);
		
		
		Thread.sleep(6500);
		wd.quit();
		
		
		

	}

}

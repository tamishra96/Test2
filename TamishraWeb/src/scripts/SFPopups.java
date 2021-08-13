package scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFPopups {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/tamishra/chromedriver");
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver wd= new ChromeDriver(opt);
		
		wd.manage().window().maximize();
		
		
		wd.get("https://login.salesforce.com/?locale=in");
		
		wd.findElement(By.id("username")).sendKeys("surendra9863258@mailinator.com");
		wd.findElement(By.id("password")).sendKeys("NewPass@123");
		wd.findElement(By.id("rememberUn")).click();
		wd.findElement(By.id("Login")).click();
		Thread.sleep(9500);
//		WebDriverWait wait= new WebDriverWait(wd,55);
//		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id=\"1119:0\"]/div/div/a")));
		
		
		
		WebElement w1= wd.findElement(By.xpath("//*[@id=\"1119:0\"]/div/div/a"));
		highLighterMethod(wd,w1);
		w1.click();
		wd.findElement(By.className("slds-align-middle")).click();
		Thread.sleep(9500);
		
		WebElement fr1=wd.findElement(By.xpath("//iframe[@title='New User ~ Salesforce - Developer Edition']"));
		wd.switchTo().frame(fr1);
		
		
		
		JavascriptExecutor js= (JavascriptExecutor) wd;
		
		//1.scrolling by using pixel
//		js.executeScript("window.scrollBy(0,4000)","");
		
		//2.scrolling till we find element
		WebElement np= wd.findElement(By.xpath("//img[@alt='Call Center Lookup (New Window)']"));
//		Thread.sleep(6500);
		js.executeScript("arguments[0].scrollIntoView();", np);
		
		//3.scroll page till bottom
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
//		WebElement d1= wd.findElement(By.xpath("//img[@alt='Call Center Lookup (New Window)']"));
		highLighterMethod(wd,np);
		np.click();
		Thread.sleep(6500);
		System.out.println("highlighter worked");
		
		Set<String> str = wd.getWindowHandles();
//		System.out.println(str);
//		System.out.println(str.size());
		Thread.sleep(6500);
		Iterator<String> it= str.iterator();
		String fst= it.next();
		System.out.println("Parent window id: "+fst);
		
		String fst1= it.next();
		System.out.println("Child window id: "+fst1);
	
		
		//wd.findElement(By.xpath("//img[@alt='Call Center Lookup (New Window)']")).click();
		
		wd.switchTo().window(fst1);
		System.out.println("Switching to next window");
		WebElement dd=wd.findElement(By.id("searchFrame"));
		wd.switchTo().frame(dd);
		
//		highLighterMethod(wd,dd);
		System.out.println("entering dd");
		WebElement dd2= wd.findElement(By.id("lksrch"));
		highLighterMethod(wd,dd2);
		System.out.println("entering dd2");
		dd2.sendKeys("Tamishra");
		Thread.sleep(6500);
		wd.findElement(By.xpath("//input[@class='btn']")).click();
		Thread.sleep(6500);
		
		wd.close();
		
		wd.switchTo().window(fst);
		
		
		
		
		
		
		Thread.sleep(9500);
		wd.quit();

	}

	private static void highLighterMethod(WebDriver wd, WebElement element) {
		// TODO Auto-generated method stub
		
		JavascriptExecutor js1 = (JavascriptExecutor) wd;
		js1.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		
	}

}

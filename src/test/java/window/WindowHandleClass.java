package window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowHandleClass {
	
	WebDriver driver;
	@Test
	public void windowHandle() throws InterruptedException {
		String url = "https://www.toolsqa.com/";
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
//		Thread.sleep(8000);
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ESCAPE);
		
		Thread.sleep(000);
		WebElement demoSite = driver.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[3]/a"));
		demoSite.click();
		
		Set<String> openWindows = driver.getWindowHandles();
		System.out.println(openWindows);
		
		Iterator<String> iterator =  openWindows.iterator();
		
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//*[text()='Elements']")).isDisplayed();
		System.out.println("Element Displayed");
		System.out.println("Child Window Handle");
		driver.switchTo().window(parentWindow);
		System.out.println("Switched Parent Window");
//		WebElement demoSite2 = driver.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[3]/a"));
//		demoSite2.click();
	}
	
	

}

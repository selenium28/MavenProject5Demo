package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestClass extends StepBaseClass{
	
	@Test
	public void test() {
		
		WebElement userName2 = driver.findElement(By.id("txtUsername"));
		userName2.sendKeys("Admin");
		
		WebElement password1 = driver.findElement(By.name("txtPassword"));
		password1.sendKeys("admin123");
		
		WebElement loginbutton1 = driver.findElement(By.id("btnLogin"));
		loginbutton1.click();
		
	}
	
	@Test
	public void invalidtest() {
		
		WebElement userName2 = driver.findElement(By.id("txtUsername"));
		userName2.sendKeys("Admin23");
		
		WebElement password1 = driver.findElement(By.name("txtPassword"));
		password1.sendKeys("admin12343");
		
		WebElement loginbutton1 = driver.findElement(By.id("btnLogin"));
		loginbutton1.click();
		
	}
	
	

}

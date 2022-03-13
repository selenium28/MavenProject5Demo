package Demo.MavenProject5Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MavenTest {
	WebDriver driver;
	
  @Test
  public void test() {
	  System.out.println("Maven Test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  	String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

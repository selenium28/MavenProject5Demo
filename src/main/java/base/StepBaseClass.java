package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class StepBaseClass {

	WebDriver driver;
	@BeforeMethod
	public void setup() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}

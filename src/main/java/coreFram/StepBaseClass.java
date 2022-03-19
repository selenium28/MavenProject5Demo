package coreFram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepBaseClass {
	public static WebDriver driver;

	public void setup() {
		String url = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void teardown() {
		driver.quit();
	}

}

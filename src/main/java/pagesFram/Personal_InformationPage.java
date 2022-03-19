package pagesFram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreFram.StepBaseClass;

public class Personal_InformationPage extends StepBaseClass{

	
	@FindBy(xpath="//*[@id='customer_firstname']")
	WebElement firstName;
	
	public Personal_InformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void firstName(String fname) {
		firstName.sendKeys(fname);
	}
}

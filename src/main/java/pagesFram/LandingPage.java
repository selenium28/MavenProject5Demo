package pagesFram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreFram.StepBaseClass;

public class LandingPage extends StepBaseClass{
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement signButton;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void signClick() {
		signButton.click();
	}

}

package pagesFram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreFram.StepBaseClass;


public class LoginClass extends StepBaseClass {
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement emailID;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	WebElement createAccount;
	
	public LoginClass() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email) {
		emailID.sendKeys(email);
	}
	
	public void createAccount() {
		createAccount.click();
	}
	
}

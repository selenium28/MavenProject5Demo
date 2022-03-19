package testScripts;

import org.testng.annotations.Test;

import coreFram.StepBaseClass;
import pagesFram.LandingPage;
import pagesFram.LoginClass;
import pagesFram.Personal_InformationPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RunnerTest extends StepBaseClass{
	
	LandingPage objLandingPage;
	LoginClass objLoginClass;
	Personal_InformationPage objPersonal_InformationPage;

  @BeforeTest
  public void beforeTest() {
	 setup(); 
	 System.out.println("Automation Test Browser Launced");
  }

  @Test
  public void landingTest() {
	  objLandingPage = new LandingPage();
	  objLandingPage.signClick();
	  System.out.println("Click on SignIN Button");
  }
  
  @Test (dependsOnMethods = {"landingTest"})
  public void loginClass() throws InterruptedException {
	  String emailID = "devdubale.aress@gmail.com";
	  
	  objLoginClass = new LoginClass();
	  objLoginClass.enterEmail(emailID);
	  objLoginClass.createAccount();
	  Thread.sleep(5000);
	  System.out.println("Enter Email id and Clicked on createAccountButton");
  }
  
  @Test (dependsOnMethods = {"loginClass"})
  public void personalInformationTest() throws InterruptedException {
	  String firstName = "Dev";
	  
	  objPersonal_InformationPage = new Personal_InformationPage();
	  Thread.sleep(5000);
	  objPersonal_InformationPage.firstName(firstName);
	  System.out.println("Entered Personal Information");
  }
  
  
  @AfterTest
  public void afterTest() {
	  teardown();
  }

}

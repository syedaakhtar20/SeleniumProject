package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserStackTestClass {
	WebDriver driver;
	
	

	BrowserStackHomePage browserHp= new BrowserStackHomePage(driver);
	
	BrowserStackSignupPage browserStackSignupPg = new BrowserStackSignupPage(driver);
	
	@Test
	public void bowserStackPagefactorytest() {
		driver= new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
	//	browserHp.veryHeader();
		browserHp.clickOnGetStartedFreeBtn();
		
		browserStackSignupPg.enterFullName();
		browserStackSignupPg.enterBusinessEmail();
		browserStackSignupPg.enterPasswrod();
		browserStackSignupPg.clickOnAgreeBtn();
		browserStackSignupPg.clickOnSignUpBtn();
		
	}
}

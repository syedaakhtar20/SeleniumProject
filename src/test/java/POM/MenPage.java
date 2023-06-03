package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenPage {

	WebDriver driver;
	
	protected MenPage(WebDriver driver){
		this.driver=driver;
	}
	
	By blueJeans= By.cssSelector("a[aria-label='Add “Basic Blue Jeans” to your cart']");
	
	protected void clickOnBasicBlueJeans() {
		driver.findElement(blueJeans).click();
	}
	
}

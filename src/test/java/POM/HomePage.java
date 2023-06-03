package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
	protected HomePage(WebDriver driver) {
		
		this.driver= driver;
	}
	
	By storeMenu=By.cssSelector("li[id='menu-item-1227'] a");
	
	
	public void clickOnStoreMenu() {
		
		driver.findElement(storeMenu).click();
		
	//	return new StorePage(driver);
	}
		
		

}

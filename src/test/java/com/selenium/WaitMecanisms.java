package com.selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitMecanisms {
	
	WebDriver driver;
	
	@Test
	public void impliciteWaitmanage() {
		
		driver= new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@href='/practice']")).click();
		
		driver.findElement(By.cssSelector("a[href='/home']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='ALL COURSES']")).click();
		
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		
		driver.findElement(By.id("login")).click();
		
		//WebDriverWait class using for Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='error']")));
		
		System.out.println(driver.findElement(By.xpath("//span[@class='error']")).getText());
		
	}
	
	@Test
	public void explicitWaitMechanism() {
		
		driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Reset Login']")));
		driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
		
		driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Go to Login']")));
		driver.findElement(By.xpath("//button[normalize-space()='Go to Login']")).click();
	}

}

package com.git.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "c:/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.get("https://gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("mailsharmilarao@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("pasas");
		Thread.sleep(2000);
		WebElement clickOnNext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='RveJvd snByac']")));
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		clickOnNext.click();
	}
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}

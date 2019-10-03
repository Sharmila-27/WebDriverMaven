package com.git.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	public void doLogin() {
		
		driver.get("https://gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("mailsharmilarao@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));	
		driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
	}
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}

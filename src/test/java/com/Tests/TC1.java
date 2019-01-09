package com.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.LoginPage1;
import com.Pages.LoginPage2;

public class TC1 {
	static WebDriver driver;
	LoginPage1 lp1;
	LoginPage2 lp2;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel Drivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/mail");		
	}
	
	@Test (priority =0)
	public void test1() {
		lp1.setMail("mail123@gmail.com");
		lp1.clickNext();
	}
	@Test (priority = 1)
	public void test2() {
		lp2.setPassword("test@123");
		lp2.clickNextBtn();
	}
	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}
}

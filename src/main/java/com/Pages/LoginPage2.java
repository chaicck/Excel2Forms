package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {
	WebDriver driver;
	
	public LoginPage2(WebDriver driver){
		this.driver = driver;
	}
	
	//Elements
	
	By password = By.xpath("//input[@name='password']");
	By forgotPwd = By.xpath("//span[contains(),'Forgot password?']");
	By next2 = By.xpath("//div[@id='passwordNext']//div[@class='ZFr60d CeoRYc']");
	
	public void setPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickForgotPwd() {
		driver.findElement(forgotPwd).click();
	}
	
	public void clickNextBtn() {
		driver.findElement(next2).click();
	}
	
}

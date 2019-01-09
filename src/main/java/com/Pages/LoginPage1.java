package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
	WebDriver driver;
	
	public LoginPage1(WebDriver driver){
		this.driver = driver;
	}
	
	//Elements
	By mail = By.id("identifierId");
	By forgotMail = By.linkText("Forgot email?");
	By createAcc = By.xpath("span//[@class='RveJvd snByac']");
	By next = By.xpath("//span[contains(),'Next']");
	
	public void setMail(String email) {
		driver.findElement(mail).sendKeys(email);
	}
	
	public void clickForgotMail() {
		driver.findElement(forgotMail).click();
	}
	
	public void clickCreateAcc() {
		driver.findElement(createAcc).click();
	}
	
	public void clickNext() {
		driver.findElement(next).click();
	}

}

package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forms_HomePage {
	WebDriver driver;
	
	public Forms_HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	//Elements
	By forms = By.xpath("//span[contains(),'Forms']");
	By blank = By.xpath("//div[@class='docs-homescreen-templates-templateview-preview docs-homescreen-templates-templateview-preview-showcase']");
	
	public void verifyTitle(String actTitle) {
		String title = driver.findElement(forms).getText();
		if(title.equals(actTitle)) {
			
		}else{
			
		}
	}
	
	public void clickBlankForm() {
		driver.findElement(blank).click();
	}
	

}

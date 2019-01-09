package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forms_UntitledForm {
	WebDriver driver;
	
	public Forms_UntitledForm(WebDriver driver){
		this.driver = driver;
	}
	
	//Elements
	By questions = By.xpath("//content[contains(),'Questions']");
	By responses = By.xpath("//div[contains(text(),'Responses')]");
	By formTitle = By.xpath("//textarea[contains(text(),'Untitled form')]");
	By formDesc = By.xpath("//textarea[@class='quantumWizTextinputPapertextareaInput exportTextarea']");
	By untitledQues = By.xpath("//textarea[contains(text(),'Untitled Question')]");
	By option1 = By.xpath("//input[@value='Option 1']");
	By addOption = By.xpath("//div[@class='quantumWizTextinputSimpleinputEl docssharedWizOmnilistGhostitemInput freebirdFormeditorViewOmnilistGhostitemInput freebirdThemedInput']//input[@type='text']");
	By option2 = By.xpath("//input[@value='Option 2']");
	By option3 = By.xpath("//input[@value='Option 3']");
	By option4 = By.xpath("//input[@value='Option 4']");

	By delete = By.xpath("//div[@class='quantumWizButtonEl quantumWizButtonPapericonbuttonEl quantumWizButtonPapericonbuttonLight freebirdFormeditorViewItemDeleteButton itemHideInactive freebirdFormeditorViewItemWide isUndragged']//div[@class='freebirdMaterialIconIconImage freebirdMaterialIconIconDarkIcon freebird-qp-icon-trash-b']");
	By duplicate = By.xpath("//div[@class='freebirdMaterialIconIconImage freebirdMaterialIconIconDarkIcon freebird-qp-icon-copy-b']");
	By required = By.xpath("//div[@id='i2']//div[@class='quantumWizTogglePapertoggleThumb exportThumb']");
	
	By send = By.xpath("//div[@class='quantumWizButtonEl quantumWizButtonPaperbuttonEl quantumWizButtonPaperbuttonRaised quantumWizButtonPaperbutton2El2 freebirdFormeditorViewHeaderHeaderMenu freebirdFormeditorViewHeaderSendButton freebirdThemedText isUndragged']//div[@class='quantumWizButtonPaperbuttonFocusOverlay exportOverlay']");
		
	
	public void clickQuestions() {
		driver.findElement(questions).click();
	}

	public void clickResponses() {
		driver.findElement(responses).click();
	}	
	
	public void setUntitledForm(String title) {
		driver.findElement(formTitle).sendKeys(title);
	}
	
	public void setFormDesc(String desc) {
		driver.findElement(formDesc).sendKeys(desc);
	}
	
	public void setQuestion(String ques) {
		driver.findElement(untitledQues).sendKeys(ques);
	}
	
	public void clickAddOption() {
		driver.findElement(addOption).click();
	}
	
	public void setOption1(String op1) {
		driver.findElement(option1).sendKeys(op1);
	}
	
	public void setOption2(String op2) {
		driver.findElement(option1).sendKeys(op2);
	}
	
	public void setOption3(String op3) {
		driver.findElement(option1).sendKeys(op3);
	}
	
	public void setOption4(String op4) {
		driver.findElement(option1).sendKeys(op4);
	}
	
	public void clickDuplicate() {
		driver.findElement(duplicate).click();
	}
	
	public void clickDelete() {
		driver.findElement(delete).click();
	}
}

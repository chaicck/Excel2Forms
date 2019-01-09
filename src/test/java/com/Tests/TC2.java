package com.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Pages.Forms_HomePage;
import com.Pages.Forms_UntitledForm;
import com.Utils.Excel_ReadData;

public class TC2 {
	static WebDriver driver;
	Forms_HomePage fhp;
	Forms_UntitledForm fuf;
	Excel_ReadData erd;
	
	@Test (priority =0)
	public void test3() {
		fhp.verifyTitle("Forms");
		fhp.clickBlankForm();
	}
	
	@Test (priority =1)
	public void test4() {
		fuf.clickQuestions();
		fuf.setUntitledForm("new");
		fuf.setFormDesc("test");
		fuf.setQuestion("First");
	}

}

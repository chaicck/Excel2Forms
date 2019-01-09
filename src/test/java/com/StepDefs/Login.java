package com.StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	static WebDriver driver;
	
	@Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("");
    }

    @When("^user navigate to Login page$")
    public void user_navigate_to_login_page() throws Throwable {
        throw new PendingException();
    }

    @Then("^Logged in successfully$")
    public void logged_in_successfully() throws Throwable {
        throw new PendingException();
    }

    @And("^user enters UserName and Password$")
    public void user_enters_username_and_password() throws Throwable {
        throw new PendingException();
    }


}

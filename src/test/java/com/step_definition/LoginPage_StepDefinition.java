package com.step_definition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.runner_class.Test_Runner;
import com.utils.adactinworks.Base_Class;
import com.utils.adactinworks.FileReadManager;
import com.utils.adactinworks.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_StepDefinition extends Base_Class{
	
	public static WebDriver driver = Test_Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("user Launch The Application")
	public void user_launch_the_application() throws InterruptedException, FileNotFoundException, IOException {
	   System.out.println("user Launch The Application");
	   
	   getUrl(FileReadManager.getInstanceFRM().getInstanceCR().getUrlProps());
	}

	@When("user Enters The Username")
	public void user_enters_the_username() throws InterruptedException, FileNotFoundException, IOException {
	   System.out.println("user Enters The Username");
	   elementHighlighter(pom.getInstanceLoginPage().getUserName());
	   inputText(pom.getInstanceLoginPage().getUserName(), FileReadManager.getInstanceFRM().getInstanceCR().getUserNameProps());
	}

	@When("user Enters The Password")
	public void user_enters_the_password() throws InterruptedException, FileNotFoundException, IOException {
	  System.out.println("user Enters The Password");
	  elementHighlighter(pom.getInstanceLoginPage().getPassword());
	  inputText(pom.getInstanceLoginPage().getPassword(), FileReadManager.getInstanceFRM().getInstanceCR().getPasswordProps());

	}

	@Then("user Clicks The LoginButton then Its Navigate To SearchHotelPage")
	public void user_clicks_the_login_button_then_its_navigate_to_search_hotel_page() throws InterruptedException {
	    System.out.println("user Clicks The LoginButton then Its Navigate To SearchHotelPage");
	    elementHighlighter(pom.getInstanceLoginPage().getLogin());
		clickWebElement(pom.getInstanceLoginPage().getLogin());

	}
}

package com.step_definition;

import org.openqa.selenium.WebDriver;

import com.runner_class.Test_Runner;
import com.utils.adactinworks.Base_Class;
import com.utils.adactinworks.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectHotelPage_StepDefinition extends Base_Class{
	
	public static WebDriver driver = Test_Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	
	@When("user Clicks On The RadioButton")
	public void user_clicks_on_the_radio_button() throws InterruptedException {
		
		System.out.println("user Clicks On The RadioButton");
		elementHighlighter(pom.getInstanceSearchHotelPage().getRadioBtn1());
		clickWebElement(pom.getInstanceSearchHotelPage().getRadioBtn1());
	}

	@Then("user Clicks The ContinueButton then Its Navigate To BookAHotelPage")
	public void user_clicks_the_continue_button_then_its_navigate_to_book_a_hotel_page() throws InterruptedException {
		
		System.out.println("user Clicks The ContinueButton then Its Navigate To BookAHotelPage");
		elementHighlighter(pom.getInstanceSearchHotelPage().getContinueNext());
		clickWebElement(pom.getInstanceSearchHotelPage().getContinueNext());
		
	}
	
}

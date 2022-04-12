package com.step_definition;

import org.openqa.selenium.WebDriver;

import com.runner_class.Test_Runner;
import com.utils.adactinworks.Base_Class;
import com.utils.adactinworks.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookAHotelPage_StepDefinition extends Base_Class{

	public static WebDriver driver = Test_Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@When("user Enters The FirstName")
	public void user_enters_the_first_name() throws InterruptedException {

		System.out.println("user Enters The FirstName");
		elementHighlighter(pom.getInstanceBookAHotelPage().getFirstName());
		inputText(pom.getInstanceBookAHotelPage().getFirstName(), "Karthick");

	}

	@When("user Enters The LastName")
	public void user_enters_the_last_name() throws InterruptedException {

		System.out.println("user Enters The LastName");
		elementHighlighter(pom.getInstanceBookAHotelPage().getLastName());
		inputText(pom.getInstanceBookAHotelPage().getLastName(), "Boopathy");

	}

	@When("user Enters The BillingAddress")
	public void user_enters_the_billing_address() throws InterruptedException {

		System.out.println("user Enters The BillingAddress");
		elementHighlighter(pom.getInstanceBookAHotelPage().getAddress());
		inputText(pom.getInstanceBookAHotelPage().getAddress(), "4 mvk street");

	}

	@When("user Enters The CreditCardNumber")
	public void user_enters_the_credit_card_number() throws InterruptedException {
		
		System.out.println("user Enters The CreditCardNumber");
		elementHighlighter(pom.getInstanceBookAHotelPage().getCreditCardNumber());
		inputText(pom.getInstanceBookAHotelPage().getCreditCardNumber(), "1234567894561237");
		
	}

	@When("user Enters The CreditCardType")
	public void user_enters_the_credit_card_type() throws InterruptedException {
		
		System.out.println("user Enters The CreditCardType");
		elementHighlighter(pom.getInstanceBookAHotelPage().getCreditCardType());
		dropDown(pom.getInstanceBookAHotelPage().getCreditCardType(), "visibletext", "American Express");
		
	}

	@When("user Enters The CardExpiryMonthandYear")
	public void user_enters_the_card_expiry_monthand_year() throws InterruptedException {
		
		System.out.println("user Enters The CardExpiryMonthandYear");
		elementHighlighter(pom.getInstanceBookAHotelPage().getCardExpiredMonth());
		dropDown(pom.getInstanceBookAHotelPage().getCardExpiredMonth(), "visibletext", "August");
		
		elementHighlighter(pom.getInstanceBookAHotelPage().getCardExpiredYear());
		dropDown(pom.getInstanceBookAHotelPage().getCardExpiredYear(), "visibletext", "2022");
		
	}

	@When("user Enters The CVVNumber")
	public void user_enters_the_cvv_number() throws InterruptedException {
		
		System.out.println("user Enters The CVVNumber");
		elementHighlighter(pom.getInstanceBookAHotelPage().getCardCvv());
		inputText(pom.getInstanceBookAHotelPage().getCardCvv(), "456");
		Thread.sleep(3000);
		
	}

	@Then("user Clicks On BookHotelButton")
	public void user_clicks_on_book_hotel_button() throws InterruptedException {
		
		System.out.println("user Clicks On BookHotelButton");
		elementHighlighter(pom.getInstanceBookAHotelPage().getCancel());
		clickWebElement(pom.getInstanceBookAHotelPage().getCancel());
		
	}
}

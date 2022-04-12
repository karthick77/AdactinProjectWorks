package com.step_definition;

import org.openqa.selenium.WebDriver;

import com.runner_class.Test_Runner;
import com.utils.adactinworks.Base_Class;
import com.utils.adactinworks.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotelPage_StepDefinition extends Base_Class{


	public static WebDriver driver = Test_Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);


	@When("user Selects Hotel Location")
	public void user_selects_hotel_location() throws InterruptedException {

		System.out.println("user Selects Hotel Location");
		elementHighlighter(pom.getInstanceSelectHotelPage().getLocation());
		dropDown(pom.getInstanceSelectHotelPage().getLocation(), "visibletext", "Sydney");

	}

	@When("user Selects Hotel")
	public void user_selects_hotel() throws InterruptedException {
		
		System.out.println("user Selects Hotel");
		elementHighlighter(pom.getInstanceSelectHotelPage().getHotels());
		dropDown(pom.getInstanceSelectHotelPage().getHotels(), "visibletext", "Hotel Creek");
		
	}

	@When("user Selects RoomType")
	public void user_selects_room_type() throws InterruptedException {
		
		System.out.println("user Selects RoomType");
		elementHighlighter(pom.getInstanceSelectHotelPage().getRoomType());
		dropDown(pom.getInstanceSelectHotelPage().getRoomType(), "visibletext", "Standard");
		
	}

	@When("user Selects NoOfRooms")
	public void user_selects_no_of_rooms() throws InterruptedException {
		
		System.out.println("user Selects NoOfRooms");
		elementHighlighter(pom.getInstanceSelectHotelPage().getRoomNumbers());
		dropDown(pom.getInstanceSelectHotelPage().getRoomNumbers(), "visibletext", "1 - One");
		
	}

	@When("user Enters CheckInDate")
	public void user_enters_check_in_date() throws InterruptedException {
		
		System.out.println("user Enters CheckInDate");
		elementHighlighter(pom.getInstanceSelectHotelPage().getDataPickIn());
		clearText(pom.getInstanceSelectHotelPage().getDataPickIn());
		Thread.sleep(1000);
		inputText(pom.getInstanceSelectHotelPage().getDataPickIn(), "10/04/2022");
	}
	

	@When("user Enters CheckOutDate")
	public void user_enters_check_out_date() throws InterruptedException {
		
		System.out.println("user Enters CheckOutDate");
		elementHighlighter(pom.getInstanceSelectHotelPage().getDataPickOut());
		clearText(pom.getInstanceSelectHotelPage().getDataPickOut());
		Thread.sleep(1000);
		inputText(pom.getInstanceSelectHotelPage().getDataPickOut(), "14/04/2022");
		
	}

	@When("user Selects AdultsPerRoom")
	public void user_selects_adults_per_room() throws InterruptedException {
		
		System.out.println("user Selects AdultsPerRoom");
		elementHighlighter(pom.getInstanceSelectHotelPage().getAdult_room());
		dropDown(pom.getInstanceSelectHotelPage().getAdult_room(), "visibletext", "1 - One");
		
	}

	@When("user Selects ChildrenPerRoom")
	public void user_selects_children_per_room() throws InterruptedException {
		
		System.out.println("user Selects ChildrenPerRoom");
		elementHighlighter(pom.getInstanceSelectHotelPage().getChild_room());
		dropDown(pom.getInstanceSelectHotelPage().getChild_room(), "visibletext", "1 - One");
	}

	@Then("user Clicks On The SearchButton then Its Navigate To SelectHotelPage")
	public void user_clicks_on_the_search_button_then_its_navigate_to_select_hotel_page() throws InterruptedException {
		
		System.out.println("user Clicks On The SearchButton then Its Navigate To SelectHotelPage");
		elementHighlighter(pom.getInstanceSelectHotelPage().getSubmit());
		clickWebElement(pom.getInstanceSelectHotelPage().getSubmit());
		
	}


}

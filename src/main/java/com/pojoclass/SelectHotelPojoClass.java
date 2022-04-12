package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPojoClass {
	
	public static WebDriver driver;
	
	public SelectHotelPojoClass(WebDriver driver) {
		SelectHotelPojoClass.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private static WebElement location;
	
	@FindBy(id = "hotels")
	private static WebElement hotels;
	
	@FindBy(id = "room_type")
	private static WebElement roomType;
	
	@FindBy(id = "room_nos")
	private static WebElement roomNumbers;
	
	@FindBy(name = "datepick_in")
	private static WebElement dataPickIn;
	
	@FindBy(name = "datepick_out")
	private static WebElement dataPickOut;
	
	@FindBy(id = "adult_room")
	private static WebElement adult_room;
	
	@FindBy(id = "child_room")
	private static WebElement child_room;
	
	@FindBy(id = "Submit")
	private static WebElement submit;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNumbers() {
		return roomNumbers;
	}

	public WebElement getDataPickIn() {
		return dataPickIn;
	}

	public WebElement getDataPickOut() {
		return dataPickOut;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return submit;
	}

}

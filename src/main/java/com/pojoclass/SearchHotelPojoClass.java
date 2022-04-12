package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPojoClass {
	
	public static WebDriver driver;
	
	public SearchHotelPojoClass(WebDriver driver) {
		SearchHotelPojoClass.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "radiobutton_0")
	private static WebElement radioBtn1;
	
	@FindBy(id = "continue")
	private static WebElement continueNext;

	public WebElement getRadioBtn1() {
		return radioBtn1;
	}

	public WebElement getContinueNext() {
		return continueNext;
	}

}

package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPojoClass {
	
	public static WebDriver driver;
	
	public BookAHotelPojoClass(WebDriver driver) {
		BookAHotelPojoClass.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private static WebElement firstName;
	@FindBy(id="last_name")
	private static WebElement lastName;
	@FindBy(name="address")
	private static WebElement address;
	@FindBy(id="cc_num")
	private static WebElement creditCardNumber;
	@FindBy(id="cc_type")
	private static WebElement creditCardType;
	@FindBy(id="cc_exp_month")
	private static WebElement cardExpiredMonth;
	@FindBy(id="cc_exp_year")
	private static WebElement cardExpiredYear;
	@FindBy(id="cc_cvv")
	private static WebElement cardCvv;
	@FindBy(id="cancel")
	private static WebElement cancel;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	public WebElement getCardExpiredMonth() {
		return cardExpiredMonth;
	}
	public WebElement getCardExpiredYear() {
		return cardExpiredYear;
	}
	public WebElement getCardCvv() {
		return cardCvv;
	}
	public WebElement getCancel() {
		return cancel;
	}

}

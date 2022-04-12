package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoClass {
	
	public static WebDriver driver;
	
	public LoginPojoClass(WebDriver driver) {
		LoginPojoClass.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private static WebElement userName;
	
	@FindBy(id = "password")
	private static WebElement password;
	
	@FindBy(id = "login")
	private static WebElement login;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}

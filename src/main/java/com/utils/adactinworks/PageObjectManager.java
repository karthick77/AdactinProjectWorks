package com.utils.adactinworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pojoclass.BookAHotelPojoClass;
import com.pojoclass.LoginPojoClass;
import com.pojoclass.SearchHotelPojoClass;
import com.pojoclass.SelectHotelPojoClass;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		PageObjectManager.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private LoginPojoClass loginPage;
	private SelectHotelPojoClass selectHotelPage;
	private SearchHotelPojoClass searchHotelPage;
	private BookAHotelPojoClass bookAHotelPage;

	public LoginPojoClass getInstanceLoginPage() {
		loginPage = new LoginPojoClass(driver);
		return loginPage;
	}

	public SelectHotelPojoClass getInstanceSelectHotelPage() {
		selectHotelPage = new SelectHotelPojoClass(driver);
		return selectHotelPage;
	}

	public SearchHotelPojoClass getInstanceSearchHotelPage() {
		searchHotelPage = new SearchHotelPojoClass(driver);
		return searchHotelPage;
	}

	public BookAHotelPojoClass getInstanceBookAHotelPage() {
		bookAHotelPage = new BookAHotelPojoClass(driver);
		return bookAHotelPage;
	}

	
	

}

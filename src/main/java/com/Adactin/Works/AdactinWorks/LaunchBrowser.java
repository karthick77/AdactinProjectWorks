package com.Adactin.Works.AdactinWorks;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.utils.adactinworks.Base_Class;
import com.utils.adactinworks.FileReadManager;
import com.utils.adactinworks.PageObjectManager;

public class LaunchBrowser extends Base_Class{

	public static WebDriver driver;
	public static PageObjectManager pom;
	/*
	 * public static WebDriver driver = Base_Class.getBrowser("chrome"); 
	 * public static PageObjectManager pom = new PageObjectManager(driver);
	 */
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {

		driver = Base_Class.getBrowser(FileReadManager.getInstanceFRM().getInstanceCR().getBrowserProps());
		pom = new PageObjectManager(driver);
		getUrl(FileReadManager.getInstanceFRM().getInstanceCR().getUrlProps());
	
		loginPage();
		selectHotel();
		searchHotel();
		bookAHotel();
		closeBrowser();
	}

	public static void loginPage() throws InterruptedException, FileNotFoundException, IOException {

		elementHighlighter(pom.getInstanceLoginPage().getUserName());
		inputText(pom.getInstanceLoginPage().getUserName(), FileReadManager.getInstanceFRM().getInstanceCR().getUserNameProps());

		elementHighlighter(pom.getInstanceLoginPage().getPassword());
		inputText(pom.getInstanceLoginPage().getPassword(), FileReadManager.getInstanceFRM().getInstanceCR().getPasswordProps());

		elementHighlighter(pom.getInstanceLoginPage().getLogin());
		clickWebElement(pom.getInstanceLoginPage().getLogin());

	}

	public static void selectHotel() throws InterruptedException {
		elementHighlighter(pom.getInstanceSelectHotelPage().getLocation());
		dropDown(pom.getInstanceSelectHotelPage().getLocation(), "visibletext", "Sydney");

		elementHighlighter(pom.getInstanceSelectHotelPage().getHotels());
		dropDown(pom.getInstanceSelectHotelPage().getHotels(), "visibletext", "Hotel Creek");

		elementHighlighter(pom.getInstanceSelectHotelPage().getRoomType());
		dropDown(pom.getInstanceSelectHotelPage().getRoomType(), "visibletext", "Standard");

		elementHighlighter(pom.getInstanceSelectHotelPage().getRoomNumbers());
		dropDown(pom.getInstanceSelectHotelPage().getRoomNumbers(), "visibletext", "1 - One");

		elementHighlighter(pom.getInstanceSelectHotelPage().getDataPickIn());
		clearText(pom.getInstanceSelectHotelPage().getDataPickIn());
		Thread.sleep(1000);
		inputText(pom.getInstanceSelectHotelPage().getDataPickIn(), "10/04/2022");

		elementHighlighter(pom.getInstanceSelectHotelPage().getDataPickOut());
		clearText(pom.getInstanceSelectHotelPage().getDataPickOut());
		Thread.sleep(1000);
		inputText(pom.getInstanceSelectHotelPage().getDataPickOut(), "14/04/2022");

		elementHighlighter(pom.getInstanceSelectHotelPage().getAdult_room());
		dropDown(pom.getInstanceSelectHotelPage().getAdult_room(), "visibletext", "1 - One");

		elementHighlighter(pom.getInstanceSelectHotelPage().getChild_room());
		dropDown(pom.getInstanceSelectHotelPage().getChild_room(), "visibletext", "1 - One");

		elementHighlighter(pom.getInstanceSelectHotelPage().getSubmit());
		clickWebElement(pom.getInstanceSelectHotelPage().getSubmit());


	}

	public static void searchHotel() throws InterruptedException {

		elementHighlighter(pom.getInstanceSearchHotelPage().getRadioBtn1());
		clickWebElement(pom.getInstanceSearchHotelPage().getRadioBtn1());


		elementHighlighter(pom.getInstanceSearchHotelPage().getContinueNext());
		clickWebElement(pom.getInstanceSearchHotelPage().getContinueNext());

	}

	public static void bookAHotel() throws InterruptedException {
		
		elementHighlighter(pom.getInstanceBookAHotelPage().getFirstName());
		inputText(pom.getInstanceBookAHotelPage().getFirstName(), "Karthick");
		
		elementHighlighter(pom.getInstanceBookAHotelPage().getLastName());
		inputText(pom.getInstanceBookAHotelPage().getLastName(), "Boopathy");
		
		elementHighlighter(pom.getInstanceBookAHotelPage().getAddress());
		inputText(pom.getInstanceBookAHotelPage().getAddress(), "4 mvk street");
		
		elementHighlighter(pom.getInstanceBookAHotelPage().getCreditCardNumber());
		inputText(pom.getInstanceBookAHotelPage().getCreditCardNumber(), "1234567894561237");
		
		elementHighlighter(pom.getInstanceBookAHotelPage().getCreditCardType());
		dropDown(pom.getInstanceBookAHotelPage().getCreditCardType(), "visibletext", "American Express");
		
		elementHighlighter(pom.getInstanceBookAHotelPage().getCardExpiredMonth());
		dropDown(pom.getInstanceBookAHotelPage().getCardExpiredMonth(), "visibletext", "August");
		
		elementHighlighter(pom.getInstanceBookAHotelPage().getCardExpiredYear());
		dropDown(pom.getInstanceBookAHotelPage().getCardExpiredYear(), "visibletext", "2022");
		
		elementHighlighter(pom.getInstanceBookAHotelPage().getCardCvv());
		inputText(pom.getInstanceBookAHotelPage().getCardCvv(), "456");
		Thread.sleep(3000);

		elementHighlighter(pom.getInstanceBookAHotelPage().getCancel());
		clickWebElement(pom.getInstanceBookAHotelPage().getCancel());
		
	}

}

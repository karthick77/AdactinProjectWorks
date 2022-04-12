package com.utils.adactinworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firfox")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void dropDown(WebElement element, String type, String value) {
		Select select = new Select(element);
		if(type.equalsIgnoreCase("visibletext"))
		{
			select.selectByVisibleText(value);
		}
		else if(type.equalsIgnoreCase("byvalue")) {
			select.selectByValue(value);
		}else {
			int byIndex = Integer.parseInt(value);
			select.selectByIndex(byIndex);
		}
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void clickWebElement(WebElement element) {
		element.click();
	}
	
	public static void inputText(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clearText(WebElement element) {
		element.clear();
	}
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void elementHighlighter(WebElement element) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('style','border: 3px solid blue');", element);
		Thread.sleep(1000);
		executor.executeScript("arguments[0].setAttribute('style','border: 3px solid grey');", element);
		
	}

}

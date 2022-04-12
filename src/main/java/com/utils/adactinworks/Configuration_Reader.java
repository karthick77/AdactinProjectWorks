package com.utils.adactinworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	Properties props;
	public Configuration_Reader() throws IOException, FileNotFoundException {
	
		
		//File file = new File("D:\\Works\\JavaWorks\\AdactinWorks\\config.properties");
		//FileInputStream fis = new FileInputStream(file);
		props = new Properties();
		props.load(getClass().getResourceAsStream("/config.properties"));
	}
	
	public String getUrlProps() {
		String APP_URL = props.getProperty("APP_URL");
		return APP_URL;
	}
	
	public String getUserNameProps() {
		String USERNAME = props.getProperty("USERNAME");
		return USERNAME;
	}
	
	public String getPasswordProps() {
		String PASSWORD = props.getProperty("PASSWORD");
		return PASSWORD;
	}
	
	public String getBrowserProps() {
		String BROWSER = props.getProperty("BROWSER");
		return BROWSER;
	}
	
	public String getDriverPath() {
		String CHROME_DRIVER_LOCATION = props.getProperty("CHROME_DRIVER_LOCATION");
		return CHROME_DRIVER_LOCATION;
	}
}

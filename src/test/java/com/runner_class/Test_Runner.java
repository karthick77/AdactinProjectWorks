package com.runner_class;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utils.adactinworks.Base_Class;
import com.utils.adactinworks.FileReadManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "D:\\Works\\JavaWorks\\AdactinWorks\\src\\test\\java\\Features",
				glue = "com.step_definition",
				plugin = {"pretty", 
							"html:target/Reports.html", 
							"json:target/cucumber-reports/Cucumber.json",
							"junit:target/cucumber-reports/Cucumber.xml",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
				monochrome = true,
				dryRun = true,
				publish = true
		)
public class Test_Runner {
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws FileNotFoundException, IOException {
		driver = Base_Class.getBrowser(FileReadManager.getInstanceFRM().getInstanceCR().getBrowserProps());
	}
	
	@AfterClass
	public static void tear_Down() throws InterruptedException {
		Base_Class.closeBrowser();
	}

}

package com.adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.cucumberproject.BaseClass;
import com.adactin.readers.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition", plugin = "html:report", dryRun = false, monochrome = true)

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		driver = BaseClass.getDriver(FileReaderManager.getInstance().getInstanceCR().getBrowserName());
	}

}

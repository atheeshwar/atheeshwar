package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Adactin.Cucumber_Adactin.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\StepDefinition",monochrome= false)
public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = BaseClass.getDriver("chrome");

	}
	
	@AfterClass
	public static void tearDown() {
	//	driver.quit();
	}

}

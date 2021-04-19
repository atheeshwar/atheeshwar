package com.adactin.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.POM.LoginPage;
import com.adactin.POM.SearchHotel;
import com.adactin.runner.Runner;

import Adactin.Cucumber_Adactin.BaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_Stepdefinition extends BaseClass {
	public static WebDriver driver = Runner.driver;

	LoginPage lp = new LoginPage(driver);
	SearchHotel sh = new SearchHotel(driver);

	@Given("^user launch application$")
	public void user_launch_application() throws Throwable {
		getUrl("https://adactinhotelapp.com/");
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		inputValueElement(lp.getUsername(), arg1);

	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		inputValueElement(lp.getPassword(), arg1);
	}

	@Then("^user verify valid username and password$")
	public void user_verify_valid_username_and_password() throws Throwable {
		clickOnElement(lp.getLogin());
	}
	
	@Given("^user select \"([^\"]*)\" as location$")
	public void user_select_as_location(String arg1) throws Throwable {
	    selection(sh.getLocation(),"byVisibleText", arg1);
	}

	@When("^user select \"([^\"]*)\" as hotel$")
	public void user_select_as_hotel(String arg1) throws Throwable {
		selection(sh.getHotel(), "byVisibleText",arg1);
	}

	@When("^user select \"([^\"]*)\" as roomtype$")
	public void user_select_as_roomtype(String arg1) throws Throwable {
	    selection(sh.getRoom_type(), "byValue",arg1);
	}

	@When("^user select \"([^\"]*)\" as number of rooms$")
	public void user_select_as_number_of_rooms(String arg1) throws Throwable {
	    selection(sh.getRoom_nos(), "byVisibleText",arg1);
	}
	
	@When("^user clear checkin date$")
	public void user_clear_checkin_date() throws Throwable {
	    sh.getDate_in().clear();
	}

	

	@When("^user enter \"([^\"]*)\" as checkin date$")
	public void user_enter_as_checkin_date(String arg1) throws Throwable {
	    inputValueElement(sh.getDate_in(),arg1);
	}
	
	@When("^user clear checkout date$")
	public void user_clear_checkout_date() throws Throwable {
	    sh.getDate_out().clear();
	}

	@When("^user enter \"([^\"]*)\" as checkout date$")
	public void user_enter_as_checkout_date(String arg1) throws Throwable {
	    inputValueElement(sh.getDate_out(),arg1);
	}

	@When("^user enter \"([^\"]*)\" as adults per room$")
	public void user_enter_as_adults_per_room(String arg1) throws Throwable {
	    selection(sh.getAdult(), "byVisibleText",arg1);
	}

	@When("^user enter \"([^\"]*)\" as child per room$")
	public void user_enter_as_child_per_room(String arg1) throws Throwable {
		selection(sh.getChild(), "byVisibleText",arg1);
	}

	@Then("^user verify valid seatch hotel details$")
	public void user_verify_valid_seatch_hotel_details() throws Throwable {
	    clickOnElement(sh.getSearch());
	}


}

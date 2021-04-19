package com.adactin.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy (id = "password")
	private WebElement password;
	
	@FindBy (id = "login")
	private WebElement login;
	
	

	public LoginPage(WebDriver driver2) {
		
		PageFactory.initElements(driver2, this);
		this.driver=driver2;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
	

}

package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver  driver;

	public Login_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	public WebDriver getDriver() {
	return driver;
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
	@FindBy(id="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(id="login")
	WebElement login;

	


	}




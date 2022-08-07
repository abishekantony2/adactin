package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public WebDriver driver;
	public Logout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"Logout.php\"]")
	WebElement logout;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout() {
		return logout;
	}


	


}




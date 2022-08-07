package com.pom;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Booking_confirm {

	public WebDriver driver;
	public Booking_confirm(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class=\"reg_button\"])[2]")
	WebElement Myitinerary;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMyitinerary() {
		return Myitinerary;
	}





	}



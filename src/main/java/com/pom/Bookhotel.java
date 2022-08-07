package com.pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Bookhotel {

	public WebDriver driver;
	public Bookhotel(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCardno() {
		return Cardno;
	}

	public WebElement getCardtype() {
		return Cardtype;
	}

	public WebElement getSelectmonth() {
		return Selectmonth;
	}

	public WebElement getSelectyear() {
		return Selectyear;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getBooknow() {
		return Booknow;
	}


	@FindBy(id = "first_name")
	WebElement Firstname;

	@FindBy(id = "last_name")
	WebElement lastname;

	@FindBy(className = "txtarea")
	WebElement Address;

	@FindBy(id ="cc_num")
	WebElement Cardno;

	@FindBy(id = "cc_type")
	WebElement Cardtype;

	@FindBy(name = "cc_exp_month")
	WebElement Selectmonth;

	@FindBy(name = "cc_exp_year")
	WebElement Selectyear;

	@FindBy(id = "cc_cvv")
	WebElement Cvv;

	@FindBy(xpath = "//input[@id=\"book_now\"]")
	WebElement Booknow;




	}



package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	public WebDriver driver;
	public Select_hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSelect() {
		return select;
	}

	public void setSelect(WebElement select) {
		this.select = select;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public void setContinue(WebElement continue1) {
		Continue = continue1;
	}
		@FindBy(xpath = "//input[@id=\"radiobutton_0\"]")
		WebElement select;

		@FindBy(xpath ="//input[@value=\"Continue\"]")
		WebElement Continue;





                                           



		}

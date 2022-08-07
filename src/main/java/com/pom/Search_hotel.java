package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {

public WebDriver driver;

  public Search_hotel(WebDriver driver) {
  // TODO Auto-generated constructor stub
this.driver=driver;
PageFactory.initElements(driver, this);
 }
 
  public WebDriver getDriver() {
return driver;
}

public WebElement getLoaction() {
return loaction;
}

public WebElement getHotel() {
return Hotel;
}

public WebElement getRoomtype() {
return Roomtype;
}

public WebElement getNumberofrooms() {
return Numberofrooms;
}

public WebElement getDatein() {
return Datein;
}

public WebElement getDateout() {
return Dateout;
}

public WebElement getAdults() {
return Adults;
}

public WebElement getChildrens() {
return Childrens;
}

public WebElement getSearch() {
return Search;
}

public WebElement getReset() {
return Reset;
}

@FindBy(name="location")
  WebElement loaction;
 
  @FindBy(id="hotels")
  WebElement Hotel;
 
  @FindBy(xpath = "//select[@id=\"room_type\"]")
  WebElement Roomtype;
 
  @FindBy(xpath ="//select[@id=\"room_nos\"]")
  WebElement Numberofrooms;
 
 @FindBy(xpath = "//*[@id=\"datepick_in\"]")
 WebElement Datein;
 
 @FindBy(xpath = "//*[@id=\"datepick_out\"]")
 WebElement Dateout;
 
 @FindBy(xpath = "//select[@id=\"adult_room\"]")
 WebElement Adults;
 
 @FindBy(xpath = "//select[@id=\"child_room\"]")
 WebElement Childrens;
 
@FindBy(id = "Submit")
WebElement Search;

@FindBy(className = "reg_button")
WebElement Reset;
 




}




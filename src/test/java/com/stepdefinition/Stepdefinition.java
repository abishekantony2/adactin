package com.stepdefinition;


import org.openqa.selenium.WebDriver;

import com.base.Base_class;
import com.helpers.File_Reader_Manager;
import com.pom.Bookhotel;
import com.pom.Booking_confirm;
import com.pom.Login_Page;
import com.pom.Logout;
import com.pom.Search_hotel;
import com.pom.Select_hotel;
import com.testrun.Testrun;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Base_class{
	
	 public static WebDriver driver=Testrun.driver;
	 public static Login_Page lp=new Login_Page(driver);
	 public static Search_hotel lp2=new Search_hotel(driver); 
	 public static Select_hotel lp3=new Select_hotel(driver);
	 public static Bookhotel lp4=new Bookhotel(driver);
	 public static Booking_confirm lp5=new Booking_confirm(driver);
	 public static Logout lp6=new Logout(driver);
	 
	 
	@Given("^user launch adactin application$")
	public  void user_launch_adactin_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String url= File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		open_url(url);
	   
	}

	@When("user enter {string} in username field")
	public void user_enter_in_username_field(String username) {
	    // Write code here that turns the phrase above into concrete actions
	    inputofelement(lp.getUsername(), username);
	}
	
	@When("user enter {string} in password field")
	public void user_enter_in_password_field(String password) {
	    // Write code here that turns the phrase above into concrete actions
	    inputofelement(lp.getPassword(), password);
	}
	@Then("^user clicks login button$")
	public void user_clicks_login_button()  {
	    // Write code here that turns the phrase above into concrete actions
	    click(lp.getLogin());
	}
	@When("user select Location")
	public void user_select_location() {
	    // Write code here that turns the phrase above into concrete actions
	   selectbyindex(lp2.getLoaction(), 5);
	}
	@When("user select Hotels")
	public void user_select_hotels() {
	    // Write code here that turns the phrase above into concrete actions
	    selectbyindex(lp2.getHotel(),4);
	}
	@When("user select Roomtype")
	public void user_select_roomtype() {
	    // Write code here that turns the phrase above into concrete actions
	   selectbyvalue(lp2.getRoomtype(), "Deluxe");
	}
	@When("user select NumberRooms")
	public void user_select_number_rooms() {
	    // Write code here that turns the phrase above into concrete actions
	   selectbyindex(lp2.getNumberofrooms(), 4);
	}
	@When("user select Log in")
	public void user_select_log_in() {
	    // Write code here that turns the phrase above into concrete actions
		 inputofelement(lp2.getDatein(), "15/07/2022");
	}
	@When("user select Log out")
	public void user_select_log_out() {
	    // Write code here that turns the phrase above into concrete actions
	    inputofelement(lp2.getDateout(), "18/07/2022");
	}
	@When("user select Adultsper Room")
	public void user_select_adultsper_room() {
	    // Write code here that turns the phrase above into concrete actions
	  selectbyindex(lp2.getAdults(), 4);
	}
	@When("user select Childrenper Room")
	public void user_select_childrenper_room() {
	    // Write code here that turns the phrase above into concrete actions
	   selectbyindex(lp2.getChildrens(), 2);
	}
	@Then("click Search")
	public void click_search() {
	    // Write code here that turns the phrase above into concrete actions
	    click(lp2.getSearch());
	}
	
	@When("user click the selected hotel")
	public void user_click_the_selected_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	    click(lp3.getSelect());
	    implicit();
	}
	
	@Then("user click the continue")
	public void user_click_the_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    click(lp3.getContinue());
	}
	@When("user enter firstname in firstname field")
	public void user_enter_firstname_in_firstname_field() {
	    // Write code here that turns the phrase above into concrete actions
	    inputofelement(lp4.getFirstname(), "Abishek");
	}
	@When("user enter lastname in lastname field")
	public void user_enter_lastname_in_lastname_field() {
	   inputofelement(lp4.getLastname(), "antony");
	    
	}
	@When("user enter billing address in field name")
	public void user_enter_billing_address_in_field_name() {
	    // Write code here that turns the phrase above into concrete actions
	    inputofelement(lp4.getAddress(), "56 amman illam,jeganadhan street,coimbatore");
	}
	@When("user enter card number in card number field")
	public void user_enter_card_number_in_card_number_field() {
	    // Write code here that turns the phrase above into concrete actions
	    inputofelement(lp4.getCardno(), "2346664890761233");
	}
	@When("user enter card type in card type field")
	public void user_enter_card_type_in_card_type_field() {
	    // Write code here that turns the phrase above into concrete actions
	    selectbyindex(lp4.getCardtype(), 1);
	}
	@When("user enter expiery month in field")
	public void user_enter_expiery_month_in_field() {
	    // Write code here that turns the phrase above into concrete actions
	   selectbyindex(lp4.getSelectmonth(), 10);
	}
	@When("user enter expiery year in field")
	public void user_enter_expiery_year_in_field() {
	    // Write code here that turns the phrase above into concrete actions
	    selectbyindex(lp4.getSelectyear(), 10);
	}
	@When("user enter cvv number infield")
	public void user_enter_cvv_number_infield() {
	    // Write code here that turns the phrase above into concrete actions
	    inputofelement(lp4.getCvv(), "12883");
	}
	@Then("user click book now")
	public void user_click_book_now() {
	    // Write code here that turns the phrase above into concrete actions
	    click(lp4.getBooknow());
	}
	
	@Then("user click the itinerary")
	public void user_click_the_itinerary() {
	    // Write code here that turns the phrase above into concrete actions
	    click(lp5.getMyitinerary());
	}
	
	@Then("user click the logout button")
	public void user_click_the_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
		click(lp6.getLogout());
	
	
	
	}
	
	
	
}	 
	
	
	
	 
	 
	
	
	
	
	
	
	
	
	
	
	

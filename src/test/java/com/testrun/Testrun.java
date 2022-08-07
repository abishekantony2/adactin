package com.testrun;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base_class;
import com.helpers.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\com\\feature\\Adactin.feature",glue="com.stepdefinition")
@RunWith(Cucumber.class)

public class Testrun{
	
public static WebDriver driver;

@BeforeClass
public static void set_up() throws Throwable {
	
	
	
	String browser = File_Reader_Manager.getInstance().getInstanceCR().getbrowswer();
	driver=Base_class.browser_lunch(browser);
}
     @AfterClass
     public static void tearDown() {
    	 
    	 driver.close();
    	 
     }
 







}




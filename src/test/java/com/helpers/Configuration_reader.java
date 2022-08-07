package com.helpers;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.Properties;

public class Configuration_reader {
	 public static Properties p;
	public Configuration_reader () throws Throwable {
		File f=new File("C:\\Users\\ADMIN\\Eclipse_workspace\\Adactin\\src\\test\\java\\com\\feature\\Adactin.feature");		
		FileInputStream am= new FileInputStream(f);
		p=new Properties();
		p.load(am);
	}
	
	public String getbrowswer() {
		
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("url"); 
		return url;
		
	}
		
	
	
	
	

}

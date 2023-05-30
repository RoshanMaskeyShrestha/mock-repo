package com.zoho.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeTest
	public void openingBrowser() {
		Reporter.log("opening browser",true);
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void Login() throws IOException {
		Reporter.log("login page",true);
		FilLib f=new FilLib();
		String url=f.getpropertyData("url");
		String un=f.getpropertyData("username");
		String pw=f.getpropertyData("password");
		driver.get(url);
	}
	@AfterMethod()
	public void logout() {
		
		
	}
		
	
	

}

package com.acttime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;   //Global Object Declaration
	
	@BeforeClass
	public void configBC()
	{
		System.out.println("=========Lunch Broswer========");
		driver=new FirefoxDriver();
	}
	
	@BeforeMethod
	public void configBM()
	{
		System.out.println("Login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://actitime.jmr.co.za/actitime/login.do");
	}

}

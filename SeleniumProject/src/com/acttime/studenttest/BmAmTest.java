package com.acttime.studenttest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BmAmTest {
	@BeforeMethod
	public void configBM()
	{
		System.out.println("Login");
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("Logout");
	}
	@Test(priority=1)
	public void createCustomerTest()
	{
		System.out.println("execute createCustomerTest");
	}
	@Test(priority=2)
	public void modifyCustomerTest()
	{
		System.out.println("execute modifyCustomerTest");
	}
	@Test(priority=3)
	public void deleteCustomerTest()
	{
		System.out.println("execute deleteCustomerTest");
	}

}

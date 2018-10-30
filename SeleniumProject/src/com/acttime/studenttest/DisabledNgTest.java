package com.acttime.studenttest;

import org.testng.annotations.Test;

public class DisabledNgTest {
	
	@Test
	public void createCustomerTest(){
		System.out.println("execute createCustomerTest");
	}
	
	@Test(enabled=false)
	public void modifyCustomerTest(){
		System.out.println("execute modifyCustomerTest");
	}
	@Test(enabled=false)
	public void deleteCustomerTest(){
		System.out.println("execute deleteCustomerTest");
	}

}

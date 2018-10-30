package com.acttime.studenttest;

import org.testng.annotations.Test;

public class MultipleExecuNgTest 
{
	@Test(invocationCount=10)
	public void createCustomerTest(){
		
		System.out.println("execute createCustomerTest");
	}

	@Test(invocationCount=10)
	public void modifyCustomerTest(){
		
		System.out.println("execute modifyCustomerTest");
	}
	
	@Test(invocationCount=10)
	public void deleteCustomerTest(){
		
		System.out.println("execute deleteCustomerTest");
	}
}

package test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFlipkart
{

	public static void main(String[] args) 
	{
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://flipkart.com");
		driver.close();

	}

}

package test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFacebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.close();
	}

}

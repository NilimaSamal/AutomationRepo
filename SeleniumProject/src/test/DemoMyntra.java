package test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoMyntra 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com");
		driver.close();

	}

}

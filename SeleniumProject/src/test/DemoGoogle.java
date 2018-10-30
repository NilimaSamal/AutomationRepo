package test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoGoogle {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.close();

	}

}

package test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.close();

	}

}

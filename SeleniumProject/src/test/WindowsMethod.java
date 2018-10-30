package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsMethod
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//change the size of the browser window using dimension class object
		Dimension dem=new Dimension(100,200);
		driver.manage().window().setSize(dem);
		
		//close the window
		driver.close();
	}

}

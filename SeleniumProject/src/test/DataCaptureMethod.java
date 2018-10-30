package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataCaptureMethod 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		
		//capture the current title of the page
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		//capture the current URL of the page
		String pageURL=driver.getCurrentUrl();
		System.out.println(pageURL);
		
		//capture the current page HTML code of the page
		String pageHtmlCode=driver.getPageSource();
		System.out.println(pageHtmlCode);
		
		driver.close();
	}

}

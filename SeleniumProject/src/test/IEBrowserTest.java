package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\selenium-2.53.1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.navigate().to("https://mail.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("seleniumoar1234");

	}

}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest 
{
	//we can here also develope the chrome broswer using this static method
	//static
	//{
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium-2.53.1\\chromedriver.exe");
	//}

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-2.53.1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("seleniumoar1234");

	}

}

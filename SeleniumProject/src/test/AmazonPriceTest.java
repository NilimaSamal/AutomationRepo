package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonPriceTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Search for "iphone 10"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 10",Keys.ENTER);
		
		//Capture the Price
		String Y="//a/h2[text()='Apple iPhone X (Space Grey, 3GB RAM, 256GB Storage)']";

	}

}

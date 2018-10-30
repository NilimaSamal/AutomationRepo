package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/Selenium%20Note/Selenium%20using%20html%20tags/NewPage.html");
		
		//Absolute Xpath
		//driver.findElement(By.xpath("html/body/input[1]")).sendKeys("admin");
		//driver.findElement(By.xpath("html/body/input[2]")).sendKeys("manager");
		//driver.findElement(By.xpath("html/body/input[3]")).click();
		
		//Relative Xpath
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Psw']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='ck' and @type='checkbox']")).click();
		

	}

}

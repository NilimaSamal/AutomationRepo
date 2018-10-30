package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ConCurrentKeyTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://actitime.jmr.co.za/actitime/login.do");
		
		WebElement uWb=driver.findElement(By.name("username"));
		uWb.sendKeys("admin");
		Actions act=new Actions(driver);
	
		//double click on username editbox
		act.doubleClick(uWb).perform();
		
		//Zoom in
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
		
		//Copy
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		
		//paste
		act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		
		//Tab
		act.sendKeys(Keys.TAB).perform();	
		
	}

}

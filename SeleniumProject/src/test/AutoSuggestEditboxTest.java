package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestEditboxTest 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		//Type data into google search "Auto Suggest Editbox"
		driver.findElement(By.id("lst-ib")).sendKeys("Congnizant job");
		
		//pass "ENTER" keys operation
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
	}

}

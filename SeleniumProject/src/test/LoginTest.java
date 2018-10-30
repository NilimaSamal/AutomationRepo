package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest 
{

	public static void main(String[] args) throws Throwable
	{
		//navigate to gmail account
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://gmail.com");
		String expPage="Gmail";
		
		//verify the login page
		String actPage=driver.getTitle();
		if(expPage.equals(actPage))
		{
			System.out.println("Login Page is verified==Pass");
		}
		else
		{
			System.out.println("Login Page is not verified==Fail");
		}
		
		// login to Gmail
		driver.findElement(By.id("identifierId")).sendKeys("seleniumoar1234");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("seleniumoar@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		
		//verify the home page
		String expHomePage="Inbox";
		String actHomePage=driver.getTitle();
		
		if(actHomePage.contains(expHomePage))
		{
			System.out.println("Inbox Page is verified==Pass");
		}
		else
		{
			System.out.println("Inbox Page is not verified==Fail");
		}
		
		//logout
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gb_71")).click();
		
		driver.close();
	}

}

package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		
		//LogIN
		driver.findElement(By.id("identifierId")).sendKeys("seleniumoar1234");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(7000);
		driver.findElement(By.name("password")).sendKeys("seleniumoar@123");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(7000);
		//Logout
		driver.findElement(By.xpath("//*[@class='gb_9a gbii']")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(7000);
		driver.findElement(By.id("gb_71")).click();

	}

}

package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlertTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		
		//click on login button which open an alert popoup
		driver.findElement(By.id("loginbutton")).click();
		
		//pass driver control to alert window
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		
		//capture alert message
		System.out.println(alt.getText());
		
		//click on OK button
		alt.accept();
	
	}

}

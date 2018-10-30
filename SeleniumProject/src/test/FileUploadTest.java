package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest 
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://my.naukri.com/account/createaccount");
		
		//click on "I am fresher" Button
		driver.findElement(By.xpath("//button[text()='I am a Fresher']")).click();
		
		//Enter details and click on browser button 
		driver.findElement(By.xpath("//span[@class='uploadCV']")).click();
		
		//Execute AutoIT code
		Runtime.getRuntime().exec("C:\\Users\\hi\\Desktop\\FileUpload.exe");

	}

}

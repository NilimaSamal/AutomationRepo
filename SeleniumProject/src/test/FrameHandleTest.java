package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandleTest {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		//pass driver control to frame 2
		driver.switchTo().frame("classFrame");
		
		//click on link,while the link is present in frame 2
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		//pass driver control back to Main Window
		driver.switchTo().defaultContent();
		
		//pass driver control to frame 3
		driver.switchTo().frame("packageFrame");
		
		//click on link ,while the link is present in frame 3
		driver.findElement(By.linkText("Actions")).click();
		
		
	}

}

package test;

import java.util.Scanner;

import org.jboss.netty.channel.StaticChannelPipeline;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DifferentBrowserTest 
{
static WebDriver driver;
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium-2.53.1\\chromedriver.exe");
		//get the browser name from the user in Runtime
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String userData=input.next();
		
		//lunch the specific browser based on user input
		if(userData.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(userData.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(userData.equals("InternetExplore"))
		{
			driver=new InternetExplorerDriver();
		}
		//navigate to url
		driver.get("https://gmail.com");
		driver.close();

	}

}

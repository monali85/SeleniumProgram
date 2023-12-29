package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.utility.PropertyUtils;

public class BaseClass {
	
	public static WebDriver driver=null;
public static void initialization() throws Exception{
	
	String browsername=PropertyUtils.readProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:/selenium software/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		
		driver=new ChromeDriver();
		
	}
	if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "geckodrivder.exe");
		driver=new FirefoxDriver();
	}
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium%20software/Offline%20Website/index.html");
	
}
public static void setCredentials()throws Exception
{
	String username=PropertyUtils.readProperty("username");
	String password=PropertyUtils.readProperty("password");
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.xpath("//button")).click();
	
	Assert.assertEquals("JavaByKiran | Dashboard",driver.getTitle());
}
public static void main(String[] args)throws Exception
{
	initialization();
	setCredentials();
	
}
}

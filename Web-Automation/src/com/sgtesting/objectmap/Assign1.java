package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {
	public static WebDriver wb=null;
	public static ObjectMap om=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigateto();
		login();
		minimizeflyoutwindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}
	public static void launchBrowser()
	{
		String filename=null;
		try
		{
			filename="E:\\JavaAutomation\\Web-Automation\\Objectmap\\objectmap.properties";
			System.setProperty("webdriver.chrome.driver", "E:\\JavaAutomation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			wb=new ChromeDriver();
			om=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateto()
	{
		try
		{
			wb.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			wb.findElement(om.getLocator("loginpageusername")).sendKeys("admin");
			wb.findElement(om.getLocator("loginpagepassword")).sendKeys("manager");
			wb.findElement(om.getLocator("loginpageloginbutton")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwindow()
	{
		
	}
	private static void createUser()
	{
		try
		{
			wb.findElement(om.getLocator("userspageimage")).click();
			Thread.sleep(2000);
			wb.findElement(om.getLocator("userspageadduser")).click();
			Thread.sleep(2000);
			wb.findElement(om.getLocator("userspagefirstname")).sendKeys("demo");
			wb.findElement(om.getLocator("userspagelastname")).sendKeys("User1");
			wb.findElement(om.getLocator("userspageemail")).sendKeys("demo@gmail.com");
			wb.findElement(om.getLocator("userspageusername")).sendKeys("demoUser1");
			wb.findElement(om.getLocator("userspagepassword")).sendKeys("Welcome1");
			wb.findElement(om.getLocator("userspageretypepwd")).sendKeys("Welcome1");
			Thread.sleep(2000);
			wb.findElement(om.getLocator("userspagecreateuser")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			wb.findElement(om.getLocator("userspagelistuser")).click();
			Thread.sleep(2000);
			wb.findElement(om.getLocator("userspagedeleteuser")).click();
			Thread.sleep(2000);
			wb.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			wb.findElement(om.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			wb.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

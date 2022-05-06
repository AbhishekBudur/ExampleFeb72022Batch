package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn2 {
	public static WebDriver wb=null;
	public static ObjectMap om=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigateto();
		login();
		createUser();
		modifyuser();
		deleteUser();
		logout();
		closeApplication();
	}
	public static void launchBrowser()
	{
		String filename=null;
		try
		{
			filename="D:\\Program files\\Web-Automation\\Objectmap\\objectmap.properties";
			System.setProperty("webdriver.chrome.driver", "D:\\Program files\\Web-Automation\\Library\\driver\\chromedriver.exe");
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
			wb.get("http://localhost/login.do");
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
	private static void modifyuser()
	{
		try 
		{
			wb.findElement(om.getLocator("userspagelistuser")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("userspagefirstname")).clear();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("userspagefirstname")).sendKeys("Modified user");
			Thread.sleep(1000);
			wb.findElement(om.getLocator("userpagesavechanges")).click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			wb.findElement(om.getLocator("userpagelistuser1")).click();
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

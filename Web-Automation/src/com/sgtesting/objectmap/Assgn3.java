package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn3 {
	public static WebDriver wb=null;
	public static ObjectMap om=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigateto();
		login();
		creatcustomer();
		deletecustomer();
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
	private static void creatcustomer()
	{
		try 
		{
			wb.findElement(om.getLocator("customerpageimage")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("addnewdropdown")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("addnewcustomer")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("customernamefield")).sendKeys("customer A");
			Thread.sleep(1000);
			wb.findElement(om.getLocator("customerdescription")).sendKeys("Initial details...");
			Thread.sleep(1000);
			
			
			wb.findElement(om.getLocator("customercreatcustomer")).click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try 
		{
			wb.findElement(om.getLocator("customerdetailslist")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("customeraction")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("customerdelete")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("customerdeletepermanently")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
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

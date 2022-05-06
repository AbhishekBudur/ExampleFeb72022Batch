package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn7 {
	public static WebDriver wb=null;
	public static ObjectMap om=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigateto();
		login();
		creatcustomer();
		creatproject();
		creattask();
		deletetask();
		deleteproject();
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
	private static void creatproject()
	{
		try 
		{
			wb.findElement(om.getLocator("addnewdropdown")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("projectaddnewproject")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("projectnamefield")).sendKeys("Projecct banglore");
			Thread.sleep(1000);
			wb.findElement(om.getLocator("projectdescriptionfield")).sendKeys("Banglore metro project details initial stage");
			Thread.sleep(1000);
			wb.findElement(om.getLocator("projectcreatproject")).click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void creattask()
	{
		try 
		{
			wb.findElement(om.getLocator("taskaddnewtaskbutton")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("taskcreatnewtask")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("taskname")).sendKeys("Task 11");
			Thread.sleep(1000);
			wb.findElement(om.getLocator("taskcreattask")).click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deletetask()
	{
		try 
		{
			wb.findElement(om.getLocator("taskdetails")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("taskaction")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("taskdelete")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("taskdeletepermanently")).click();
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteproject()
	{
		try 
		{
			wb.findElement(om.getLocator("projectdetailslist")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("projectaction")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("projrctdelete")).click();
			Thread.sleep(1000);
			wb.findElement(om.getLocator("projectdeletepermanently")).click();
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
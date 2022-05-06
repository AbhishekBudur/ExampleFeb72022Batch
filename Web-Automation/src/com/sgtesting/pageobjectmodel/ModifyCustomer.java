package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyCustomer {
	public static WebDriver wb=null;
	public static ActiTimePage wp=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		creatcustomer();
		modifycustomer();
		deletcustomer();
		logout();
		closeapplication();
	}
	public static void launchBrowser()
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\JavaAutomation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			wb=new ChromeDriver();
			wp=new ActiTimePage(wb);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try 
		{
			wb.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			wp.getusername().sendKeys("admin");
			Thread.sleep(1000);
			wp.getpassword().sendKeys("manager");
			Thread.sleep(1000);
			wp.getlogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void creatcustomer()
	{
		try
		{
			wp.getclicktasks().click();
			Thread.sleep(1000);
			wp.getaddnewdropdown().click();;
			Thread.sleep(1000);
			wp.getaddnewcustomer().click();
			Thread.sleep(1000);
			wp.getentercustomername().sendKeys("Customer1");
			Thread.sleep(1000);
			wp.getcustomerdescription().sendKeys("Initial descrpition");
			Thread.sleep(1000);
			wp.getclickcreatcustomer().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifycustomer()
	{
		try
		{
			wp.getcustomerdetails().click();
			Thread.sleep(1000);
			wp.getcustomerdesc1().clear();
			Thread.sleep(1000);
			wp.getcustomerdesc1().sendKeys("customer description");
			Thread.sleep(1000);
			wp.getclosecustomerwindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deletcustomer()
	{
		try
		{
			wp.getcustomerdetails().click();
			Thread.sleep(1000);
			wp.getcustomeractions().click();
			Thread.sleep(1000);
			wp.getclickdeletcustomer().click();
			Thread.sleep(1000);
			wp.getclickdeletepermanentlycustomer().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			wp.getLogoutLink().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeapplication()
	{
		try
		{
			wb.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

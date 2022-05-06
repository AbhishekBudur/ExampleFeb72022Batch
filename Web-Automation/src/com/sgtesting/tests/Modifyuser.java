package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectmodel.ActiTimePage;

public class Modifyuser {
	public static WebDriver wb=null;
	public static ActiTimePage wp=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		creatuser();
		modifyuser();
		deletuser();
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
	public static void creatuser()
	{
		try
		{
			wp.getusers().click();
			Thread.sleep(1000);
			wp.getaddusers().click();
			Thread.sleep(1000);
			wp.getfirstname().sendKeys("Bassu");
			Thread.sleep(1000);
			wp.getlastName().sendKeys("Raj");
			Thread.sleep(1000);
			wp.getemail().sendKeys("Basava@gmail.com");
			Thread.sleep(1000);
			wp.getusernamenewuser().sendKeys("Bassudk");
			Thread.sleep(1000);
			wp.getpasswordnewuser().sendKeys("123456789");
			Thread.sleep(1000);
			wp.getretypepassword().sendKeys("123456789");
			Thread.sleep(1000);
			wp.getclickcreatuser().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyuser()
	{
		try
		{
			wp.getuserdetails().click();
			Thread.sleep(1000);
			wp.getfirstname().clear();
			Thread.sleep(1000);
			wp.getfirstname().sendKeys("Demouser");
			Thread.sleep(1000);
			wp.getsaveuserchanges().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deletuser()
	{
		try
		{
			wp.getuserdetails().click();
			Thread.sleep(1000);
			wp.getdeletuser().click();
			Thread.sleep(1000);
			Alert wbalert=wb.switchTo().alert();
			wbalert.accept();
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

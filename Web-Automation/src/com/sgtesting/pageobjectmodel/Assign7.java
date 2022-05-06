package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {
	public static WebDriver wb=null;
	public static ActiTimePage wp=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		creatcustomer();
		creatproject();
		creattask();
		deleteTask();
		deleteproject();
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
			wb.manage().window().maximize();
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
			wp.getentercustomername().sendKeys("Customer2");
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
	public static void creatproject()
	{
		try
		{
			wp.getaddnewdropdown().click();
			Thread.sleep(1000);
			wp.getaddnewproject().click();;
			Thread.sleep(1000);
			wp.getprojectname().sendKeys("Project1");
			Thread.sleep(1000);
			wp.getclickcreatproject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void creattask()
	{
		try
		{
			wp.getclickaddnewtask().click();
			Thread.sleep(1000);
			wp.getcreatnewtask().click();
			Thread.sleep(1000);
			wp.gettaskname().sendKeys("task1");
			Thread.sleep(1000);
			wp.getclickcreattask().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteTask()
	{
		try
		{
			wp.gettaskdetails().click();
			Thread.sleep(1000);
			wp.gettaskactions().click();
			Thread.sleep(1000);
			wp.getdeletetaskbutton().click();
			Thread.sleep(1000);
			wp.getdeletetaskpermanently().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteproject()
	{
		try
		{
			wp.getProjectDetails().click();
			Thread.sleep(1000);
			wp.getProjectAction().click();
			Thread.sleep(1000);
			wp.getClickDeleteProject().click();
			Thread.sleep(1000);
			wp.getDeleteProjectPermanently().click();
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
			wp.getcustomerdetailsoption().click();
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

package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyingCustomer {

	public static WebDriver wb=null;
	public static void main(String[] args) {
		openBrowser();
		navigate();
		Login();
		minimize();
		creatcustomer();
		modify();
		deletcustomer();
		logout();

	}
	public static void openBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Program files\\Web-Automation\\Library\\driver\\chromedriver.exe");
			wb=new ChromeDriver();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void navigate()
	{
		try
		{
			wb.get("http://localhost/login.do");

		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void Login()
	{
		try
		{
			wb.findElement(By.id("username")).sendKeys("admin");
			wb.findElement(By.name("pwd")).sendKeys("manager");
			wb.findElement(By.xpath("//*[@id='loginButton']/div")).click();

		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void minimize()
	{
		try
		{
			Thread.sleep(1000);
			wb.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void creatcustomer() 
	{
		try
		{
			wb.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(1000);
			wb.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			wb.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer1");
			Thread.sleep(1000);
			wb.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modify()
	{
		try
		{
			wb.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			//wb.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")).click();
			//Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Modifiedcustomer");
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void deletcustomer()
	{
		try
		{
			wb.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			wb.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
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
}


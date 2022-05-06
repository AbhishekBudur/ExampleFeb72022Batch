package com.sgtesting.tests;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn2 {
	public static WebDriver wb=null;
	public static void main(String[] args) {
		openBrowser();
		navigate();
		Login();
		minimize();
		CreateUser();
		ModifyUser();
		deletuser();
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
			Thread.sleep(1000);
			wb.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);

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
	public static void CreateUser() 
	{
		try
		{
			//wb.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			wb.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			wb.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			wb.findElement(By.name("firstName")).sendKeys("user");
			Thread.sleep(1000);
			wb.findElement(By.name("lastName")).sendKeys("Demo1");
			Thread.sleep(1000);
			wb.findElement(By.name("email")).sendKeys("demo@gmail.com");
			Thread.sleep(1000);
			wb.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			wb.findElement(By.name("password")).sendKeys("Welcome123");
			Thread.sleep(1000);
			wb.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void ModifyUser()
	{
		try
		{
			wb.findElement(By.xpath("//span[text()='Demo1, user']")).click();
			Thread.sleep(2000);
			wb.findElement(By.name("firstName")).clear();
			Thread.sleep(2000);
			wb.findElement(By.name("firstName")).sendKeys("ModifyedUser");
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void deletuser() 
	{
		try
		{
			Thread.sleep(1000);
			wb.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Alert wbAlert=wb.switchTo().alert();
			wbAlert.accept();
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


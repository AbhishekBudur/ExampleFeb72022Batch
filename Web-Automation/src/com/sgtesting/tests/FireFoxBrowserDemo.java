package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo {
	public static WebDriver refBrowser=null;
	public static void main(String[] args)
	{
		LanchBrowser();
		Navigateto();
	}
	public static void LanchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "E:\\JavaAutomation\\Web-Automation\\Library\\driver\\geckodriver.exe");
			refBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Navigateto()
	{
		try
		{
			refBrowser.get("https://www.youtube.com");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap {
	private Properties prop=null;
	public FileInputStream fin=null;

	public ObjectMap(String filename)
	{
		try
		{
			fin=new FileInputStream(filename);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	public By getLocator(String logicname)
	{
		By by=null;
		try
		{
			String LocatorDetails=prop.getProperty(logicname);
			String Locator[]=LocatorDetails.split("!");
			String Locatorname=Locator[0];
			String Locatorvalue=Locator[1];
			switch(Locatorname.toLowerCase())
			{
			case "id":by=By.id(Locatorvalue);
				break;
			case "name":by=By.name(Locatorvalue);
				break;
			case "xpath":by=By.xpath(Locatorvalue);
				break;
			case "linktext":
				by=By.linkText(Locatorvalue);
				break;
			case "tagname":
				by=By.tagName(Locatorvalue);
				break;
			case "cssselector":
				by=By.cssSelector(Locatorvalue);
				break;
			default:
				System.out.println("Invalid Locator Name");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}
}

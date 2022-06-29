package com.TruckNet.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TruckNet.GenericUtilites.BaseClass;
import com.TruckNet.POMPages.LoginPage;

public class TC_01_LoginTest extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(eLib.readExcel("baseURL"));
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(eLib.readExcel("email"));
		driver.findElement(By.id("continue")).click();
		lp.setPassword(eLib.readExcel("password"));
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(5000);
								
		if(driver.getCurrentUrl().equals("https://www.amazon.in/?ref_=nav_ya_signin&"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	}
	


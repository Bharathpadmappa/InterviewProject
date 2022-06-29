package com.TruckNet.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(id="continue")
	@CacheLookup
	WebElement Continue;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="signInSubmit")
	@CacheLookup
	WebElement signInSubmit;
	
	public void setUserName(String email)
	{
		txtemail.sendKeys(email);
	}
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void clickSubmit()
	{
		signInSubmit.click();
	}

}

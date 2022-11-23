package com.db.pageLayer;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;


public class LoginPage extends com.db.testBase.Testbase{
	
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------obj-----------------
	
	 private By email_txt = By.xpath("//input[@name='email']");
  
    
	 private By password_txt= By.xpath("//input[@name='password']");
    
    
	 private By login_btn = By.xpath("//button[text()='Log In']");
   
    
    //-------Action methods-------
    
    public void enterEmailID(String email) 
    {
    driver.findElement(email_txt).sendKeys(email);
    }
    
    public void enterPassword(String password) 
    {
    driver.findElement(password_txt).sendKeys(password);
    }
    
    public void clickonLoginButton() 
    {
    driver.findElement(login_btn).click();
    }
    public String getCurrUrl() {
    	String url = driver.getCurrentUrl();
    	return url;
    	
    }
    
}


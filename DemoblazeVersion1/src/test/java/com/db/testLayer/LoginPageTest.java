package com.db.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;





public class LoginPageTest extends com.db.testBase.Testbase{
	
	@Test
	public void verifyLoginFunctionalitywithValidCred() throws InterruptedException 
	{ 
		String expected_url ="https://www.apps.dalalstreet.ai/dashboard";
	    Thread.sleep(2000);
	    String actual_Url=login.getCurrUrl();
	    System.out.println(actual_Url);
	    Assert.assertEquals(actual_Url, expected_url);
	    logger.info("Login test case passed");
	}
	@Test(enabled=false)
	public void verifyLoginFunctionalityWithInValidCred() throws InterruptedException 
	{ 
		String expected_url ="https://www.apps.dalalstreet.ai/login";
 	    login.enterEmailID("amarwaghmare573@gmail.com");
	    login.enterPassword("Test@123");
	    Thread.sleep(2000);
	    String actualUrl=login.getCurrUrl();
	    System.out.println(actualUrl);
	    Assert.assertEquals(actualUrl, expected_url);
	}
	
}

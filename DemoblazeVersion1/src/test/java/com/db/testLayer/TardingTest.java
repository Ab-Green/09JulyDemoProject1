package com.db.testLayer;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TardingTest extends com.db.testBase.Testbase {
	
	@Test
	public void verifyBuySharewithWipro() throws InterruptedException {
		
		
		 //---------------------------------------
		 dash.enterCompanyName("wipro");
		 logger.info("Wipro shares");
		 dash.clickOnCompanyOption();
		 Thread.sleep(4000);
		 //-------------------------------
	
		 exchange.clickOnBuyButton1();
		 JavascriptExecutor k = ((JavascriptExecutor)driver);
		 k.executeScript("scroll(0,400)");
		 exchange.enterQuantityOfShare("1");	
		 exchange.clickOnBuyButton2();
		 Thread.sleep(2000);
		 //------------------------------------
		 String actual_status = exchange.getStatus();
		 String expected_status = "Order Created successfully";
		 Assert.assertEquals(actual_status, expected_status);	
		  
	}
	@Test
	public void verifyBuyShareAxis() throws InterruptedException 
	{
		
		
		 //---------------------------------------
		 
		 dash.enterCompanyName("AXIS");
		 dash.clickOnCompanyOption();
		 Thread.sleep(2000);
		 logger.info("Axis shares");
		 //-------------------------------
	
		 exchange.clickOnBuyButton1();
		 JavascriptExecutor k = ((JavascriptExecutor)driver);
		 k.executeScript("scroll(0,400)");
		 exchange.enterQuantityOfShare("1");	
		 exchange.clickOnBuyButton2();
		 Thread.sleep(2000);
		 //------------------------------------
		 String actual_status = exchange.getStatus();
		 String expected_status = "Order Created successfully";
		 Assert.assertEquals(actual_status, expected_status);	
		  
	}
	

}

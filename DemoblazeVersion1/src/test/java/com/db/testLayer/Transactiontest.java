package com.db.testLayer;

import org.testng.annotations.Test;



public class Transactiontest extends com.db.testBase.Testbase{

	@Test 
	public void getTransactionDetailsOnConsole() throws InterruptedException 
	{
		dash.clickOnTransactionLink();
		Thread.sleep(2000);
		transaction.getTransactionDetails();
	}
	
}

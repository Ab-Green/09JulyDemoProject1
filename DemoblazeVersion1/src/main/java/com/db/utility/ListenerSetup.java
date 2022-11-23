package com.db.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class ListenerSetup extends com.db.testBase.Testbase implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		logger.info("test case started");
	}


	public void onTestSuccess(ITestResult result) {
		logger.info("test case success");
	}


	public void onTestFailure(ITestResult result) {
		
		logger.info("test case fail");
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
	}

	
	public void onTestSkipped(ITestResult result) {
		logger.info("test case skipped");
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}


	public void onStart(ITestContext context) {
		logger.info("test case onstart");
	}

	
	public void onFinish(ITestContext context) {
		 logger.info("test case finsh");
	}

	
	
}

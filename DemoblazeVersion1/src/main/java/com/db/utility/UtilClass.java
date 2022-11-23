package com.db.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;



public class UtilClass extends com.db.testBase.Testbase {
	
	public UtilClass() {
		PageFactory.initElements(driver, this);
	}
	static String path ="D:\\velocity9julyTraining\\javaprograms-workspace-2022\\MyjulyGroupID\\screenshots\\";
	public static void takeScreenShot(String filename)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File des = new File(path + filename + ".png");
			FileHandler.copy(src, des);
			
		} 
		catch (IOException e) 
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}	
	}

}

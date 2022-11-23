package com.db.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;



public class TransactionPage extends com.db.testBase.Testbase{
	
	
	public TransactionPage() {
		
		PageFactory.initElements( driver,this);
		
	}
	
	//--------obj rep--------
	private By data = By.xpath("//table[@class ='table table align-middle table-nowrap']/tbody/tr[1]/td[2]");
	
	public void getTransactionDetails()
	{
		for(int i=1;i<12; i++) {
			
			for(int j=1; j<9; j++) {
				String d = driver.findElement(By.xpath("//table[@class ='table table align-middle table-nowrap']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(d+ " ");
				
			}
			System.out.println();
		}
	  
	}


	

}

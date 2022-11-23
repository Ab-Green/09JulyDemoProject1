package com.db.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;



public class DashboardPage extends com.db.testBase.Testbase {
	
	public DashboardPage() {
		PageFactory.initElements( driver,this);
	}
  ///-----------------obj------------------
	 private By search_txt = By.xpath("//input[@class ='form-control']");
     private By company_wiprooption=By.xpath("(//div[@class ='m-4 card'])[2]");
     private By transaction_link =By.xpath("//a[text()='Transactions']");
//------Action Method-----
public void enterCompanyName(String company_name) {
	
	driver.findElement(search_txt).sendKeys(company_name);
}

public void clickOnCompanyOption() {
	driver.findElement(company_wiprooption).click();
	
}

public void clickOnTransactionLink()
{
	driver.findElement(transaction_link).click();
}
}
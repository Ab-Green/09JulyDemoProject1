package com.db.testBase;




import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.db.pageLayer.DashboardPage;
import com.db.pageLayer.Exchange;
import com.db.pageLayer.LoginPage;
import com.db.pageLayer.TransactionPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public static WebDriver driver;
	public static Logger logger;
	public LoginPage login;
	public DashboardPage dash;
	public TransactionPage  transaction;
	public  Exchange exchange;
	
	@BeforeClass
	public void start() 
	{
	    logger = Logger.getLogger("DalalStreet framework");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Execution  Stated");
	}
	@AfterClass
	public void end() {
		
		logger.info("Execution end");
	}
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();	
	}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please enter valid browser name");
		}
	    
		logger.info("Browser Launched");
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		logger.info("Url,maximize and provided wait");
		
		//---------------object creation-------------
		 login = new  LoginPage();
		 dash= new DashboardPage();
	     exchange =new Exchange();
	     transaction =new TransactionPage();
		 //-------------loginsteps-------------------------
	     
		 login.enterEmailID("amarwaghmare573@gmail.com");
		 login.enterPassword("Test@1234");
		 login.clickonLoginButton();
		 Thread.sleep(4000);
		
		 logger.info("Logged in Successfully");
		 //---------------------------------------
		
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
		logger.info("Browser closed");
	}
    
}
 
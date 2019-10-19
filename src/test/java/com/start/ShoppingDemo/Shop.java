package com.start.ShoppingDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class Shop {
	WebDriver driver;
	boolean isRegisterd;
  @Test
  public void f() throws InterruptedException {
	  AlreadyRegisterd arRef= new AlreadyRegisterd(driver);
		
		isRegisterd=arRef.registeredUser();
		
		if(isRegisterd)
		{
			BuyItemClass biRef= new BuyItemClass(driver);
			biRef.buyItem();
		}
			
		else
		{
			CreateAccountClass cacRef= new CreateAccountClass(driver);
			cacRef.createAccount();
			
			CustomerDetailsClass cdcRef= new CustomerDetailsClass(driver);
			cdcRef.custDetails();
		}
  }
  @Parameters("bro")
  @BeforeTest
  public void beforeTest(String xyz)
  {
	  if(xyz.equals("chrome"))
	  {
		  
	  
	  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		
		driver = new ChromeDriver();
		
  }
  else if(xyz.equals("firefox"))
  {
	  System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		
		driver = new FirefoxDriver();
		 
	  
  }
  else if(xyz.equals("ie"))
  {
	  System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		
  }
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
  
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

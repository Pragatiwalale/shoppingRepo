package com.start.ShoppingDemo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumPractise 
{
	WebDriver driver;
	boolean isRegisterd;
	
	public static void main(String[] args) throws InterruptedException 
	{
		SeleniumPractise ref = new SeleniumPractise();
		ref.setUp();
		
		AlreadyRegisterd arRef= new AlreadyRegisterd(ref.driver);
		
		ref.isRegisterd=arRef.registeredUser();
		
		if(ref.isRegisterd)
		{
			BuyItemClass biRef= new BuyItemClass(ref.driver);
			biRef.buyItem();
		}
			
		else
		{
			CreateAccountClass cacRef= new CreateAccountClass(ref.driver);
			cacRef.createAccount();
			
			CustomerDetailsClass cdcRef= new CustomerDetailsClass(ref.driver);
			cdcRef.custDetails();
		}
		
		ref.tearDown();
		
	}
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
	}
	public void tearDown()
	{
		driver.close();
	}
}

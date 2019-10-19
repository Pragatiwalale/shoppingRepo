package com.start.ShoppingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class AlreadyRegisterd extends SeleniumPractise 
{
	@FindBy(id="email")
	WebElement locatorEmail;
	@FindBy(id="passwd")
	WebElement locatorPassword;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement locatorSigninBtn;
	
	
	//By locatorEmail= By.id("email");
	//By locatorPassword=By.id("passwd");
	//By locatorSigninBtn =By.xpath("//button[@id='SubmitLogin']");
	
	WebDriver driver;
	
	public AlreadyRegisterd(WebDriver driver2) 
	{
		driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean registeredUser()
	{
//		WebElement email = driver.findElement(locatorEmail);
//		email.sendKeys("pragatiwalalej@gmail.com");
		locatorEmail.sendKeys("pragatiwalalej@gmail.com");
		
//		WebElement password = driver.findElement(locatorPassword);
//		password.sendKeys("pragati1234");
		locatorPassword.sendKeys("pragati1234");
		
//		WebElement signinButton= driver.findElement(locatorSigninBtn);
//		signinButton.click();
		locatorSigninBtn.click();
		
		return true;
	}

}

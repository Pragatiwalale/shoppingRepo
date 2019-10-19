package com.start.ShoppingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountClass extends SeleniumPractise 
{
	By locatorSignUpEmail=By.id("email_create");
	By locatorCreateAccBtn=By.id("SubmitCreate");
	
	WebDriver driver;
	
	public CreateAccountClass(WebDriver driver3) 
	{
		driver=driver3;
	}

	public void createAccount()
	{
		
		WebElement signUpEmail =driver.findElement(locatorSignUpEmail);
		signUpEmail.sendKeys("pragatiwalalej@gmail.com");
		
		WebElement createAccBtn= driver.findElement(locatorCreateAccBtn);
		createAccBtn.click();
	}
}

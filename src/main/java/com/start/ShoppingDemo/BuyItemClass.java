package com.start.ShoppingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyItemClass extends SeleniumPractise 
{
	By locatorWomenBtn=By.xpath("//a[@title='Women']");
	By locatorRedTop=By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	By locatorFrame=By.xpath("//iframe[@class='fancybox-iframe']");
	By locatorAddToCarte=By.xpath("//button[@type='submit' and @name='Submit']");
	By locatorProceedToCheck1=By.xpath("//a[contains(@title,'Proceed')]");
	By locatorProceedToCheck2=By.xpath("//span[text()='Proceed to checkout']");
	By locatorProceedToCheck3=By.name("processAddress");
	By locatorAcceptTermsCheckBox=By.id("cgv");
	By locatorProceedToCheck4=By.name("processCarrier");
	By locatorPayBtn=By.xpath("//a[@title='Pay by bank wire']");
	By locatorConfirmOrderBtn=By.xpath("//span[text()='I confirm my order']");
			
	WebDriver driver;
	
	public BuyItemClass(WebDriver driver5) 
	{
		driver=driver5;
	}

	public void buyItem() throws InterruptedException
	{
		WebElement womenBtn= driver.findElement(locatorWomenBtn);
		womenBtn.click();
		
		WebElement redTop=driver.findElement(locatorRedTop);
		redTop.click();
		
		Thread.sleep(3000);
		
		WebElement frame =driver.findElement(locatorFrame);
		driver.switchTo().frame(frame); 
 
		 WebElement addToCart=driver.findElement(locatorAddToCarte);
		 addToCart.click();
		 
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(3000);
		 
		 WebElement proceedToCheck1 = driver.findElement(locatorProceedToCheck1);
		 proceedToCheck1.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement proceedToCheck2 = driver.findElement(locatorProceedToCheck2);
		 proceedToCheck2.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement proceedToCheck3= driver.findElement(locatorProceedToCheck3);
		 proceedToCheck3.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement acceptTermsCheckBox= driver.findElement(locatorAcceptTermsCheckBox);
		 acceptTermsCheckBox.click();
		 
		 WebElement proceedToCheck4 = driver.findElement(locatorProceedToCheck4);
		 proceedToCheck4.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement payBtn=driver.findElement(locatorPayBtn);
		 payBtn.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement confirmOrderBtn=driver.findElement(locatorConfirmOrderBtn);
		 confirmOrderBtn.click();
	}

}

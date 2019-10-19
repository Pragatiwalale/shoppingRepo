package com.start.ShoppingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerDetailsClass 
{
	By locatorGender=By.xpath("//label[@for='id_gender1']");
	By locatorCustFirstname= By.id("customer_firstname");
	By locatorCustLastName=By.id("customer_lastname");
	By locatorCustPass= By.id("passwd");
	By locatorDay=By.id("days");
	By locatorMonth=By.id("months");
	By locatorYear=By.id("years");
	By locatorComapany=By.id("company");
	By locatorAddress=By.id("address1");
	By locatorCity=By.id("city");
	By locatorState=By.id("id_state");
	By locatorZipCode=By.id("postcode");
	By locatorCountry=By.id("id_country");
	By locatorAdditionalInfo=By.id("other");
	By locatorPhone=By.id("phone");
	By locatorMobile=By.id("phone_mobile");
	By locatorFutureAdd=By.id("alias");
	By locatorRegisterBtn=By.id("submitAccount");
	
	WebDriver driver;
	
	public CustomerDetailsClass(WebDriver driver4) 
	{
		driver=driver4;
	}

	public void custDetails() throws InterruptedException
	{		
		Thread.sleep(5000);
		
		WebElement gender = driver.findElement(locatorGender);
		gender.click();
		
		WebElement custFirstName= driver.findElement(locatorCustFirstname);
		custFirstName.sendKeys("pragati");
		
		WebElement custLastName=driver.findElement(locatorCustLastName);
		custLastName.sendKeys("jain");
		
		WebElement custPass= driver.findElement(locatorCustPass);
		custPass.sendKeys("pragati1234");

		WebElement day =driver.findElement(locatorDay);
		day.sendKeys("27");
		
		WebElement month =driver.findElement(locatorMonth);
		month.sendKeys("March");
		
		WebElement year = driver.findElement(locatorYear);
		year.sendKeys("1991");
		
		WebElement company = driver.findElement(locatorComapany);
		company.sendKeys("SSP Technology");
		
		WebElement address = driver.findElement(locatorAddress);
		address.sendKeys("karve Road, Waraje 411038");
		
		WebElement city= driver.findElement(locatorCity);
		city.sendKeys("Pune");
		
		WebElement stateName= driver.findElement(locatorState);
		Select state = new Select(stateName);
		state.selectByIndex(15);
		
		WebElement zipCode =driver.findElement(locatorZipCode);
		zipCode.sendKeys("00000");
		
		WebElement country = driver.findElement(locatorCountry);
		Select countryName= new Select(country);
		countryName.selectByIndex(1);
		
		WebElement additionalInfo= driver.findElement(locatorAdditionalInfo);
		additionalInfo.sendKeys("Automation Testing");
		
		WebElement phone= driver.findElement(locatorPhone);
		phone.sendKeys("0233-2346555");
		
		WebElement mobile =driver.findElement(locatorMobile);
		mobile.sendKeys("7588952683");
		
		WebElement futureAdd= driver.findElement(locatorFutureAdd);
		futureAdd.sendKeys("Waraje Pune");
		
		WebElement registerBtn = driver.findElement(By.id("submitAccount"));
		registerBtn.click();
		
	}
}

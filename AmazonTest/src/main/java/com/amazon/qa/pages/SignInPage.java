package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.amazon.qa.base.TestBase;

public class SignInPage extends TestBase {
	
	//Object Repositories
	WebElement signInlnk = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
	
	WebElement signInBtn = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]"));
	
	public void login() {
		Actions action = new Actions(driver);
		action.moveToElement(signInlnk).build().perform();
		
		signInBtn.click();
	}
	
	
	
	
}

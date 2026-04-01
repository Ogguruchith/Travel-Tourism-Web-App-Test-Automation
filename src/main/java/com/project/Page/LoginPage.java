package com.project.Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	
	 WebDriver driver;
	 WebDriverWait wait;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	By username= By.id("username");
	By passs=By.id("password");
	By submit= By.xpath("//button[@type='submit']");
	
	
	public void DB() { 
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("localStorage.setItem('users', JSON.stringify([" + "{username:'ruchithoggu27@gmail.com', password:'mlrit@2004'}" + "]));"); 
		
	driver.navigate().refresh(); }

	
	
	//Actions
	
	public void enterusername(String user)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(username))
        .sendKeys(user);
	}
	
	public void enterPassword(String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passs))
        .sendKeys(pass);
    }

    public void clickLogin() {
    	wait.until(ExpectedConditions.elementToBeClickable(submit))
        .click();    	
    }
    
	
}

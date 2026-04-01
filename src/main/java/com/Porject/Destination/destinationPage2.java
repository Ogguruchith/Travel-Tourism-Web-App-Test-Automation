package com.Porject.Destination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class destinationPage2 {

	WebDriver driver;
	WebDriverWait wait;
	public destinationPage2(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	By destbutton = By.xpath("//a[@href='destinations.html']");
	By HussainSagar=By.xpath("//a[@href='Hussain Sagar Lake.html']");
	By comment=By.id("comment-text");
	By submit=By.id("submit-comment");
	
	//Another new Travel Clicking Chilikur Balaji Temple
	By Chilikur=By.xpath("//a[@href='Balaji.html']");
	By comments=By.id("comment-text");
	By submitt=By.id("submit-comment");
	
	
	public void clickDestination() {
        wait.until(ExpectedConditions.elementToBeClickable(destbutton)).click();
    }
	
	public void hussain()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(HussainSagar)).click();
	}
	
	public void CheckComment(String write)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(comment)).sendKeys(write);
	}
	
	public void Submit()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(submit)).click();
	}
	
	//Chilikur Balaji Temple
	public void Temple()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Chilikur)).click();
	}
	
	public void CheckComments(String write)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(comments)).sendKeys(write);
	}
	
	public void Submitt()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(submitt)).click();
	}
	
}

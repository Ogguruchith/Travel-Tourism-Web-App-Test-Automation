package com.Porject.Destination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class destinationPage {
	
	WebDriver driver;
	WebDriverWait wait;
	public destinationPage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	By destbutton = By.xpath("//a[@href='destinations.html']");
    By golconda = By.xpath("//a[@href='Golconda Fort.html']");
    By sunsetPoint = By.xpath("//img[@data-title='Sunset Point']");
    By usernameField = By.id("username");
    By commentField = By.id("user-comment");
    By submitButton = By.id("submit-comment");

    public void clickDestination() {
        wait.until(ExpectedConditions.elementToBeClickable(destbutton)).click();
    }

    public void clickGolconda() {
        wait.until(ExpectedConditions.elementToBeClickable(golconda)).click();
    }

    public void clickSunsetPoint() {
        wait.until(ExpectedConditions.elementToBeClickable(sunsetPoint)).click();
    }

    public void enterUsername(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(name);
    }
    public void enterComment(String comment) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(commentField)).sendKeys(comment);
    }

    public void clickSubmit() {
        WebElement btn = wait.until(
            ExpectedConditions.presenceOfElementLocated(submitButton)
        );
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn);
        try {
            Thread.sleep(500); // small pause after scroll
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
    }
}

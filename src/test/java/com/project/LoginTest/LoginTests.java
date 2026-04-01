package com.project.LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.Page.HomePage;
import com.project.Page.LoginPage;

public class LoginTests {

	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage; 
	@BeforeTest
	public void setupping()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5501/normal.html");
		
		loginpage = new LoginPage(driver);
		 loginpage.DB(); 
			

	}
	
	@Test
	public void verifyLogin() throws InterruptedException 
	{
		loginpage.enterusername("ruchithoggu27@gmail.com");
		loginpage.enterPassword("mlrit@2004");
		loginpage.clickLogin();
	}
	public void VrificationHomePageUrl()
	{
		homepage = new HomePage(driver);   // 🔹 create after login

        String expectedUrl = "http://127.0.0.1:5501/normal.html";
        String actualUrl = homepage.getHomeUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "Login Failed!");
	}
	
	@AfterTest
	public void  teardown()
	{
		driver.quit();
	}
}

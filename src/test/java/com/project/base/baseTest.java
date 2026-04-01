package com.project.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Porject.Destination.destinationPage;
import com.project.Page.LoginPage;


public class baseTest {

	protected WebDriver driver;
    protected LoginPage loginpage;
    protected destinationPage dest;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:5501/normal.html");

        loginpage = new LoginPage(driver);

        // Login happens ONLY ONCE
        loginpage.DB();
        loginpage.enterusername("ruchithoggu27@gmail.com");
        loginpage.enterPassword("mlrit@2004");
        loginpage.clickLogin();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

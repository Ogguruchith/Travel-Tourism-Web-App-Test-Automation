package com.project.DestinationTesting;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Porject.Destination.destinationPage;
import com.project.base.baseTest;

public class destinationteser extends baseTest {

	
	
	destinationPage dest;
	
	@BeforeMethod
    public void initPage() {
        dest = new destinationPage(driver);
        driver.get("http://127.0.0.1:5501/normal.html");
        // Always go to destination page before each test
        dest.clickDestination();
    }

	@Test
	public void verifyDestinationNavigation() throws Exception {
		

	    String expectedUrl = "http://127.0.0.1:5501/destinations.html";
	    String actualUrl = driver.getCurrentUrl();

	    Assert.assertEquals(actualUrl, expectedUrl, "Navigation to destination page failed");

	    dest.clickGolconda();
	    dest.clickSunsetPoint();

	    dest.enterUsername("John Wick");
	    dest.enterComment("Nice place to visit");
	    dest.clickSubmit();
	    
	    for(int i=0;i<=1;i++)
	    {
	    	driver.navigate().back();
	    	Thread.sleep(3000);
	    }
	    
	}
	
}

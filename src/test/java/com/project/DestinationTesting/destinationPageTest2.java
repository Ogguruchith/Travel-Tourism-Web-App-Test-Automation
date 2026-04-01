package com.project.DestinationTesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Porject.Destination.destinationPage2;
import com.project.base.baseTest;

public class destinationPageTest2 extends baseTest{

	destinationPage2 desti;
	
	@BeforeMethod
	 public void initPage() {
        desti = new destinationPage2(driver);
        driver.get("http://127.0.0.1:5501/normal.html");
        
        desti.clickDestination();
    } 
	@Test
	public void HussianSagar()
	{
		desti.hussain();
		desti.CheckComment("This place is very beatiful");
		desti.Submit();
		
		// Chilikur Balaji Temple
		
	}
	@Test
	public void ChilikurTemple() throws InterruptedException
	{
		desti.Temple();
		desti.CheckComments("This Temple is goos");
		desti.Submitt();
		
		for(int i=0;i<1;i++)
		{
			driver.navigate().back();
			Thread.sleep(3000);
		}
	}
}

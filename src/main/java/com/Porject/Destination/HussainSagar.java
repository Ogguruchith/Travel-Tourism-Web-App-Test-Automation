package com.Porject.Destination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HussainSagar {

	WebDriver driver;
	WebDriverWait wait;
	public HussainSagar()
	{
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
}

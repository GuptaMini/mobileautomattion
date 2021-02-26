package com.iosmobile.test;

import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.iosmobile.base.TestiOSMobileSetup;
import com.iosmobile.pages.iOSMobileScreen;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class iOSMobileTest extends TestiOSMobileSetup{
	
	
	@Test
	public void clickMobileApp() throws MalformedURLException, InterruptedException
	{
		iOSMobileScreen ms = new iOSMobileScreen(testiOSDriver());
		
		
		//Call scroll method
		scrollUpToMoveTowardsTextField();	
		
		//Call click on text fields method
		ms.clickOnTextFieldsButton();
		
		//Enter text in the default input text fields.
		ms.enterTextIndefaultInputfield("Mini");
		
		
			
	}
	private void scrollUpToMoveTowardsTextField() throws InterruptedException
	{	
		Dimension dimension = appium.manage().window().getSize();
		int start_x = (int) (dimension.width *.5);
		int start_y = (int) (dimension.height *.8);
		
		int end_x = (int) (dimension.width *.2);
		int end_y = (int) (dimension.height *.2);
		
		TouchAction touch = new TouchAction(appium);
		touch.press(PointOption.point(start_x,start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x,end_y)).release().perform();	
		}
	
	}


package com.iosmobile.test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.iosmobile.base.TestiOSMobileSetup;
import com.iosmobile.pages.iOSMobileScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class iOSMobileTest extends TestiOSMobileSetup{
	
	
	@Test
	public void clickMobileApp() throws MalformedURLException, InterruptedException
	{
		iOSMobileScreen ms = new iOSMobileScreen(testiOSDriver());
		
		//Call scroll up method
		scrollUpToMoveTowardsTextField();	

		
		//Call click on text fields method
		ms.clickOnTextFieldsButton(iOSMobileScreen.textFields);
		
		//Enter text in the default input text fields.
		ms.enterTextIndefaultInputfield(iOSMobileScreen.defaultTextFields,RandomStringUtils.randomAlphabetic(10));

		//Call click method on the back button
		Thread.sleep(5000);
		ms.clickOnTextFieldsButton(iOSMobileScreen.uicatalog);
		
		//Again call click on text fields method
		ms.clickOnTextFieldsButton(iOSMobileScreen.textFields);
		
		//Verify that default text field is empty
		Verify.verifyNotNull(false,"Field is empty", iOSMobileScreen.defaultTextFields);
		
		//Again call click method on the back button
		Thread.sleep(5000);
		ms.clickOnTextFieldsButton(iOSMobileScreen.uicatalog);
		
		//Call scroll down method
		scrollDownToMoveTowardsTextField();
		
		
	
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
	private void scrollDownToMoveTowardsTextField() throws InterruptedException
	{	
		Dimension dimension = appium.manage().window().getSize();
		int start_y = (int) (dimension.width *.5);
		int start_x = (int) (dimension.height *.8);
		
		int end_y = (int) (dimension.width *.2);
		int end_x = (int) (dimension.height *.2);
		
		TouchAction touch = new TouchAction(appium);
		touch.press(PointOption.point(start_y,start_x))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_y,end_x)).release().perform();	
		}
	
	}


package com.iosmobile.test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.google.common.collect.ImmutableMap;
import com.iosmobile.base.TestiOSMobileSetup;
import com.iosmobile.pages.iOSMobileScreen;

public class iOSMobileTest extends TestiOSMobileSetup{
	
	
	@Test
	public void clickMobileApp() throws MalformedURLException, InterruptedException
	{
		iOSMobileScreen ms = new iOSMobileScreen(testiOSDriver());
		
		//Call scroll up method
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) appium;
		Map<String, Object> scrollObject = new HashMap<>();
		scrollObject.put("direction", "up");
		scrollObject.put("element", ((RemoteWebElement) iOSMobileScreen.textFields).getId());
		js.executeScript("mobile: swipe", scrollObject);

		
		//Call click on text fields method
		ms.clickOnTextFieldsButton(iOSMobileScreen.textFields);
		
		//Enter text in the default input text fields.
		ms.enterTextIndefaultInputfield(iOSMobileScreen.defaultTextFields,RandomStringUtils.randomAlphabetic(10));

	    appium.findElementByXPath(String.format("//XCUIElementTypeButton[@name='%s']", "Done")).click();

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
		
		//Put app in background
		Thread.sleep(5000);
		appium.runAppInBackground(Duration.ofSeconds(-1));
	//	appium.executeScript("mobile: terminateApp", ImmutableMap.of("name", "home"));
		
		
		//Relaunch the app	
		Thread.sleep(10000);
		appium.activateApp("com.example.apple-samplecode.UICatalog");
		
		//appium.executeScript("mobile: activateApp", ImmutableMap.of("com.example.apple-samplecode.UICatalog", "UICatalog.app"));
		
	}
	
}

	
	
	
	


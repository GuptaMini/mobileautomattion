package com.iosmobile.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestiOSMobileSetup {
	
	public AppiumDriver<MobileElement> appium =null;
	
	
	public AppiumDriver<?> testiOSDriver() throws MalformedURLException
	{		
		DesiredCapabilities dcaps=new DesiredCapabilities();
		dcaps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		dcaps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		dcaps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.7");
		dcaps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 (13.7)");
		dcaps.setCapability(MobileCapabilityType.UDID, "1518C7D3-7024-44C6-8D41-9D5C5204672E");
		dcaps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/apps/UICatalog.app");
		
		appium =  new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dcaps);
		appium.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		return appium;
		
	}
		
	}



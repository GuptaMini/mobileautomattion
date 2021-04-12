package com.iosmobile.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.iosmobile.base.TestiOSMobileSetup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class iOSMobileScreen extends TestiOSMobileSetup{
	
	public iOSMobileScreen(AppiumDriver<?> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@iOSXCUITFindBy(accessibility = "Action Sheets")
	public static WebElement actionsheet;
		
	@iOSXCUITFindBy(accessibility = "Text Fields")
	public static WebElement textFields;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UICatalog\"]")
	public static WebElement uicatalog;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField")
	public static WebElement defaultTextFields;
		

	public void clickOnTextFieldsButton(WebElement element)
	{	
		element.click();
	}
	
	
	public void enterTextIndefaultInputfield(WebElement element, String text) throws InterruptedException 
	{
		    element.click();
		    Thread.sleep(3000);
		    element.sendKeys(text);
	}
}

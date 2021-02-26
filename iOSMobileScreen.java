package com.iosmobile.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import com.iosmobile.base.TestiOSMobileSetup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class iOSMobileScreen extends TestiOSMobileSetup{
	
	public iOSMobileScreen(AppiumDriver<?> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
		
	@iOSXCUITFindBy(accessibility = "Text Fields")
	private WebElement textFields;
	
	public void clickOnTextFieldsButton()
	{	
		textFields.click();
	}
	
	@iOSXCUITFindBy(accessibility = "DEFAULT")
	private WebElement defaultTextFields;
	
	 public void enterTextIndefaultInputfield(String text) throws InterruptedException {
		    Thread.sleep(5000);	
		    defaultTextFields.click();
		    defaultTextFields.sendKeys(text);
	    }
	
}

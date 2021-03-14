package com.iosmobile.pages;

import java.awt.DefaultKeyboardFocusManager;
import java.beans.EventHandler;
import java.util.HashMap;
import java.util.Map;

import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.internal.EventFiringKeyboard;
import org.openqa.selenium.support.ui.Wait;

import com.iosmobile.base.TestiOSMobileSetup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class iOSMobileScreen extends TestiOSMobileSetup{
	
	public iOSMobileScreen(AppiumDriver<?> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSXCUITFindBy(accessibility = "Text Fields")
	public static WebElement actionSheet;
		
	@iOSXCUITFindBy(accessibility = "Text Fields")
	public static WebElement textFields;
	
	public void clickOnTextFieldsButton(WebElement element)
	{	
		element.click();
	}
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UICatalog\"]")
	public static WebElement uicatalog;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField")
	public static WebElement defaultTextFields;
	
	 public void enterTextIndefaultInputfield(WebElement element, String text) throws InterruptedException {
		    element.click();
		    Thread.sleep(3000);
		    element.sendKeys(text);
		    
	    }
}

package com.appium.demoautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Native_Maps {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {	
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VishnuPixel");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		
		AndroidDriver driver = new AndroidDriver<>(url,cap);
		
		
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.Button[@text='SKIP']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Search here']").sendKeys("Murugeshpalya");
		TouchActions touch = new TouchActions(driver);
		touch.sendKeys(Keys.DOWN).perform();
		touch.sendKeys(Keys.ENTER).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='DIRECTIONS']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Choose starting point']").click();
		driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text").sendKeys("Qspiders Old Airport Road");
		touch.sendKeys(Keys.DOWN).perform();
		touch.sendKeys(Keys.ENTER).perform();
		
		
		
		
	
	
	}

}

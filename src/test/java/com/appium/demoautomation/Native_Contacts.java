package com.appium.demoautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Native_Contacts {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {	
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VishnuPixel");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		
		AndroidDriver driver = new AndroidDriver<>(url,cap);
		
		driver.findElementById("com.android.contacts:id/floating_action_button").click();
		driver.findElementById("com.android.contacts:id/left_button").click();
		Thread.sleep(2000);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]").sendKeys("Vishnu Chandar");
		driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("9791450416");
		driver.findElementById("com.android.contacts:id/editor_menu_save_button").click();
		Thread.sleep(4000);
		
	}

}

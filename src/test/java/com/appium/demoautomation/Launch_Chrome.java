package com.appium.demoautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Launch_Chrome {
public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VishnuPixel");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	//	cap.setCapability(MobileCapabilityType.APP, "D:\\Appium\\Workspace\\com.appium\\app\\ApiDemos-debug.apk");
	//	cap.setCapability("appPackage", "com.google.android.dialer");
	//	cap.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");

		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AndroidDriver driver = new AndroidDriver(url, cap);
		driver.get("https://www.facebook.com");
	}
}

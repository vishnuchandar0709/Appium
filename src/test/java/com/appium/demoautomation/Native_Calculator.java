package com.appium.demoautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Native_Calculator {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VishnuPixel");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	//	cap.setCapability(MobileCapabilityType.APP, "D:\\Appium\\Workspace\\com.appium\\app\\ApiDemos-debug.apk");
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		AndroidDriver driver = new AndroidDriver<>(url, cap);
	//	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		Thread.sleep(5000);
		
		
		driver.findElementById("com.android.calculator2:id/digit_8").click();
		driver.findElementById("com.android.calculator2:id/op_add").click();
		driver.findElementById("com.android.calculator2:id/digit_3").click();
		driver.findElementById("com.android.calculator2:id/eq").click();
		String text =driver.findElementById("com.android.calculator2:id/result").getText();
		System.out.println("Total is "+text);
		
	}
}

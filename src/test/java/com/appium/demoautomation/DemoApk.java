package com.appium.demoautomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoApk {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VishnuPixel");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.APP, "D:\\Appium\\Workspace\\com.appium\\app\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(url, cap);
//		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Preference\"]").click();
//		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]").click();
//		driver.findElementById("android:id/checkbox").click();
//		driver.findElementByXPath("//android.widget.TextView[]");
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
	}

}

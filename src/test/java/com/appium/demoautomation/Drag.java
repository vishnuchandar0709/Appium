package com.appium.demoautomation;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Drag {
	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		File f = new File("src");
//		File f1 = new File(f, "ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VishnuPixel");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.APP, "D:\\Appium\\Workspace\\com.appium\\app\\ApiDemos-debug.apk");
//		cap.setCapability(MobileCapabilityType.APP, f1.getAbsolutePath());
//		System.out.println("The absolute path for apk demo file is"+f1.getAbsolutePath());
		
		AndroidDriver driver = new AndroidDriver<>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAccessibilityId("Drag and Drop").click();
		WebElement wb=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.View[1]");
		WebElement wb1=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.View[3]");
		TouchAction act=new TouchAction(driver);
		act.longPress(longPressOptions().withElement(element(wb)).withDuration(Duration.ofSeconds(2)))
		.moveTo(element(wb1)).release().perform();
		
	}
}

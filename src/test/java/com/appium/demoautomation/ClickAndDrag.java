package com.appium.demoautomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class ClickAndDrag {
public static void main(String[] args) throws MalformedURLException {

	DesiredCapabilities cap = new DesiredCapabilities();
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
//	File f = new File("src");
//	File f1 = new File(f, "ApiDemos-debug.apk");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VishnuPixel");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	cap.setCapability(MobileCapabilityType.APP, "D:\\Appium\\Workspace\\com.appium\\app\\ApiDemos-debug.apk");
//	cap.setCapability(MobileCapabilityType.APP, f1.getAbsolutePath());
//	System.out.println("The absolute path for apk demo file is"+f1.getAbsolutePath());
	
	AndroidDriver driver = new AndroidDriver<>(url, cap);
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	driver.findElementByAccessibilityId("Date Widgets").click();
	driver.findElementByAccessibilityId("2. Inline").click();
	driver.findElementByAccessibilityId("7").click();;
	WebElement element1=driver.findElementByAccessibilityId("15");
	WebElement element2=driver.findElementByAccessibilityId("45");
	TouchAction act = new TouchAction(driver);
//	act.longPress(longPressOptions().withElement(element1).withDuration(Duration.ofSeconds(2)))
//	.moveTo((element)element2).release().perform();
//	
	act.longPress(longPressOptions().withElement(element(element1)).withDuration(Duration.ofSeconds(2)))
	.moveTo(element(element2)).release().perform();
	
	
	//act.clickAndHold()
	
	}

}

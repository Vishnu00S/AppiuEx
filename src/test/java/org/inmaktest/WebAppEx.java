package org.inmaktest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class WebAppEx {
	
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("deviceName", "ASUS_X00TD");
		cap.setCapability("udid", "J5AAB7602061KBD");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@text='Use without an account']")).click();
		
		driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='No, thanks']")).click();
		  
		 Thread.sleep(3000);
		 WebElement srchbox = driver.findElement(By.xpath("//*[@text='Search or type web address']"));
		srchbox.sendKeys("flipkart");
		 
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		

	}
	
	
}

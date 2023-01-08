package org.inmaktest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CalProj {
	
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("deviceName", "ASUS_X00TD");
		cap.setCapability("udid", "J5AAB7602061KBD");
		cap.setCapability("appPackage", "com.asus.calculator");
		cap.setCapability("appActivity", "com.asus.calculator.Calculator");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		
		WebElement nine = driver.findElement(By.id("com.asus.calculator:id/digit9"));
		nine.click();
		
		WebElement add = driver.findElement(By.id("com.asus.calculator:id/plus"));
		add.click();
		
		WebElement six = driver.findElement(By.id("com.asus.calculator:id/digit6"));
		six.click();
		
		WebElement minu = driver.findElement(By.id("com.asus.calculator:id/minus"));
		minu.click();
		
		WebElement two = driver.findElement(By.id("com.asus.calculator:id/digit2"));
		two.click();
		
		WebElement equal = driver.findElement(By.id("com.asus.calculator:id/equal"));
		equal.click();
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
}

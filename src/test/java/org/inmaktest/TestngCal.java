package org.inmaktest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestngCal {
	public static AndroidDriver driver;
	@BeforeClass
	private void launchBalculator() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("deviceName", "ASUS_X00TD");
		cap.setCapability("udid", "J5AAB7602061KBD");
		cap.setCapability("appPackage", "com.asus.calculator");
		cap.setCapability("appActivity", "com.asus.calculator.Calculator");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
	}
	@Test
	private void tc1() {
		WebElement nine = driver.findElement(By.id("com.asus.calculator:id/digit9"));
		nine.click();
		WebElement two = driver.findElement(By.id("com.asus.calculator:id/digit2"));
		two.click();

	}
	@Test
	private void tc2() {
		WebElement add = driver.findElement(By.id("com.asus.calculator:id/mul"));
		add.click();

	}
	@Test
		private void tc3() {
			WebElement six = driver.findElement(By.id("com.asus.calculator:id/digit6"));
			six.click();
			WebElement five = driver.findElement(By.id("com.asus.calculator:id/digit5"));
			five.click();

		}
		@Test
		private void eql() throws IOException {
			
			WebElement equl = driver.findElement(By.id("com.asus.calculator:id/equal"));
			equl.click();
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File img = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("./ScreenShot\\cal.png");
			FileUtils.copyFile(img, f);

		}

		@AfterClass
		private void clseCalculator() {
		//	driver.quit();

		}
}

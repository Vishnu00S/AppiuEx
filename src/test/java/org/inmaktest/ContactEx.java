package org.inmaktest;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.android.AndroidDriver;

public class ContactEx {
	
	public static AndroidDriver driver;
	
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	ExtentTest test;
	
	@Test
	private void tc1() throws MalformedURLException, Exception {
		htmlreporter = new ExtentHtmlReporter("contactReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream("D:\\ecipse\\CalaulatorClass\\configurations\\config.properties");
		property.load(fis);
		
		
		cap.setCapability("platformName", property.getProperty("platformName"));
		cap.setCapability("platformVersion", property.getProperty("platformVersion"));
		cap.setCapability("dviceName", property.getProperty("dviceName"));
		cap.setCapability("udid", property.getProperty("udid"));
		cap.setCapability("appPackage", property.getProperty("appPackage"));
		cap.setCapability("appActivity", property.getProperty("appActivity"));

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver= new AndroidDriver(url, cap);
		
		test.log(com.aventstack.extentreports.Status.INFO, "create Contact");
		WebElement create = driver.findElement(By.id(property.getProperty("crte")));
		create.click();
		
		test.log(com.aventstack.extentreports.Status.PASS, "Contact_name");
		WebElement firstname = driver.findElement(By.xpath(property.getProperty("finme")));
		firstname.sendKeys(property.getProperty("fnme"));
		
		///test.log(com.aventstack.extentreports.Status.PASS, "Contact phoneNumber");
		WebElement phNo = driver.findElement(By.xpath(property.getProperty("phnum")));
		phNo.sendKeys(property.getProperty("pno"));
		
		//test.log(com.aventstack.extentreports.Status.PASS, "Contact Save");
		WebElement sve = driver.findElement(By.id(property.getProperty("save")));
		sve.click();
	
		
		
	}	
	
	@Test
	private void tc2() {
		//test.log(com.aventstack.extentreports.Status.PASS, "appium test_Case2");

		System.out.println("testcase2");
	}
	
	@Test
	private void tc3() {
		//test.log(com.aventstack.extentreports.Status.PASS, "appium quite");
		System.out.println("testcase3");
		extent.flush();
		driver.quit();

	}
	
	
	
	
	
}

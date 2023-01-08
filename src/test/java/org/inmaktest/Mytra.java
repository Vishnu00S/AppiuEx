package org.inmaktest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Mytra {
		public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("deviceName", "ASUS_X00TD");
		cap.setCapability("udid", "J5AAB7602061KBD");
		cap.setCapability("appPackage", "com.myntra.android");
		cap.setCapability("appActivity", "com.myntra.android.SplashActivity");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		
		WebElement profile = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"tabButton_profile\"]/android.view.ViewGroup/android.widget.ImageView"));
		profile.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']")).click();
		
//		WebElement mobno = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"mobile\"]"));
//		mobno.sendKeys("2345678923");
//		
//		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"form-button\"]")).click();

	}

}

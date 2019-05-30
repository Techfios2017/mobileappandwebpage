package test;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WebappTest {
	
	AppiumDriver driver;

	
	@Test
	    public void openwebapp() throws Exception {
	        DesiredCapabilities capb = new DesiredCapabilities();
	        capb.setCapability("platformName", "Android");
	        //capb.setCapability("platformVersion", "7.0");
	        capb.setCapability("deviceName", "emulator-5554");
	        capb.setCapability("appPackage", "io.selendroid.testapp");
	        capb.setCapability("appActivity", ".HomeScreenActivity");

	        
	        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capb);
	        Thread.sleep(9000);
	        
	       driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
	       driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("john");
	       driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("john@gmail.com");
	       driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("123456");
	       driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
	       
	       //driver.close();
	       //driver.quit();
	       
	        	        
	    }



}

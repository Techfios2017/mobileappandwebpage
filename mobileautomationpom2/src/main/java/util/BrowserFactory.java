package util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BrowserFactory {
	
static WebDriver driver;

public static WebDriver startBrowser(String browserName, String url ) throws Exception{
	
	
	if (browserName.equalsIgnoreCase("Browser"))
	{
		DesiredCapabilities capb = new DesiredCapabilities();
        capb.setCapability("platformName", "Android");
        capb.setCapability("platformmVersion", "7.0");
        capb.setCapability("deviceName", "emulator-5554");
        capb.setCapability("browserName", "Browser");
        
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capb);
		
		
		
		
		//System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		//driver=new ChromeDriver();
	}
	
		
	driver.get(url);
	return driver;
}

}

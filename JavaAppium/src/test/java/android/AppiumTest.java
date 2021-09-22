package android;

import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class AppiumTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
    	DesiredCapabilities caps = new DesiredCapabilities();
    	
    	// Set your access credentials 
    	caps.setCapability("apmosys.user", "YOUR_USERNAME");
    	caps.setCapability("apmosys.accessToken", "YOUR_ACCESS_KEY");
    	
    	// Set URL of the application under test
    	caps.setCapability("appPackage", "Custom_AppPackage");
    	caps.setCapability("appActivity", "Custom_AppActivity");
    	
    	// Specify device and os_version for testing
    	caps.setCapability("deviceName", "Device_Name");
    	caps.setCapability("udid", "UDID");
    	caps.setCapability("platformName", "Platform_Name");    	
    	caps.setCapability("platformVersion", "Platform_Version");
    	
    	caps.setCapability("automationName", "uiautomator2");
    	
    	// Set other Protean capabilities
    	caps.setCapability("name", "Test_Name");
       
    	
    	// Initialise the remote Webdriver using BrowserStack remote URL
    	// and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
        		new URL("http://114.243.118.242:9091/wd/hub"), caps);
        

        // Sample Test case for the Android app. 
        //Write your own test script for the app 
        AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
            ExpectedConditions.elementToBeClickable(
            		MobileBy.AccessibilityId("Search Wikipedia")));
        searchElement.click();
		AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
             ExpectedConditions.elementToBeClickable(
            		 MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
        insertTextElement.sendKeys("Protean");
        Thread.sleep(5000);
        List<AndroidElement> allProductsName = driver.findElementsByClassName(
        		"android.widget.TextView");
        assert(allProductsName.size() > 0);
        
        
        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();
		
	}

}

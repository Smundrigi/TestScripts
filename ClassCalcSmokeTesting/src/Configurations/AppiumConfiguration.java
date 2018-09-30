package Configurations;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
 
/*This class implements the code to start the Appium Server
 * Programmer:Swapna
 * */

public class AppiumConfiguration 
{
 
	public static AndroidDriver<MobileElement> driver;
	static AppiumDriverLocalService service;
	static String service_url;	
	public DesiredCapabilities caps;
	public static int count = 0;	   
		   public AndroidDriver<MobileElement> settings() throws MalformedURLException
		   {
			   System.out.println("Setting method is ccalled");
			 //Set the Desired Capabilities
			    if(count==0)			    	
			    {
			    	caps = new DesiredCapabilities();
			    	caps.setCapability("deviceName", "ZY224JWQ8F");
			    	caps.setCapability("udid", "ZY224JWQ8F"); //Give Device ID of your mobile phone - USB connection
			    	//caps.setCapability("udid", "192.168.1.13:5555"); //Connect Wirelessly
			    	//caps.setCapability("udid", "10.1.15.169:5555"); //Connect Wirelessly
			    	caps.setCapability("platformName", "Android");
			    	
			    	caps.setCapability("platformVersion", "4.4");
			    	caps.setCapability("appPackage", "com.classcalc.classcalc");
			    	caps.setCapability("appActivity", "com.classcalc.classcalc.activities.CalculatorActivity");
			    	caps.setCapability("noReset", "false");
			    	caps.setCapability("unicodeKeyboard", true);
			    	caps.setCapability("resetKeyboard", true);
			    	driver = new AndroidDriver<MobileElement>(new URL("http://192.168.1.20:4723/wd/hub"), caps);	//home
			    	//driver = new AndroidDriver<MobileElement>(new URL("http://10.30.60.54:4723/wd/hub"), caps);	 //GLibrary
			    	//driver = new AndroidDriver<MobileElement>(new URL("http://10.1.15.212:4723/wd/hub"), caps);    //BPL
			    	System.out.println("Appium Server Started");
			    	count++;
			    }
			    else
			    {
			    	System.out.println("Server is already running");
			    	return driver;
			    }
				return driver;
		   }
	
		  
}
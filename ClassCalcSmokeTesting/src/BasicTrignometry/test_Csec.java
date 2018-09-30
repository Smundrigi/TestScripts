package BasicTrignometry;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Configurations.AppiumConfiguration;
import Configurations.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class test_Csec {
	public AppiumDriver<MobileElement> driver;  
	
	TouchAction touchAction;
    String result = null;
    WebDriverWait wait;
    Utilities ul = null;
	public void settings() throws MalformedURLException
  	{
		 AppiumConfiguration serv = new AppiumConfiguration();
  		 driver = serv.settings();
  		 wait = new WebDriverWait(driver, 500);
		 touchAction = new TouchAction(driver);
		 ul = new Utilities();
  	}
    
    @Test (priority = 11)
    public void test_Cosec_30() throws MalformedURLException
    {
    		settings();
    		driver.launchApp();
	        WebDriverWait wait = new WebDriverWait(driver, 500);
    	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
    	    driver.findElement(By.id("trig-category-menu")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-soft")));
    		driver.findElement(By.id("button-csc-soft")).click();
    		driver.findElement(By.id("button-3")).click();
    		driver.findElement(By.id("button-0")).click();
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();    		
    		Assert.assertTrue(result.equals("-1.012113"));
    		ul.ClearTextBox(driver);
    }
    @Test (priority = 12)
    public void test_Cosec_82() throws MalformedURLException
    {
    		driver.findElement(By.id("trig-category-menu")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-soft")));
    		driver.findElement(By.id("button-csc-soft")).click();
    		driver.findElement(By.id("button-8")).click();
    		driver.findElement(By.id("button-2")).click();
    		 //result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("3.1925546"));
    		ul.ClearTextBox(driver);
    }
    @Test (priority = 13)
    public void test_Cosec_90() throws MalformedURLException
    {
    		driver.findElement(By.id("trig-category-menu")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-soft")));
    		driver.findElement(By.id("button-csc-soft")).click();
    		driver.findElement(By.id("button-9")).click();
    		driver.findElement(By.id("button-0")).click();
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText(); 		
    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("1.1185724"));
   
    		ul.ClearTextBox(driver);
    }
    @Test (priority = 14)
    public void test_Cosec_Minus_320() throws MalformedURLException
    {
    		driver.findElement(By.id("trig-category-menu")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-soft")));
    		driver.findElement(By.id("button-csc-soft")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-subtract")));
    		driver.findElement(By.id("button-subtract")).click();
    		driver.findElement(By.id("button-3")).click();
    		driver.findElement(By.id("button-2")).click();
    		driver.findElement(By.id("button-0")).click();
    		 //result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("2.3356004"));
    		ul.ClearTextBox(driver);
    }
    @Test (priority = 15)
    public void test_Cosec_Pi() throws MalformedURLException
    {
    		driver.findElement(By.id("trig-category-menu")).click();
    	
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-soft")));
    		driver.findElement(By.id("button-csc-soft")).click();
    		driver.findElement(By.id("button-pi-numpad")).click();	
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("undefined"));
    		ul.ClearTextBox(driver);
    }
    @Test (priority = 16)
    public void test_Cosec_Pi_Functionalities() throws MalformedURLException
    {
    		driver.findElement(By.id("trig-category-menu")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-soft")));
    		driver.findElement(By.id("button-csc-soft")).click();
    		/*
    		 * Long press */
    		driver.findElement(By.id("button-pi-numpad")).click();
    		System.out.println("Returned Text --->"+result);
    		driver.findElement(By.id("button-divide")).click();
    		driver.findElement(By.id("button-3")).click();
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
    		Assert.assertTrue(result.equals("1.1547005"));
    		driver.closeApp();
    	
    }
}

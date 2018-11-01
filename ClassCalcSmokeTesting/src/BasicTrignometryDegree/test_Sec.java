package BasicTrignometryDegree;

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

public class test_Sec {
	public AppiumDriver<MobileElement> driver;  
    String result = null;
    WebDriverWait wait;
    TouchAction touchAction;
    Utilities ul = null;
	public void settings() throws MalformedURLException
  	{
		 AppiumConfiguration serv = new AppiumConfiguration();
  		 driver = serv.settings();
  		 touchAction = new TouchAction(driver); 
		 wait = new WebDriverWait(driver, 500);
		 ul = new Utilities();
		 //ul.Degree_Rad_Converter(driver);
  	}
	
  @Test (priority=17)
  public void test_Sec_30() throws MalformedURLException
  {
  		settings();
  	 	driver.launchApp();
  	    WebDriverWait wait = new WebDriverWait(driver, 500);
  	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
  		ul.Degree_Rad_Converter(driver);
  	    driver.findElement(By.id("button-sin")).click();
  	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		driver.findElement(By.id("button-3")).click();
  		driver.findElement(By.id("button-0")).click();
  		result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
  				+ "android.widget.LinearLayout/"
  				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")).getText();
  		Assert.assertTrue(result.equals("1.1547005"));
  		ul.ClearTextBox(driver);
  }
  @Test (priority=18)
  public void test_Sec_82() throws MalformedURLException
  {
	  ul.ClearTextBox(driver);
	    driver.findElement(By.id("button-sin")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		driver.findElement(By.id("button-8")).click();
  		driver.findElement(By.id("button-2")).click();
  		result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
  				+ "android.widget.LinearLayout/"
  				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")).getText();
  		System.out.println("Returned Text --->"+result);
  		Assert.assertTrue(result.equals("7.1852965"));
  		ul.ClearTextBox(driver);
  }
  @Test (priority=19)
  public void test_Sec_90() throws MalformedURLException
  {
	  ul.ClearTextBox(driver);
  		driver.findElement(By.id("button-sin")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		driver.findElement(By.id("button-9")).click();
  		driver.findElement(By.id("button-0")).click();
  		result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
  				+ "android.widget.LinearLayout/"
  				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")).getText();
  		System.out.println("Returned Text --->"+result);
  		Assert.assertTrue(result.equals("undefined"));
  		ul.ClearTextBox(driver);
  }
  @Test (priority=20)
  public void test_Sec_Minus_320() throws MalformedURLException
  {
	  ul.ClearTextBox(driver);
  		driver.findElement(By.id("button-sin")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-subtract")));
  		driver.findElement(By.id("button-subtract")).click();
  		driver.findElement(By.id("button-3")).click();
  		driver.findElement(By.id("button-2")).click();
  		driver.findElement(By.id("button-0")).click();
  		result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
  				+ "android.widget.LinearLayout/"
  				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")).getText();
  		System.out.println("Returned Text --->"+result);
  		Assert.assertTrue(result.equals("1.3054073"));
  		ul.ClearTextBox(driver);
  }
  @Test (priority=21) 
  public void test_Sec_Pi() throws MalformedURLException
  {
	  ul.ClearTextBox(driver);
  		driver.findElement(By.id("button-sin")).click();
  	
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		
  		/*
  		 * Long press */
  		WebElement ele = driver.findElement(By.id("button-equals"));
  		touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000))).release().perform();	
  		result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
  				+ "android.widget.LinearLayout/"
  				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")).getText();
  		System.out.println("Returned Text --->"+result);
  		Assert.assertTrue(result.equals("1.0015051"));
  		ul.ClearTextBox(driver);
  }
  @Test (priority=22)
  public void test_Sec_Pi_Functionalities() throws MalformedURLException
  {
	    ul.ClearTextBox(driver);
  		driver.findElement(By.id("button-sin")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		WebElement ele = driver.findElement(By.id("button-equals"));
  		/*
  		 * Long press */
  	    touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000))).release().perform();	
  		System.out.println("Returned Text --->"+result);
  		driver.findElement(By.id("button-divide")).click();
  		driver.findElement(By.id("button-3")).click();
  		result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
  				+ "android.widget.LinearLayout/"
  				+ "android.widget.FrameLayout/android.widget.LinearLayout/"
  				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/"
  				+ "android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/"
  				+ "android.view.View/android.view.View[2]/"
  				+ "android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")).getText();
  		Assert.assertTrue(result.equals("2"));
  		driver.closeApp();
  	
  }
}

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
  	}
	
  @Test (priority=17)
  public void test_Sec_30() throws MalformedURLException
  {
  		settings();
  	 	driver.launchApp();
  	    WebDriverWait wait = new WebDriverWait(driver, 500);
  	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
  		/*Test Sin(30) */
  	    driver.findElement(By.id("trig-category-menu")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		driver.findElement(By.id("button-3")).click();
  		driver.findElement(By.id("button-0")).click();
  		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
  		Assert.assertTrue(result.equals("6.4829212"));


  		ul.ClearTextBox(driver);
  }
  @Test (priority=18)
  public void test_Sec_82() throws MalformedURLException
  {
  		driver.findElement(By.id("trig-category-menu")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		driver.findElement(By.id("button-8")).click();
  		driver.findElement(By.id("button-2")).click();
  		
  		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
  		System.out.println("Returned Text --->"+result);
  		Assert.assertTrue(result.equals("1.0529888"));
  		ul.ClearTextBox(driver);
  }
  @Test (priority=19)
  public void test_Sec_90() throws MalformedURLException
  {
  		driver.findElement(By.id("trig-category-menu")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		driver.findElement(By.id("button-9")).click();
  		driver.findElement(By.id("button-0")).click();
  		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
  		System.out.println("Returned Text --->"+result);
  		Assert.assertTrue(result.equals("-2.231776"));
  		ul.ClearTextBox(driver);
  }
  @Test (priority=20)
  public void test_Sec_Minus_320() throws MalformedURLException
  {
  		driver.findElement(By.id("trig-category-menu")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-subtract")));
  		driver.findElement(By.id("button-subtract")).click();
  		driver.findElement(By.id("button-3")).click();
  		driver.findElement(By.id("button-2")).click();
  		driver.findElement(By.id("button-0")).click();
  		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
  		System.out.println("Returned Text --->"+result);
  		Assert.assertTrue(result.equals("1.1065557"));
  		ul.ClearTextBox(driver);
  }
  @Test (priority=21) 
  public void test_Sec_Pi() throws MalformedURLException
  {
  		driver.findElement(By.id("trig-category-menu")).click();
  	
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		
  		driver.findElement(By.id("button-pi-numpad")).click();	
  		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
  		System.out.println("Returned Text --->"+result);
  		Assert.assertTrue(result.equals("-1"));
  		ul.ClearTextBox(driver);
  }
  @Test (priority=22)
  public void test_Sec_Pi_Functionalities() throws MalformedURLException
  {
  		driver.findElement(By.id("trig-category-menu")).click();
  		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-soft")));
  		driver.findElement(By.id("button-sec-soft")).click();
  		driver.findElement(By.id("button-pi-numpad")).click();
  		driver.findElement(By.id("button-divide")).click();
  		driver.findElement(By.id("button-3")).click();
  		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
  		Assert.assertTrue(result.equals("2"));
  		driver.closeApp();
  	
  }
  
  
}

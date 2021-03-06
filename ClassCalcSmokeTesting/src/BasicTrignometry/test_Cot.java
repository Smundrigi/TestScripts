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

public class test_Cot {
	public AppiumDriver<MobileElement> driver;  
    String result = null;
    WebDriverWait wait;
    Utilities ul = null;
	public void settings() throws MalformedURLException
  	{
		System.out.println("Setting method for Cot called");
		 AppiumConfiguration serv = new AppiumConfiguration();
  		 driver = serv.settings();
  		 wait = new WebDriverWait(driver, 500);
		 ul = new Utilities();
		 System.out.println("Exited from Cot function");
  	}
    @Test (priority = 5)
    public void test_Cot_30() throws MalformedURLException
    {
    	    settings();
    	    driver.launchApp();
    	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
    		/*Test Cot(30) */
    	    driver.findElement(By.id("trig-category-menu")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-soft")));
    		driver.findElement(By.id("button-cot-soft")).click();
    		driver.findElement(By.id("button-3")).click();
    		driver.findElement(By.id("button-0")).click();
    		 //result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
    		Assert.assertTrue(result.equals("-0.15612"));	
    		ul.ClearTextBox(driver);
    }
    @Test (priority = 6)
    public void test_Cot_82() throws MalformedURLException
    {
    		driver.findElement(By.id("trig-category-menu")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-soft")));
    		driver.findElement(By.id("button-cot-soft")).click();
    		driver.findElement(By.id("button-8")).click();
    		driver.findElement(By.id("button-2")).click();
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("3.0318979"));
    		ul.ClearTextBox(driver);
    }
    @Test (priority = 7)
    public void test_Cot_90() throws MalformedURLException
    {
    		driver.findElement(By.id("trig-category-menu")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-soft")));
    		driver.findElement(By.id("button-cot-soft")).click();
    		driver.findElement(By.id("button-9")).click();
    		driver.findElement(By.id("button-0")).click();
    		 //result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("-0.501203"));
    		ul.ClearTextBox(driver);
    }
    @Test (priority = 8)
    public void test_Cot_Minus_320() throws MalformedURLException
    {
    		driver.findElement(By.id("trig-category-menu")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-soft")));
    		driver.findElement(By.id("button-cot-soft")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-subtract")));
    		driver.findElement(By.id("button-subtract")).click();
    		driver.findElement(By.id("button-3")).click();
    		driver.findElement(By.id("button-2")).click();
    		driver.findElement(By.id("button-0")).click();
    		 //result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("2.110694"));
    		ul.ClearTextBox(driver);
    }
    @Test (priority = 9)
    public void test_Cot_Pi() throws MalformedURLException
    {
    	    ul.ClearTextBox(driver);
    		driver.findElement(By.id("trig-category-menu")).click();
    	
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-soft")));
    		driver.findElement(By.id("button-cot-soft")).click();
    		
    		driver.findElement(By.id("button-pi-numpad")).click();	
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("undefined"));
    		ul.ClearTextBox(driver);
    }
    @Test (priority = 10)
    public void test_Cot_Pi_Functionalities() throws MalformedURLException
    {
    	    ul.ClearTextBox(driver);
    		driver.findElement(By.id("trig-category-menu")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-soft")));
    		driver.findElement(By.id("button-cot-soft")).click();
    		driver.findElement(By.id("button-pi-numpad")).click();
    		driver.findElement(By.id("button-divide")).click();
    		driver.findElement(By.id("button-3")).click();
    		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
    				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
    		Assert.assertTrue(result.equals("0.5773503"));
    		driver.closeApp();
    	
    }
}
    


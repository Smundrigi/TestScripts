package BasicTrignometryDegree;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Configurations.AppiumConfiguration;
import Configurations.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
class test_Sin
{
	public AppiumDriver<MobileElement> driver;  
    String result = null;
    WebDriverWait wait;
    Utilities ul = null;
	public void settings() throws MalformedURLException
  	{
  		 AppiumConfiguration serv = new AppiumConfiguration();
  		 driver = serv.settings();
  		 wait = new WebDriverWait(driver, 500);
  		 ul = new Utilities();
  	}
	
	/*Test sin[x] functionality*/
	@Test (priority=23)
    public void test_Sin_30() throws MalformedURLException
    {
    		
    	 	settings();
    	 	driver.launchApp();
    	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
    		/*Test Sin(30) */
    	    driver.findElement(By.id("button-sin")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-soft")));
    		driver.findElement(By.id("button-sin-soft")).click();
    		ul.Degree_Rad_Converter(driver);
    		
    		driver.findElement(By.id("button-3")).click();
    		driver.findElement(By.id("button-0")).click();
    		String result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")).getText();

    		System.out.println("Text Returned"+result);
    		ul.ClearTextBox(driver);
    		//driver.findElement(By.id("button-0")).click();
    		Assert.assertTrue(result.equals("0.5"));
    }		
	@Test (priority=24)
    public void test_Sin_67() throws MalformedURLException
    {
    		/*Test Sin(67)*/
    		//driver.findElement(By.id("editable-math")).clear(); --->Not working
    		
    		driver.findElement(By.id("button-sin")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-soft")));
    		driver.findElement(By.id("button-sin-soft")).click();
    		
    		
    		driver.findElement(By.id("button-6")).click();
    		driver.findElement(By.id("button-7")).click();
    		 //result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
    		result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")).getText();
    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("0.9205049"));
    		
    		/*Test -- sin(90)*/
    		ul.ClearTextBox(driver);
    }
	@Test (priority=25)
    public void test_Sin_90() throws MalformedURLException
    {
    		driver.findElement(By.id("button-sin")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-soft")));
    		driver.findElement(By.id("button-sin-soft")).click();
    		
    		
    		driver.findElement(By.id("button-9")).click();
    		driver.findElement(By.id("button-0")).click();
    		 //result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
    		result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/"
    				+ "android.support.v4.widget.DrawerLayout/"
    				+ "android.view.ViewGroup/"
    				+ "android.webkit.WebView/"
    				+ "android.webkit.WebView/"
    				+ "android.view.View/"
    				+ "android.view.View[2]/"
    				+ "android.view.View[2]/"
    				+ "android.view.View/"
    				+ "android.view.View[2]/"
    				+ "android.view.View/"
    				+ "android.view.View[1]")).getText();
    		Assert.assertTrue(result.equals("1"));
    
    		/*Test -- sin(-67)*/
    		ul.ClearTextBox(driver);
    }
    
	@Test (priority=26)
    public void test_Sin_Minus67() throws MalformedURLException
    {
    		driver.findElement(By.id("button-sin")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-soft")));
    		driver.findElement(By.id("button-sin-soft")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-subtract")));
    		driver.findElement(By.id("button-subtract")).click();
    		driver.findElement(By.id("button-6")).click();
    		driver.findElement(By.id("button-7")).click();
    		 //result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
    		result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")).getText();
    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("-0.920505"));
    }
	@Test (priority=27)
    public void test_Sin_Pi() throws MalformedURLException
    {
    		/*Test -- sin(pi)*/
    		ul.ClearTextBox(driver);
    		driver.findElement(By.id("button-sin")).click();
    		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-soft")));
    		driver.findElement(By.id("button-sin-soft")).click();
    		
    		/*
    		 * Long press */
    		TouchAction touchAction = new TouchAction(driver);
    		WebElement ele = driver.findElement(By.id("button-equals"));
    		touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000))).release().perform();	
    		//driver.findElement(By.id("button-equals")).click();
    		//driver.findElement(By.id("button-6")).click();
    		//driver.findElement(By.id("button-7")).click();
    		 //result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
    		result  = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
    				+ "android.widget.LinearLayout/"
    				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")).getText();
    		System.out.println("Returned Text --->"+result);
    		Assert.assertTrue(result.equals("0.0548037"));
    		driver.closeApp();
    }
}

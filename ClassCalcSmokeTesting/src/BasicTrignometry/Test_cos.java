package BasicTrignometry;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.text.ParseException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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

public class Test_cos {
	public AppiumDriver<MobileElement> driver;
	String result = null;
	WebDriverWait wait;
	Utilities ul = null;

	public void settings() throws MalformedURLException {
		AppiumConfiguration serv = new AppiumConfiguration();
		driver = serv.settings();
		wait = new WebDriverWait(driver, 500);
		ul = new Utilities();
	}

	@Test(priority = 0)
	public void test_Cos_30() throws MalformedURLException, ParseException {
		settings();
		driver.launchApp();
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		driver.findElement(By.id("button-cos-soft")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-0")).click();
		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		Assert.assertTrue(result.equals("0.1542514"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 1)
	public void test_Cos_82() throws MalformedURLException {
		ul.ClearTextBox(driver);
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-soft")));
		driver.findElement(By.id("button-cos-soft")).click();
		driver.findElement(By.id("button-8")).click();
		driver.findElement(By.id("button-2")).click();
		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
		System.out.println("Returned Text --->" + result);
		Assert.assertTrue(result.equals("0.9496777"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 2)
	public void test_Cos_90() throws MalformedURLException {
		ul.ClearTextBox(driver);
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-soft")));
		driver.findElement(By.id("button-cos-soft")).click();
		driver.findElement(By.id("button-9")).click();
		driver.findElement(By.id("button-0")).click();
		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
		System.out.println("Returned Text --->" + result);
		Assert.assertTrue(result.equals("-0.448074"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 3)
	public void test_Cos_Minus_320() throws MalformedURLException {
		ul.ClearTextBox(driver);
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-soft")));
		driver.findElement(By.id("button-cos-soft")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-subtract")));
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-2")).click();
		driver.findElement(By.id("button-0")).click();
		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
		System.out.println("Returned Text --->" + result);
		Assert.assertTrue(result.equals("0.9037051"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 4)
	public void test_Cos_pi() throws MalformedURLException 
	{
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		driver.findElement(By.id("button-cos-soft")).click();
		driver.findElement(By.id("button-pi-numpad")).click();
		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
		System.out.println("Returned Text --->" + result);
		Assert.assertTrue(result.equals("-1"));

	}
	@Test(priority = 4)
	public void test_Cos_Pi_Functionalities() throws MalformedURLException {
		ul.ClearTextBox(driver);
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-soft")));
		driver.findElement(By.id("button-cos-soft")).click();
		driver.findElement(By.id("button-pi-numpad")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-3")).click();
		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();
		System.out.println("Returned Text --->" + result);
		Assert.assertTrue(result.equals("0.5"));
		driver.closeApp();
	}

}

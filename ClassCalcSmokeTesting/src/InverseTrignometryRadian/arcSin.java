package InverseTrignometryRadian;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
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
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class arcSin {
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

	@Test(priority = 27)
	public void test_ArcSin_Minus_1() throws MalformedURLException, InterruptedException {

		settings();
		driver.launchApp();
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		/* Test Sin(30) */
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-inverse-soft")));
		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-1")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-1.5707963"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 28)
	public void test_ArcSin_0() throws MalformedURLException, InterruptedException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-0")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 29)
	public void test_ArcSin_1() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-inverse-soft")));
		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1.5707963"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 30)
	public void test_ArcSin() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-inverse-soft")));
		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-2")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0.523598"));

		/* Test x = 5 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 31)
	public void test_ArcSin_5() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-inverse-soft")));
		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-5")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("undefined"));
		driver.closeApp();
	}

}

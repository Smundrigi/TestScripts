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

public class testTan {
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

	@Test(priority = 32 )
	public void test_ArcTan_Minus_1() throws MalformedURLException {

		settings();
		driver.launchApp();
		// settings();
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		/* Test Sin(30) */
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-inverse-soft")));
		driver.findElement(By.id("button-tan-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-1")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-0.7853981"));

		/* Test x = 0 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 33)
	public void test_ArcTan_0() throws MalformedURLException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-inverse-soft")));
		driver.findElement(By.id("button-tan-inverse-soft")).click();
		driver.findElement(By.id("button-0")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0"));

		/* Test x = 1 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 34)
	public void test_ArcTan1() throws MalformedURLException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-inverse-soft")));
		driver.findElement(By.id("button-tan-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0.7853981"));

		/* Test x = 1/2 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 35)
	public void test_ArcTan_Sqrt() throws MalformedURLException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-inverse-soft")));
		driver.findElement(By.id("button-tan-inverse-soft")).click();
		driver.findElement(By.id("alg-category-menu")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/"
				+ "android.webkit.WebView/android.webkit.WebView/" + "android.view.View/android.view.View[2]/"
				+ "android.view.View[4]/android.view.View/" + "android.widget.GridView/android.view.View[2]/"
				+ "android.view.View[1]/android.widget.Button")).click();
		driver.findElement(By.id("button-3")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1.0471975"));
		ul.ClearTextBox(driver);
	}
	@Test(priority = 36)
	public void test_ArcTan_Fraction() throws MalformedURLException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-inverse-soft")));
		driver.findElement(By.id("button-tan-inverse-soft")).click();
		driver.findElement(By.id("button-4")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-3")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0.9272952"));
	
		driver.closeApp();
	}
	@Test(priority = 37)
	public void test_ArcTan_Negative_Fraction() throws MalformedURLException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-inverse-soft")));
		driver.findElement(By.id("button-tan-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-4")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-3")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-0.9272952"));
		ul.ClearTextBox(driver);
	}
	@Test(priority = 38)
	public void test_ArcTan_Minus_Sqrt() throws MalformedURLException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-inverse-soft")));
		driver.findElement(By.id("button-tan-inverse-soft")).click();
		driver.findElement(By.id("alg-category-menu")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/"
				+ "android.webkit.WebView/android.webkit.WebView/" + "android.view.View/android.view.View[2]/"
				+ "android.view.View[4]/android.view.View/" + "android.widget.GridView/android.view.View[2]/"
				+ "android.view.View[1]/android.widget.Button")).click();
		driver.findElement(By.id("button-3")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-1.0471975"));
		ul.ClearTextBox(driver);
		driver.closeApp();
	}
}
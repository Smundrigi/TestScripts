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

public class arcCos {
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
	public void test_ArcCos_Minus_1() throws MalformedURLException, InterruptedException {
		settings();
		driver.launchApp();
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-0")));
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-inverse-soft")));
		driver.findElement(By.id("button-cos-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-1")).click();
		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("3.1415927"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 1)
	public void test_ArcCos_0() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-inverse-soft")));
		driver.findElement(By.id("button-cos-inverse-soft")).click();
		driver.findElement(By.id("button-0")).click();
		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1.5707963"));

		/* Test x = 1 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 2)
	public void test_ArcCos_1() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-inverse-soft")));
		driver.findElement(By.id("button-cos-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0"));

		/* Test x = 1/2 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 3)
	public void test_ArcCos() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-inverse-soft")));
		driver.findElement(By.id("button-cos-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-2")).click();
		String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1.0471975"));

		/* Test x = 5 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 4)
	public void test_ArcCos_5() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-inverse-soft")));
		driver.findElement(By.id("button-cos-inverse-soft")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button-5")).click();
		System.out.println("Text Returned" + result);
		if(ul.CheckOutputWindows(driver))
		{
			String result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
					+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
					+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
			Assert.assertTrue(result.equals("undefined"));
			
		}
		else
		{
			Assert.assertFalse(false,"No output displayed");
		}

		/* x=1.01 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 5)
	public void test_ArcCos1() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-inverse-soft")));
		driver.findElement(By.id("button-cos-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		driver.findElement(By.id("button-period")).click();
		driver.findElement(By.id("button-0")).click();
		driver.findElement(By.id("button-1")).click();
		if(ul.CheckOutputWindows(driver))
		{
			  result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
					+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
					+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
			Assert.assertTrue(result.equals("undefined"));
			
		}
		else
		{
			Assert.assertFalse(false,"No output displayed");
		}
		System.out.println("Text Returned" + result);
		driver.closeApp();
	}
}

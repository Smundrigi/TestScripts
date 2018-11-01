package InverseTrignometryRadian;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

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

public class arcCsc {
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

	@Test(priority = 13)
	public void test_ArcCsec_Minus_1() throws MalformedURLException {
		settings();
		driver.launchApp();
		// settings();
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		/* Test x=-1 */
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-inverse-soft")));
		driver.findElement(By.id("button-csc-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-1")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-1.5707963"));

		/* Test x = 0 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 14)
	public void test_ArcCsec_0() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-inverse-soft")));
		driver.findElement(By.id("button-csc-inverse-soft")).click();
		driver.findElement(By.id("button-0")).click();
		if (ul.CheckOutputWindows(driver)) {
			result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
					+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
					+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
			System.out.println("Text Returned" + result);
			Assert.assertTrue(result.equalsIgnoreCase("undefined"));
		} else {
			Assert.assertFalse(false, "no output");
		}
		/* Test x = 1 */
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-inverse-soft")));
		driver.findElement(By.id("button-csc-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1.5707963"));

		/* Test x = 2/Sqrt(3) */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 15)
	public void test_ArcCsec_Sqrt() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-inverse-soft")));
		driver.findElement(By.id("button-csc-inverse-soft")).click();
		driver.findElement(By.id("button-2")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("alg-category-menu")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/" + "android.support.v4.widget.DrawerLayout/"
				+ "android.view.ViewGroup/android.webkit.WebView/" + "android.webkit.WebView/android.view.View/"
				+ "android.view.View[2]/android.view.View[4]/" + "android.view.View/android.widget.GridView/"
				+ "android.view.View[2]/android.view.View[1]/" + "android.widget.Button")).click();
		driver.findElement(By.id("button-3")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();				
		Assert.assertTrue(result.equals("1.0471975"));

		/* Test x = (2/Sqrt(3)*(-1)) */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 16)
	public void test_ArcCsec_Sqrt1() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-inverse-soft")));
		driver.findElement(By.id("button-csc-inverse-soft")).click();
		driver.findElement(By.id("button-2")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("alg-category-menu")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/" + "android.support.v4.widget.DrawerLayout/"
				+ "android.view.ViewGroup/android.webkit.WebView/" + "android.webkit.WebView/android.view.View/"
				+ "android.view.View[2]/android.view.View[4]/" + "android.view.View/android.widget.GridView/"
				+ "android.view.View[2]/android.view.View[1]/" + "android.widget.Button")).click();
		driver.findElement(By.id("button-3")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-1.0471975"));
		/* Test x = -2 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 17)
	public void test_ArcCsec_Minus_2() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-csc-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-2")).click();
		if (ul.CheckOutputWindows(driver)) {
			result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
					+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
					+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
			System.out.println("Text Returned" + result);
			Assert.assertTrue(result.equals("-0.5235987"));
		} else {
			Assert.assertFalse(false, "no output is displayed");
		}

		/* Test x = 2 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 18)
	public void test_ArcCsec_2() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-csc-inverse-soft")).click();
		// driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-2")).click();
		if (ul.CheckOutputWindows(driver)) {
			result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
					+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
					+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
			System.out.println("Text Returned" + result);
			Assert.assertTrue(result.equals("0.5235987"));
		} else {
			Assert.assertFalse(false, "no output is displayed");
		}
		driver.closeApp();
	}
}

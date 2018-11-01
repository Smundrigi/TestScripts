package InverseTrignometryDegree;

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

public class arcSin {
	public AppiumDriver<MobileElement> driver;
	String result = null;
	WebDriverWait wait = null;
	Utilities ul = null;

	public void settings() throws MalformedURLException {
		AppiumConfiguration serv = new AppiumConfiguration();
		driver = serv.settings();
		wait = new WebDriverWait(driver, 500);
		ul = new Utilities();
	}

	@Test(priority = 29)
	public void test_ArcSin_Minus_1() throws MalformedURLException {
		settings();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		/* Test x=-1 */
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-inverse-soft")));
		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-1")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		System.out.println("Result " + result);
		Assert.assertTrue(result.equals("-90" + "\u00b0"));

		/* Test x = 0 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 30)
	public void test_ArcSin_0() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		driver.findElement(By.id("button-sin")).click();

		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0" + "\u00b0"));

		/* Test x = 1 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 31)
	public void test_ArcSin_1() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		driver.findElement(By.id("button-sin")).click();
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-inverse-soft")));
		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("90" + "\u00b0"));

		/* Test x = 1/2 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 32)
	public void test_ArcSin_Fractions() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));

		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-inverse-soft")));
		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-2")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("30" + "\u00b0"));

		/* Test x = 5 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 33)
	public void test_ArcSin_5() throws MalformedURLException {
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-inverse-soft")));
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-5")).click();
		if (ul.CheckOutputWindows(driver)) {
			result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/"
					+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
					.getText();
			System.out.println("Text Returned" + result);
			Assert.assertTrue(result.equals("Error message"));
		} else {
			Assert.assertFalse(false, "No output");
		}

		driver.closeApp();
	}
	@Test(priority = 34)
	public void test_ArcSin_Fractions1() throws MalformedURLException {
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin-inverse-soft")));
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.id("button-sin-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		driver.findElement(By.id("button-period")).click();
		driver.findElement(By.id("button-0")).click();
		driver.findElement(By.id("button-1")).click();
		if (ul.CheckOutputWindows(driver)) {
			result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/"
					+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
					.getText();
			System.out.println("Text Returned" + result);
			Assert.assertTrue(result.equals("Error message"));
		} else {
			Assert.assertFalse(false, "No output");
		}

		driver.closeApp();
	}

}

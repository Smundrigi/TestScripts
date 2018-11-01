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

public class arcCot {
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
	@Test(priority = 6)
	public void test_ArcCot_Minus_1() throws MalformedURLException {

		settings();
		driver.launchApp();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		/* Test Sin(30) */
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-cot-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-1")).click();
		String result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-0.7853981" + "\u00b0"));

		/* Test x = 0 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 7)
	public void test_ArcCot_0() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-cot-inverse-soft")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1.5707963" + "\u00b0"));

		/* Test x = 1 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 8)
	public void test_ArcCot_1() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-cot-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("45" + "\u00b0"));

		/* Test x = Sqrt(3) */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 9)
	public void test_ArcCot_Sqrt() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-cot-inverse-soft")).click();
		driver.findElement(By.id("alg-category-menu")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/" + "android.support.v4.widget.DrawerLayout/"
				+ "android.view.ViewGroup/android.webkit.WebView/" + "android.webkit.WebView/android.view.View/"
				+ "android.view.View[2]/android.view.View[4]/" + "android.view.View/android.widget.GridView/"
				+ "android.view.View[2]/android.view.View[1]/" + "android.widget.Button")).click();
		driver.findElement(By.id("button-3")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("30" + "\u00b0"));

		/* Test x = Sqrt(-3) */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 10)
	public void test_ArcCot_Minus_Sqrt() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-cot-inverse-soft")).click();
		driver.findElement(By.id("alg-category-menu")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/" + "android.support.v4.widget.DrawerLayout/"
				+ "android.view.ViewGroup/android.webkit.WebView/" + "android.webkit.WebView/android.view.View/"
				+ "android.view.View[2]/android.view.View[4]/" + "android.view.View/android.widget.GridView/"
				+ "android.view.View[2]/android.view.View[1]/" + "android.widget.Button")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-3")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-1.0471975"));

		/* Test x=4/3 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 11)
	public void test_ArcCot_Fractions() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-cot-inverse-soft")).click();
		// driver.findElement(By.id("alg-category-menu")).click();
		driver.findElement(By.id("button-4")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-3")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0.9272952"));

		/* Test x=4/3 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 12)
	public void test_ArcCot_Negative_Fractions() throws MalformedURLException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-cot-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-4")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-3")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-0.9272952"));
		driver.closeApp();
	}

}

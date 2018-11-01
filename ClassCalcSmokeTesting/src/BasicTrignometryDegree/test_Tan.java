package BasicTrignometryDegree;

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

public class test_Tan {
	public AppiumDriver<MobileElement> driver;
	String result = null;
	WebDriverWait wait;
	TouchAction touchAction;
	Utilities ul = null;

	public void settings() throws MalformedURLException {

		AppiumConfiguration serv = new AppiumConfiguration();
		driver = serv.settings();
		wait = new WebDriverWait(driver, 500);
		touchAction = new TouchAction(driver);
		ul = new Utilities();
	}

	@Test(priority = 28)
	public void test_Tan_30() throws MalformedURLException {
		settings();
		driver.launchApp();
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		/* Test Tan(30) */
		driver.findElement(By.id("button-sin")).click();
		ul.Degree_Rad_Converter(driver);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-soft")));
		driver.findElement(By.id("button-tan-soft")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		Assert.assertTrue(result.equals("0.5773503"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 28)
	public void test_Tan_82() throws MalformedURLException {
		ul.ClearTextBox(driver);
		driver.findElement(By.id("button-sin")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-soft")));
		driver.findElement(By.id("button-tan-soft")).click();
		
		
		driver.findElement(By.id("button-8")).click();
		driver.findElement(By.id("button-2")).click();
		// result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Returned Text --->" + result);
		Assert.assertTrue(result.equals("7.1153697"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 29)
	public void test_Tan_90() throws MalformedURLException {
		ul.ClearTextBox(driver);
		driver.findElement(By.id("button-sin")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-soft")));
		driver.findElement(By.id("button-tan-soft")).click();
		
		
		driver.findElement(By.id("button-9")).click();
		driver.findElement(By.id("button-0")).click();
		// result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Returned Text --->" + result);
		Assert.assertTrue(result.equals("undefined"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 30)
	public void test_Tan_Minus_320() throws MalformedURLException {
		ul.ClearTextBox(driver);
		driver.findElement(By.id("button-sin")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-soft")));
		driver.findElement(By.id("button-tan-soft")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-subtract")));
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-2")).click();
		driver.findElement(By.id("button-0")).click();
		// result = driver.findElement(By.id("answer-expanded")).getAttribute("value");
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Returned Text --->" + result);
		Assert.assertTrue(result.equals("0.8390996"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 31)
	public void test_Tan_Pi() throws MalformedURLException {
		ul.ClearTextBox(driver);
		driver.findElement(By.id("button-sin")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-soft")));
		driver.findElement(By.id("button-tan-soft")).click();
		/*
		 * Long press
		 */
		WebElement ele = driver.findElement(By.id("button-equals"));
		touchAction.longPress(
				LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000)))
				.release().perform();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Returned Text --->" + result);
		Assert.assertTrue(result.equals("0"));
		ul.ClearTextBox(driver);
	}

	@Test(priority = 32)
	public void test_Tan_Pi_functions() throws MalformedURLException {
		ul.ClearTextBox(driver);
		driver.findElement(By.id("button-sin")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-soft")));
		driver.findElement(By.id("button-tan-soft")).click();
		WebElement ele = driver.findElement(By.id("button-equals"));
		/*
		 * Long press
		 */
		touchAction.longPress(
				LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000)))
				.release().perform();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Returned Text --->" + result);
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-3")).click();
		Assert.assertTrue(result.equals("1.7320508"));
		driver.closeApp();

	}
}

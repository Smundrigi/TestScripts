package HyperBolicFunctions;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

public class testCoth {
	public AppiumDriver<MobileElement> driver;
	SoftAssert Assert = new SoftAssert();
	WebDriverWait wait = null;
	String result = null;
	TouchAction touchAction = null;
	Utilities ul = null;
	
	public void settings() throws MalformedURLException {
		AppiumConfiguration serv = new AppiumConfiguration();
		ul = new Utilities();
		driver = serv.settings();
		wait = new WebDriverWait(driver, 500);
		touchAction = new TouchAction(driver);
	}

	@Test (priority = 6)
	public void test_Coth_30() throws MalformedURLException {

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

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-hyper-soft")));
		driver.findElement(By.id("button-cot-hyper-soft")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-0")).click();
		String result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1"));
		ul.ClearTextBox(driver);
	}

	@Test (priority = 7)
	public void test_Coth_82() throws MalformedURLException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-hyper-soft")));
		driver.findElement(By.id("button-cot-hyper-soft")).click();
		driver.findElement(By.id("button-8")).click();
		driver.findElement(By.id("button-2")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1"));
		ul.ClearTextBox(driver);;
	}

	@Test (priority = 8)
	public void test_Coth_90() throws MalformedURLException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-hyper-soft")));
		driver.findElement(By.id("button-cot-hyper-soft")).click();
		driver.findElement(By.id("button-9")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1"));
		ul.ClearTextBox(driver);;
	}

	@Test (priority = 9)
	public void test_Coth_Minus_320() throws MalformedURLException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-hyper-soft")));
		driver.findElement(By.id("button-cot-hyper-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-2")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-1"));
		ul.ClearTextBox(driver);;
	}

	@Test (priority = 10)
	public void test_Coth_Pi() throws MalformedURLException, ParseException {

		double output = 0;
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-hyper-soft")));
		driver.findElement(By.id("button-cot-hyper-soft")).click();
		/* Long press */

		WebElement ele = driver.findElement(By.id("button-equals"));
		touchAction.longPress(
				LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000)))
				.release().perform();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		result = ul.convertNumber(result);
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1"));
		ul.ClearTextBox(driver);;
		driver.closeApp();
	}

}

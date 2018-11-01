package HyperBolicFunctions;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;

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

public class testSech {
	public AppiumDriver<MobileElement> driver;
	WebDriverWait wait = null;
	String result = null;
	TouchAction touchAction = null;
	Utilities ul = null;

	public void settings() throws MalformedURLException {
		AppiumConfiguration serv = new AppiumConfiguration();
		driver = serv.settings();
		wait = new WebDriverWait(driver, 500);
		touchAction = new TouchAction(driver);
		ul = new Utilities();
	}

	@Test (priority = 17)
	public void test_Sech_30() throws MalformedURLException, InterruptedException {
		settings();
		driver.launchApp();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-hyper-soft")));
		driver.findElement(By.id("button-sec-hyper-soft")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-0")).click();
		Thread.sleep(500);
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1.87152459377e-13"));

		/* Test x = 82 */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 18)
	public void test_Sech_82() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-hyper-soft")));
		driver.findElement(By.id("button-sec-hyper-soft")).click();
		driver.findElement(By.id("button-8")).click();
		driver.findElement(By.id("button-2")).click();
		Thread.sleep(500);
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("4.88520147548e-36"));

		/* Test x = 90 */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 19)
	public void test_Sech_90() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-hyper-soft")));
		driver.findElement(By.id("button-sec-hyper-soft")).click();
		driver.findElement(By.id("button-9")).click();
		driver.findElement(By.id("button-0")).click();
		Thread.sleep(500);
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1.638802548e-39"));

		/* Test x = -320 */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 20)
	public void test_Sech_Minus_320() throws MalformedURLException, InterruptedException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-hyper-soft")));
		driver.findElement(By.id("button-sec-hyper-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-2")).click();
		driver.findElement(By.id("button-0")).click();
		Thread.sleep(500);
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("2.122246307e-139"));

		/* Test x = pi */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 21)
	public void test_Sech_Pi() throws MalformedURLException, InterruptedException, ParseException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-hyper-soft")));
		driver.findElement(By.id("button-sec-hyper-soft")).click();
		/* Long press */
		TouchAction touchAction = new TouchAction(driver);
		WebElement ele = driver.findElement(By.id("button-equals"));
		touchAction.longPress(
				LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000)))
				.release().perform();
		Thread.sleep(500);
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals(0.0862667));

		/* Test pi/3 */
		/* Test x = pi */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 22)
	public void test_Sech_Pi_Functionalities() throws MalformedURLException, ParseException {
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-hyper-soft")));
		driver.findElement(By.id("button-sec-hyper-soft")).click();
		/* Long press */
		WebElement ele = driver.findElement(By.id("button-equals"));
		touchAction.longPress(
				LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000)))
				.release().perform();
		driver.findElement(By.id("button-divide")).click();
		;
		driver.findElement(By.id("button-3")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals(0.624888));
		driver.closeApp();
	}

}

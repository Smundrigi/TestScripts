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

public class testTanh {
	public AppiumDriver<MobileElement> driver;
	SoftAssert Assert = new SoftAssert();
	TouchAction touchAction = null;
	String result = null;
	WebDriverWait wait = null;
	Utilities ul = null;

	
	public void settings() throws MalformedURLException {
		AppiumConfiguration serv = new AppiumConfiguration();
		driver = serv.settings();
		touchAction = new TouchAction(driver);
		wait = new WebDriverWait(driver, 500);
		ul = new Utilities();
	}
	@Test (priority = 29)
	public void test_Tanh_30() throws MalformedURLException {
		settings();
		driver.launchApp();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-hyper-soft")));
		driver.findElement(By.id("button-tan-hyper-soft")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-0")).click();
		String result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1"));

		/* Test x = 82 */
		ul.ClearTextBox(driver);
	}
	@Test(priority = 35)
	public void test_Tanh_82() throws MalformedURLException 
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-hyper-soft")));
		driver.findElement(By.id("button-tan-hyper-soft")).click();
		driver.findElement(By.id("button-8")).click();
		driver.findElement(By.id("button-2")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1"));

		/* Test x = 90 */
		ul.ClearTextBox(driver);
	}

	@Test (priority =30 )
	public void test_Tanh_90() throws MalformedURLException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-hyper-soft")));
		driver.findElement(By.id("button-tan-hyper-soft")).click();
		driver.findElement(By.id("button-9")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1"));

		/* Test x = -320 */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 31)
	public void test_Tanh_Minus_320() throws MalformedURLException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-hyper-soft")));
		driver.findElement(By.id("button-tan-hyper-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-2")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-1"));

		/* Test x = -pi */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 32)
	public void test_Tanh_Pi() throws MalformedURLException, ParseException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-hyper-soft")));
		driver.findElement(By.id("button-tan-hyper-soft")).click();
		/* Long press */
		TouchAction touchAction = new TouchAction(driver);
		WebElement ele = driver.findElement(By.id("button-equals"));
		touchAction.longPress(
				LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000)))
				.release().perform();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		result = ul.convertNumber_2(result);
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1.00"));

		/* Test x = -pi */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 33)
	public void test_Tanh_Negative_Pi() throws MalformedURLException, ParseException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-tan-hyper-soft")));
		driver.findElement(By.id("button-tan-hyper-soft")).click();
		/* Long press */
		WebElement ele = driver.findElement(By.id("button-equals"));
		touchAction.longPress(
				LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000)))
				.release().perform();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-3")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		result = ul.convertNumber_2(result);
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0.78"));
		driver.closeApp();
	}
}

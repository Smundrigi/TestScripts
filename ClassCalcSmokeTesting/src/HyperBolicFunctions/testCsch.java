package HyperBolicFunctions;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
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

public class testCsch {
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

	@Test (priority = 11)
	public void test_Csch_30() throws MalformedURLException, InterruptedException {
		settings();
		driver.launchApp();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		/* Test x=-1 */
		driver.findElement(By.id("button-sin")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-hyper-soft")));
		driver.findElement(By.id("button-csc-hyper-soft")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-0")).click();
		Thread.sleep(200);
		String result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("1.871524693e - 13"));

		/* Test x = 82 */
		ul.ClearTextBox(driver);
		
	}

	@Test (priority = 12)
	public void test_Csch_82() throws MalformedURLException {
		
        ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-hyper-soft")));
		driver.findElement(By.id("button-csc-hyper-soft")).click();
		driver.findElement(By.id("button-8")).click();
		driver.findElement(By.id("button-2"));
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("4.885201475e -36"));

		/* Test x = 82 */
		ul.ClearTextBox(driver);
	}

	
	@Test (priority = 13)
	public void test_Csch_90() throws MalformedURLException {

		 ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-hyper-soft")));
		driver.findElement(By.id("button-csc-hyper-soft")).click();
		driver.findElement(By.id("button-9")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("4.885201475e -36"));

		/* Test x = -320 */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 14)
	public void test_Csch_Minus_320() throws MalformedURLException {

		 ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-csc-hyper-soft")));
		driver.findElement(By.id("button-csc-hyper-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-2")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-2.122246307e -139"));

		/* Test x = pi */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 15)
	public void test_Csch_Pi() throws MalformedURLException {
		 ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-hyper-soft")));
		driver.findElement(By.id("button-csc-hyper-soft")).click();
		/* Long press */
		TouchAction touchAction = new TouchAction(driver);
		WebElement ele = driver.findElement(By.id("button-equals"));
		touchAction.longPress(
				LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000)))
				.release().perform();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0.0865895"));

		/* Test pi/3 */
		/* Test x = pi */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 16)
	public void test_Csch_Pi_Functions() throws MalformedURLException {
		 ul.ClearTextBox(driver);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sin")));
		driver.findElement(By.id("button-sin")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-hyper-soft")));
		driver.findElement(By.id("button-csc-hyper-soft")).click();
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
		Assert.assertTrue(result.equals("0.80041"));
		driver.closeApp();
	}
}

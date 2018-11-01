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

public class testCosh {

	public AppiumDriver<MobileElement> driver;
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

	@Test (priority = 0)
	public void test_Cosh_30() throws MalformedURLException, InterruptedException {

        settings();
		driver.launchApp();
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-hyper-soft")));
		driver.findElement(By.id("button-cos-hyper-soft")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-0")).click();
		Thread.sleep(1000);
		String result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		double output = Math.pow(10, 12);
		Assert.assertTrue(result.equals("5.34324" + "." + output));

		/* Test x = 82 */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 1)
	public void test_Cosh_82() throws MalformedURLException {

		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-hyper-soft")));
		driver.findElement(By.id("button-cos-hyper-soft")).click();
		driver.findElement(By.id("button-8")).click();
		driver.findElement(By.id("button-2")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("2.0469984810637273e+35"));

		/* Test x = 90 */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 2)
	public void test_Cosh_90() throws MalformedURLException {

		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-hyper-soft")));
		driver.findElement(By.id("button-cos-hyper-soft")).click();
		driver.findElement(By.id("button-9")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("6.1020164715"));

		/* Test x = -320 */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 3)
	public void test_Cosh_Minus_320() throws MalformedURLException {

		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-hyper-soft")));
		driver.findElement(By.id("button-cos-hyper-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-2")).click();
		driver.findElement(By.id("button-0")).click();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("4.7119884080"));

		/* Test x = pi */
		ul.ClearTextBox(driver);
	}

	@Test (priority = 4)
	public void test_Cosh_Pi() throws MalformedURLException, ParseException {

		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-hyper-soft")));
		driver.findElement(By.id("button-cos-hyper-soft")).click();
		TouchAction touchAction = new TouchAction(driver);
		WebElement ele = driver.findElement(By.id("button-equals"));
		touchAction.longPress(
				LongPressOptions.longPressOptions().withElement(element(ele)).withDuration(Duration.ofMillis(1000)))
				.release().perform();
		result = driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"))
				.getText();
		System.out.println("Text Returned" + result);
		result = ul.convertNumber(result);
		Assert.assertTrue(result.equals("11.59"));
		ul.ClearTextBox(driver);
	}

	@Test (priority = 5)
	public void test_Cosh_Pi_Functionalities() throws MalformedURLException, ParseException {

		/* Test x = pi/3 */
		ul.ClearTextBox(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();

		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cos-hyper-soft")));
		driver.findElement(By.id("button-cos-hyper-soft")).click();
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
		//double output = ul.convertNumber_2(result);
		//Assert.assertEquals(output,11.59);
		Assert.assertTrue(result.equals("1.6002869"));
		driver.closeApp();
	}
}

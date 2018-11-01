package InverseTrignometryRadian;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Configurations.AppiumConfiguration;
import Configurations.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class arcSec {
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

	@Test(priority = 19)
	public void test_ArcSec_Minus_1() throws MalformedURLException {

		settings();
		driver.launchApp();
		// settings();
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		/* Test x=-1 */
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-inverse-soft")));
		driver.findElement(By.id("button-sec-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-1")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-3.1415926"));

		/* Test x = 0 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 20)
	public void test_ArcSec_0() throws MalformedURLException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-inverse-soft")));
		driver.findElement(By.id("button-sec-inverse-soft")).click();
		driver.findElement(By.id("button-0")).click();
		if (ul.CheckOutputWindows(driver)) {
			result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
					+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
					+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
			System.out.println("Text Returned" + result);
			Assert.assertTrue(result.equalsIgnoreCase("infinite"));
		} else {
			Assert.assertFalse(false, "no output");
		}
		/* Test x = 1 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 21)
	public void test_ArcSec_1() throws MalformedURLException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-inverse-soft")));
		driver.findElement(By.id("button-sec-inverse-soft")).click();
		driver.findElement(By.id("button-1")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0"));

		/* Test x = 2/Sqrt(3) */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 22)
	public void test_ArcSec_Radian() throws MalformedURLException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-inverse-soft")));
		driver.findElement(By.id("button-sec-inverse-soft")).click();
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
		Assert.assertTrue(result.equals("0.5235987"));

		/* Test x = (2/Sqrt(3)*(-1)) */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 23)
	public void test_ArcSec_Sqrt1() throws MalformedURLException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-sec-inverse-soft")));
		driver.findElement(By.id("button-sec-inverse-soft")).click();
		driver.findElement(By.id("button-open-paren")).click();
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
		driver.findElement(By.id("button-close-bracket")).click();
		
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0.5235987"));

		/* Test x = Sqrt(-3) */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 24)
	public void test_ArcSec_Sqrt_Negative_Number() throws MalformedURLException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-sec-inverse-soft")).click();
		driver.findElement(By.id("alg-category-menu")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/" + "android.support.v4.widget.DrawerLayout/"
				+ "android.view.ViewGroup/android.webkit.WebView/" + "android.webkit.WebView/android.view.View/"
				+ "android.view.View[2]/android.view.View[4]/" + "android.view.View/android.widget.GridView/"
				+ "android.view.View[2]/android.view.View[1]/" + "android.widget.Button")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-3")).click();
		if (ul.CheckOutputWindows(driver)) {
			result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
					+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
					+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
					+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
			System.out.println("Text Returned" + result);
			Assert.assertTrue(result.equals("-1.0471975"));
		} else {
			Assert.assertFalse(false, "no output is displayed");
		}

		/* Test x=4/3 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 15)
	public void test_ArcSec_Fraction() throws MalformedURLException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-sec-inverse-soft")).click();
		// driver.findElement(By.id("alg-category-menu")).click();
		driver.findElement(By.id("button-4")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-3")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("0.9272952"));

		/* Test x=4/3 */
		ul.ClearTextBox(driver);
	}

	@Test(priority = 26)
	public void test_ArcSec_Fraction1() throws MalformedURLException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("trig-category-menu")));
		driver.findElement(By.id("trig-category-menu")).click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-cot-inverse-soft")));
		driver.findElement(By.id("button-sec-inverse-soft")).click();
		driver.findElement(By.id("button-subtract")).click();
		driver.findElement(By.id("button-4")).click();
		driver.findElement(By.id("button-divide")).click();
		driver.findElement(By.id("button-3")).click();
		result  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/"
				+ "android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")).getText();		
		System.out.println("Text Returned" + result);
		Assert.assertTrue(result.equals("-0.9272952"));
		driver.closeApp();
	}
}

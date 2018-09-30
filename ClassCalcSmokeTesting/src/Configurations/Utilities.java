package Configurations;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utilities {
	public String convertNumber_2(String result) throws ParseException
	{
		Double output;
		DecimalFormat dc = new DecimalFormat("#.##");
		output = dc.parse(result).doubleValue();
		String val = dc.format(output);
		System.out.println("Parsed Value"+val);
		return val;
	}
	public String convertNumber(String result) throws ParseException
	{
		Double output;
		DecimalFormat dc = new DecimalFormat("#.########");
		output = dc.parse(result).doubleValue();
		String val = dc.format(output);
		System.out.println("Parsed Value"+val);
		return val;
	}
	public String convertNumber_9(String result) throws ParseException
	{
		Double output;
		DecimalFormat dc = new DecimalFormat("#.#########");
		output = dc.parse(result).doubleValue();
		String val = dc.format(output);
		System.out.println("Parsed Value"+val);
		return val;
	}
	public boolean CheckOutputWindows(AppiumDriver<MobileElement> driver) {
		List<MobileElement> elements = driver.findElements(By.id("answer-expanded"));
		if (elements.size() > 2) 
		{
			return true;
		} else {
			return false;
		}
	}
	public boolean Degree_Rad_Converter(AppiumDriver<MobileElement> driver) 
	{
		driver.findElement(By.xpath("/hierarchy/" + "android.widget.FrameLayout/" + "android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/" + "android.widget.LinearLayout/" + "android.widget.FrameLayout/"
				+ "android.support.v4.widget.DrawerLayout/" + "android.view.ViewGroup/" + "android.webkit.WebView/"
				+ "android.webkit.WebView/" + "android.view.View/" + "android.view.View[1]/" + "android.view.View[1]"))
				.click();
		return true;
	}
	public void ClearTextBox(AppiumDriver<MobileElement> driver) 
	{
		
		/*[939,660][1080,867]*/
		int startx = 1023;
		int starty = 684;
		int endx = 888;
		int endy = 726;
		/*
		 * [888,684][1023,726]
		 */
		WaitOptions wo = new WaitOptions();
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(new PointOption().withCoordinates(startx, starty))
				.waitAction(wo.withDuration(Duration.ofMillis(20000)))
				.moveTo(new PointOption().withCoordinates(endx, endy)).release().perform();
	}

}


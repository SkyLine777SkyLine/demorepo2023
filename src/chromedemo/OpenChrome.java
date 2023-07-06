package chromedemo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		String url = "https://www.selenium.dev/downloads/";
		String googleUrl = "https://www.google.com";

		// Set system property (key = value)
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

		// Create web driver object:
		WebDriver driver = new ChromeDriver();

		//Move window to left side:
		//driver.manage().window().setPosition(new Point(-50, 0));
		
		// Open the website
		driver.get(url);
	}

}

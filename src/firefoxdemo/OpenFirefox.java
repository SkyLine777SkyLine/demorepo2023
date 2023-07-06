package firefoxdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		{
	        System.setProperty("webdriver.firefox.driver", "C:\\webdrivers\\geckodriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new FirefoxDriver();

	        // Maximize the browser
	       // driver.manage().window().maximize();
	        
	        // Launch Website
	        driver.get("https://www.geeksforgeeks.org/");
	    }
	}

}


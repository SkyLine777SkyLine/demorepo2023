package edgedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {
	 public static void main(String args[])
	    {
	        System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\msedgedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new EdgeDriver();
	        
	        // Maximize the browser
	        driver.manage().window().maximize();
	        
	        // Launch Website
	        driver.get("https://www.geeksforgeeks.org/");
	    }
	}


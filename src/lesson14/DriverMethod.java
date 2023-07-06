package lesson14;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethod {
	
		public static void main(String[] args) throws InterruptedException {
			String seleniumUrl = "https://www.selenium.dev/downloads/";
			String googleUrl = "https://www.google.com";

			// Set system property (key = value)
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

			// Create web driver object:
			WebDriver driver = new ChromeDriver();

			//Move window to left side:
			//driver.manage().window().setPosition(new Point(-50, 0));
			
			// Open the website
			driver.get(googleUrl);//method it opens website(url) in that browser 
			//get() - waits until the page is fully loaded
			Thread.sleep(3000);
			
			driver.navigate().to(seleniumUrl); //does not wait until the page fully loads
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			String curUrl = driver.getCurrentUrl();
			System.out.println(curUrl);
			
			Thread.sleep(2000);
			
			driver.navigate().forward();
			curUrl = driver.getCurrentUrl();//getCurrentUrl - Java method for driver.
			System.out.println(curUrl);
			
			for (int i= 0; i <3 ; i++) {
			driver.navigate().refresh();
			Thread.sleep(1000);
			}
			//Add some validation points (tests)
			//driver.close(); //closes the current browser that driver is pointing to
			//driver.quit(); //closes all browsers/windows/tabs that the current driver opened
			
			
			
		}

	}




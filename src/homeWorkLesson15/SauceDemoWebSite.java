package homeWorkLesson15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SauceDemoWebSite {
public static void main(String[] args) throws InterruptedException {
	
		String Url ="https://www.saucedemo.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		
		//Implicit wait: ///put it in Base
		//Does not throw <No such element exception> before the set time
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement logIn = driver.findElement(By.id("user-name"));
		logIn.sendKeys("standard_user");
		
		Thread.sleep(1000);
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver. findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Irina");
		
		Thread.sleep(1000);
		
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("Proshina");
		
		Thread.sleep(1000);
		
		WebElement zipCode = driver.findElement(By.id("postal-code"));
		zipCode.sendKeys("28270");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
		
//		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Test");
//		driver.findElement(By.linkText("Forgot password?")).click();//visible text on website
//		driver.findElement(By.partialLinkText("Forgot passw")).click();//visible text on website finding by partial text
//	}
		
		boolean endPageTxt = driver.getPageSource().contains("Thank you for your order!");
		 if (endPageTxt) {
			 System.out.println("text correct");
		 }
		 else {
			System.out.println("text incorrect");
		}
		 
		 Thread.sleep(2000);
		 driver.quit();
}
}
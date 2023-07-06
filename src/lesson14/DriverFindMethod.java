package lesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFindMethod {

	public static void main(String[] args) {
	
				String Url = "https://www.letskodeit.com/practice";
				String Url2 = "https://www.facebook.com";
				System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get(Url2);
				
				//now do some actions on the elements/objects of the website
				WebElement bmwRadBtn = driver.findElement(By.id("bmwradio"));
				bmwRadBtn.click();
				WebElement hondaChBtn = driver.findElement(By.id("hondacheck"));
				hondaChBtn.click();
				
				driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Test");
				driver.findElement(By.linkText("Forgot password?")).click();//visible text on website
				//driver.findElement(By.partialLinkText("Forgot passw")).click();//visible text on website finding by partial text
			}

	}

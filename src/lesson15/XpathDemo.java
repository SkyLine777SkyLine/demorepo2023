package lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static void main(String[] args) {
		String url = "https://www.selenium.dev/downloads/";
		String googleUrl = "https://www.google.com";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.get(googleUrl);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("cars");
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER); //use button Enter from Keypad
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		
}
}
package sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWaits //extends Base 
{
	public static void main(String[] args) throws InterruptedException {
		
		String Url ="file:///C:/Users/ipros/Desktop/waits.html";
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		
		//Create explicit wait:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
//	@Test
//	public void explicitWait() {
//	driver.get("file:///C:/Users/ipros/Desktop/waits.html");
		
//		//1.Delayed Alert:
//		driver.findElement(By.id("alert")).click();
//		//I need wait here:
//		wait.until(ExpectedConditions.alertIsPresent());
//
//		driver.switchTo().alert().accept();
//
//}
//	@Test
//	public void textMsg() {
//		driver.get("file:///C:/Users/ipros/Desktop/waits.html");
//		driver.findElement(By.id("populate-text")).click();
//		
//		//Wait here:
//		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("h2")), "Selenium Webdriver"));
//		String text = driver.findElement(By.id("h2")).getText();
//		
//		Assert.assertEquals(text, "Selenium Webdriver");
//				}
//	@Test
//	
//	public void hiddenButton() {
//		driver.get("file:///C:/Users/ipros/Desktop/waits.html");
//		driver.findElement(By.id("display-other-button")).click();
//		
//		//Wait here:
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
//		
//		driver.findElement(By.id("hidden")).click();
//		
//	}
//	@Test
//	public void buttonEnabled() {
//		driver.get("file:///C:/Users/ipros/Desktop/waits.html");
//	
		driver.findElement(By.id("enable-button")).click();
		
		//Wait here:
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("enable-button")));
//		driver.findElement(By.id("disable")).click();
		
		driver.findElement(By.id("checkbox")).click();
		//Wait here:
		wait.until(ExpectedConditions.elementToBeSelected(By.id("checkbox")));
		driver.findElement(By.id("checkbox")).click();
		
	}
	
}

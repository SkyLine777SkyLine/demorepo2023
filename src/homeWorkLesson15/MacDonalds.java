package homeWorkLesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

public class MacDonalds {
	
public static void main(String[] args) throws InterruptedException {
		
		String Url ="https://www.mcdonalds.com";
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Url);

		driver.findElement(By.id("button-ordernow")).click();
		Thread.sleep(500);
		driver.findElement(By.id("radio0")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@id='button-ordernow']")).click();
		Thread.sleep(500);
		
//		driver.findElement(By.id("radio0")).click();
//		Thread.sleep(500);
		
		//driver.findElement(By.xpath("//button[@type='button'][4]")).click();
		}
		

		
}
		
		
	


package homeWorkLesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oneTwoThreeStitch {
	
public static void main(String[] args) throws InterruptedException {
		
		String Url ="https://www.123stitch.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		
		WebElement searchWin = driver.findElement(By.id("searchbox"));
		searchWin.click();
		searchWin.sendKeys("Lugana");
		//searchWin.click();
		
		driver.findElement(By.xpath("(//input[@type='image'])[1]")).click();
//		WebElement logIn =driver.findElement(By.linkText("Log In"));
//		logIn.click();
//		WebElement eMail = driver.findElement(By.name("login_email"));
//		eMail.sendKeys("Irina");
//		
//		Thread.sleep(2000);
//		
//		WebElement pass = driver.findElement(By.name("login_password"));
//		pass.sendKeys("Proshina");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("Login-button")).click();
//		
//		//driver.find_element_by_xpath('//input[contains(@onclick,"1 Bedroom Deluxe")]')
//		
//		WebElement LogIn2 = driver.findElement(By.xpath("onclick=\"this.style.visibility='hidden';this.form.submit();\""));
//		LogIn2.click();	
//				//[onclick="this.style.visibility='hidden';this.form.submit();"]
//				
//		//driver.find_element_by_css_selector("input[onclick*='1 Bedroom Deluxe']")
//		//WebElement LogIn2 = driver.findElement(By.cssSelector("input[onclick*='this.style.visibility='hidden';this.form.submit();']"));
//		//WebElement LogIn2 = driver.findElement(By.linkText("Log In"));
//		//LogIn2.click();


}
}
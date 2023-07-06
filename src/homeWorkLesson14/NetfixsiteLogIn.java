package homeWorkLesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetfixsiteLogIn {
	public static void main(String[] args) {
		
		String Url ="https://www.netflix.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		
		WebElement logIn = driver.findElement(By.className("default-ltr-cache-150ffti"));
		logIn.click();
		//Email or phone number
		WebElement eMailId = driver.findElement(By.className("nfTextField"));
		
		eMailId.sendKeys("Test");
		WebElement eMailPass = driver.findElement(By.name("password"));
		eMailPass.sendKeys("Test");
		
		WebElement signUp = driver.findElement(By.className("login-signup-now"));
		signUp.click();
//		WebElement rememberMeChBtn = driver.findElement(By.id("bxid_rememberMe_true"));
//		rememberMeChBtn.click();
//		rememberMeChBtn.click();
		//rememberMe
		
		
		//driver.findElement(By.className("ui-autocomplete-input")).sendKeys("Test");
		//driver.findElement(By.linkText("Forgot password?")).click();
		
		
	}

}

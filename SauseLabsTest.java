package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SauseLabsTest extends BaseClass{

		@Test //Log in, buy 2 items.
		public void sauceDemo() //throws InterruptedException 
		{ driver.get("https://www.saucedemo.com/");

			WebElement logIn = driver.findElement(By.id("user-name"));
			logIn.sendKeys("standard_user");

			//Thread.sleep(1000);

			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("secret_sauce");

			//Thread.sleep(1000);
			driver.findElement(By.id("login-button")).click();

			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			//Thread.sleep(1000);
			driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
			//Thread.sleep(2000);

			driver.findElement(By.className("shopping_cart_link")).click();
			//Thread.sleep(2000);
			driver.findElement(By.id("checkout")).click();

			WebElement firstName = driver.findElement(By.id("first-name"));
			firstName.sendKeys("Irina");

			//Thread.sleep(1000);

			WebElement lastName = driver.findElement(By.id("last-name"));
			lastName.sendKeys("Proshina");

			//Thread.sleep(1000);

			WebElement zipCode = driver.findElement(By.id("postal-code"));
			zipCode.sendKeys("28270");

			//Thread.sleep(1000);

			driver.findElement(By.id("continue")).click();

			driver.findElement(By.id("finish")).click();

			boolean endPageTxt = driver.getPageSource().contains("Thank you for your order!");
			if (endPageTxt) {
				System.out.println("text correct");
			} else {
				System.out.println("text incorrect");
			}
		}

	}

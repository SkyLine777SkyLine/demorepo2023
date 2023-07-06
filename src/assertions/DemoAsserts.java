package assertions;

import java.sql.Driver;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAsserts extends Base{
	
	//Assert class means hard assertion - if it fails it will stop the test and will move to next step.
	@Test
	public void alertExample() throws InterruptedException {
		
		//Implicit wait: ///put it in Base
		//Does not throw <No such element exception> before the set time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.letskodeit.com/practice");
		
		String test1 = "abc";
		String test3 = "abc";
		String test2 = new String("abc"); //write explanation from video
		
		driver.findElement(By.cssSelector("h1[data-uniqid=\"1621702280245\"]")).getText();
		System.out.println(actualTitle);
		
		//Equality check:
		Assert.assertEquals(actualTitle, "practice page", "Page title is incorrect");
		//Assert.assertNotEquals("abc", "abc", "Should not be equal");
		
		boolean isBenzCheckBoxSelected = driver.findElement(By.id("benzcheck")).isSelected();
		
		//Expecting the condition to be false
		Assert.assertFalse(isBenzCheckBoxSelected, "Benz is not selected");
		
		benzCheckbox.click();
		
		isBenzCheckBoxSelected = benzCheckbox.isSelected();
		Assert.assertTrue(isBenzCheckBoxSelected, "Benz is selected");
		
		
		//Expecting the condition to be true:
		Assert.assertTrue(5>4, "Expecting true");
		
		//Null check 
		//Assert.assertNull(object);
	}

}

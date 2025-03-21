package testNgAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TounderstandAssertion1 {
	@Test
	public void validLoginTC() throws InterruptedException
	{
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 String expectedWelcomepageTitle = "Demo Web Shop";
		 String expectedLogininpageTitle = "Demo Web Shop. Login ";//ADD SPACE FOR FAILD
		 SoftAssert sa = new SoftAssert();
		 sa.assertNotEquals(driver.getTitle(), expectedWelcomepageTitle, "Welcome page IS NOT FOUND!");
		 
		// Assert.assertEquals(driver.getTitle(), expectedWelcomepageTitle, "Welcome page IS NOT Displayed!!!");
		 
		 
		 
		 driver.findElement(By.linkText("Log in")).click();
		//Assert.assertEquals(driver.getTitle(), expectedLogininpageTitle, "Login Page IS NOT FOUND");//--> FOR LOGIN
		//Assert.assertTrue(driver.getTitle().equals(expectedLogininpageTitle), "Login Page IS NOT FOUND");//--->FOR LOGIN FAILED
		 
		 sa.assertNotEquals(driver.getTitle(), expectedLogininpageTitle, "Login Page IS NOT DISPLAYED");
		 driver.findElement(By.id("Email")).sendKeys("mutheminal@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("MinalM@066");
		 driver.findElement(By.xpath("//input[@value ='Log in']")).click();
		 Thread.sleep(1000);
		 
		 sa.assertAll();//Mandatory
		
	}

}

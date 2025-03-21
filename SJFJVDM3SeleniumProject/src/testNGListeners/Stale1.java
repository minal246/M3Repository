package testNGListeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale1
{
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	WebElement email = driver.findElement(By.id("Email"));
	//driver.navigate().refresh();
	email.sendKeys("mutheminal@gmail.com");
	WebElement password = driver.findElement(By.id("Password"));
	password.sendKeys("MinalM@066");
	WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
	loginButton.click();
	

	}

}

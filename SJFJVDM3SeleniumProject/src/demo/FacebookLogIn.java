package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogIn {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("minal");
	driver.findElement(By.id("pass")).sendKeys("minal@123");
	driver.findElement(By.name("login")).click();
	
	}

}

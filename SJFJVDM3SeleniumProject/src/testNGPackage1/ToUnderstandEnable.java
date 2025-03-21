package testNGPackage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandEnable {
  @Test(enabled = true)
  public void launchSelenium() throws InterruptedException {
  WebDriver driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  driver.manage().window().maximize();
  driver.get("https://www.selenium.dev/");
  Thread.sleep(2000);
  driver.close();
  }
  @Test(enabled = false)
  public void launchJavaPoint() throws InterruptedException {
  WebDriver driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  driver.manage().window().maximize();
  driver.get("https://www.tpointtech.com/");
  Thread.sleep(2000);
  driver.close();
  }
}

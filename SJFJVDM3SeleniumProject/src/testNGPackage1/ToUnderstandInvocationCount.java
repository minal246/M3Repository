package testNGPackage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandInvocationCount {
  @Test
  public void launchSelenium() throws InterruptedException {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  driver.get("https://www.selenium.dev/");
  Thread.sleep(2000);
  driver.close();
  
  }
 @Test
  public void launchJavaPoint() throws InterruptedException {
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  driver.get("https://www.tpointtech.com/");
  Thread.sleep(2000);
  driver.close();
}
}

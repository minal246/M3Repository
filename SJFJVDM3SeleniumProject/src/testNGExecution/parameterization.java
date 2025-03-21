package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {
	@Parameters("bname")
  @Test
  public void parameterMethod(String browserValue) 
  {
	  WebDriver driver = null;
	  if(browserValue.equalsIgnoreCase("Chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(browserValue.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else if(browserValue.equalsIgnoreCase("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  else
	  {
		  System.out.println("Invalid Browser Name");
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://demowebshop.tricentis.com/");
  }
}

package DataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstant1 {
	protected static WebDriver driver;
	@BeforeClass
	public void browserSetUp() throws IOException
	{
		Flip flip = new Flip();
		String browserValue = flip.readExcelData(PROP_PATH, EXCEL_PATH, 0, 0)
		String url = flip.readPropertyData(PROP_PATH, URL);
		
		if(browserValue.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
		}
		if(browserValue.equalsIgnoreCase("firefox"))
		{
		driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
		driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter valid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}

}

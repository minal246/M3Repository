package GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import pomPackage.WelcomePage;

public class BaseTest implements IAutoConstant {
	public static WebDriver driver;
	public void browserSetUp() throws IOException
	{
		Flip flip = new Flip();
		String browserValue = flip.readPropertyData(PROP_PATH_MAIN, "browser");
		String url = flip.readPropertyData(PROP_PATH_MAIN, URL);
		
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
			System.out.println("Enter valid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}

	public void validLogin() throws EncryptedDocumentException, IOException
	{
		
	WelcomePage wp = new WelcomePage(driver);
	Flip flip = new Flip();
	String email = flip.readExcelData(EXCEL_PATH_TEXT, VALIDLOGINCREDS, 1, 0);
	String password = flip.readExcelData(EXCEL_PATH_MAIN, VALIDLOGINCREDS, 1, 1);
	lp.validLoginMethod(email, password);
	}
	
	@AfterMethod
	public void logOut()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.logOut();
	}
	
	@AfterMethod
	public void browserTearDown()
	{
		driver.quit();
	}
}

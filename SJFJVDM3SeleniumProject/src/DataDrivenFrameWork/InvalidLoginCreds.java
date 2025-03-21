package DataDrivenFrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginCreds implements IAutoConstant1 {

	public static void main(String[] args) {
		Flip flip = new Flip();
		String url = flip.readPropertyData(PROP_PATH, URL);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		driver.findElement(By.linkText("Log in")).click();
		
		for(int i = 1; i<=4; i++)
		{
		String email = flip.readExcelData(EXCEL_PATH, INVALIDCREADS, i, 0);
		String password = flip.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 1);
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Password")).clear();
		}
		

	}

}

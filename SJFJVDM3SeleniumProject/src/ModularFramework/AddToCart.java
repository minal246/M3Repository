package ModularFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class AddToCart extends BaseTest{

	public static void main(String[] args) throws IOException {
	BaseTest bt = new BaseTest();
	bt.browserSetUp();
	
	WelcomePage wp = new WelcomePage(driver);
	wp.getLoginLink().click();
	
	Flip flip = new Flip();
	String email = flip.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
	String password = flip.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1);
	
	driver.findElement(By.id("Email")).sendKeys(email);	
	

	}

}

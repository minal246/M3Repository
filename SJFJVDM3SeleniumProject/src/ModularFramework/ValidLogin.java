package ModularFramework;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import DataDrivenFrameWork.BaseTest;
import DataDrivenFrameWork.Flip;

@Listeners(testNGListeners.MyListener.class)
public class ValidLogin extends BaseTest{

@Test
public void ValidLoginTC() {
	WelcomePage wp = new WelcomePage(driver);
	wp.getLoginLink().click();
	
	Flip flip = new Flip();
	String email = flip.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 3);
	String password = flip.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 4);
	
	LoginPage lp = new LoginPage(driver);
	lp.validLoginMthod(email, password);
}

}

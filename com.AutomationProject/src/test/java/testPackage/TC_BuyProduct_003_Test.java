package testPackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import pomPackage.CheckOutPage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
@Listeners(GenericLibrary.MyListener.class)
public class TC_BuyProduct_003_Test extends BaseTest {
	
	@Test
	public void buyProductMethod()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLink()wp.click();
		
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		ep.getSmartphoneAddToCartButton().click();
		wp.getShoppingCartLink().click();
		
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getSmartphoneCheckBox().click();
		
		sp.getTermsOfServiceCheckBox().click();
		sp.getCheckoutbox().click();
		
		CheckOutPage cp = new CheckOutPage(driver);
		
		cp.buyProduct();
	}

}

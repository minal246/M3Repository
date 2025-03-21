package testNgAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ModularFramework.ElectronicsPage;
import ModularFramework.WelcomePage;
import testNGListeners.BaseTest;
import testNGListeners.ShoppingCartPage;

public class TC_AddToCart_001_Test extends BaseTest {
	
	
	@Test

	public void addToCartMethod()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronics().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		ep.getSmartphoneAddToCartButton().click();
		
		wp.getShoppingCartLink().click();
		
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(sp.getSmartPhoneCartProduct().isDisplayed(), true, "Product is not addedto cart");
		sa.assertAll();
		boolean result = sp.getSmartPhoneCartProduct().isDisplayed();
		System.out.println(result);
	}

}

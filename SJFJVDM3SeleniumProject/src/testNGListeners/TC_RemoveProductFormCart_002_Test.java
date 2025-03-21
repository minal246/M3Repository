package testNGListeners;

public class TC_RemoveProductFormCart_002_Test extends BaseTest {
	
	public void removeProductFromCart()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.getComputersLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		ep.getSmartphoneAddToCartButton().click();
		
		wp.getShoppingCartLink().click();
		
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getSmartPhoneCartProduct();
		
		sp.get
	}

}

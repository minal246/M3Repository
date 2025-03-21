package testNGListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPageMaven {
	
	//Declaration
	@FindBy(xpath = "//h1[text() ='Shopping cart']/../..//img[@title='Show details for Smartphone']") private WebElement smartphoneCartProduct;
	@FindBy(xpath = "//h1[text() ='Shopping cart']/../..//img[@title='Show details for Smartphone']/../..//input[@name = 'removefromcart'] private WebElement smartphoneCheckBox") private WebElement smartphoneCheckBox; 
	@FindBy(name = "updatecart") private WebElement updateShoppingCartButton;
	@FindBy(name = "continueshopping") private WebElement continueShoppingCartButton;
	@FindBy(id = "termsofservice")private WebElement termsofServiceCheckBox;
	@FindBy(id="checkout")private WebElement CheckOutButton;
	
	//initialization
	public ShoppingCartPageMaven(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSmartphoneCartProduct() {
		return smartphoneCartProduct;
	}

	public WebElement getSmartphoneCheckBox() {
		return smartphoneCheckBox;
	}

	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}

	public WebElement getContinueShoppingCartButton() {
		return continueShoppingCartButton;
	}

	public WebElement getTermsofServiceCheckBox() {
		return termsofServiceCheckBox;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}
	
	
}




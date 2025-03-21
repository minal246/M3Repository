package testNGListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(linkText = "Register") private WebElement registerlink;
	@FindBy(linkText = "Log in") private WebElement loginLink;
	@FindBy(xpath = "//span[text()='Shopping cart']") private WebElement shoppingCartLink;
	@FindBy(xpath="//span[text()='Wishlist']") private WebElement wishlistLink;
	@FindBy(partialLinkText = "BOOKS") private WebElement BooksLink;
	@FindBy(partialLinkText = "COMPUTERS") private WebElement computersLink;
	@FindBy(partialLinkText = "ELECTR0NICS") private WebElement electronics;
	
	//initialization(constructor)
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getBooksLink() {
		return BooksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronics() {
		return electronics;
	}
	
	

}

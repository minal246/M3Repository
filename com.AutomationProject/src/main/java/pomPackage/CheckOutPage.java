package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import GenericLibrary.Flip;
import GenericLibrary.IAutoConstant;
import GenericLibrary.selectUtility;

public class CheckOutPage implements IAutoConstant {
	
	@FindBy(id = "BillingNewAddress_CountryId") private WebElement countryDD;
	@FindBy(id = "BillingNewAddress_City") private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1")private WebElement address1TB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")private WebElement pincodeTB;
	@FindBy(id = "BillingNewAddress_PhoneNumber")private WebElement phoneNumberTB;
	@FindBy(xpath = "//input[@onclick = 'Billing.save()']")private WebElement BillingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")private WebElement shippingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")private WebElement shippingMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")private WebElement paymentMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")private WebElement paymentInformationContinueButton;
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")private WebElement ConfirmOrderConfirmButton;
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")private WebElement successfullyProcessedText;
	@FindBy(id = "billing-address-select") private WebElement billingAddress01AddressDD;
	
	//Initialization
	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getPhoneNumberTB() {
		return phoneNumberTB;
	}

	public WebElement getBillingAddressContinueButton() {
		return BillingAddressContinueButton;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInformationContinueButton() {
		return paymentInformationContinueButton;
	}

	public WebElement getConfirmOrderConfirmButton() {
		return ConfirmOrderConfirmButton;
	}

	public WebElement getSuccessfullyProcessedText() {
		return successfullyProcessedText;
	}
	

	public WebElement getBillingAddress01AddressDD() {
		return billingAddress01AddressDD;
	}

	//Operational Method
	public void buyProduct() throws EncryptedDocumentException, IOException
	{
	selectUtility su = new selectUtility();
	try {
	if(billingAddress01AddressDD.isDisplayed()==true)
	{
		su.selectByVisibleTextMethod(billingAddress01AddressDD, "New Address");
	}
	}
	catch(Exception e)
	{
	su.selectByVisibleTextMethod(countryDD, "India");
	}
	
	Flip flip = new Flip();
	int rn = flip.randomNumber();
	String city = flip.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 0);
	String address1 = flip.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 1);
	long pin = flip.readExcelData1(EXCEL_PATH_MAIN, "buyproductdetails", 1, 2);
	long phone = flip.readExcelData1(EXCEL_PATH_MAIN, "buyproductdetails", 1, 3);
	
//	String pin = flip.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 2);
//	String phone = flip.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 3);
	String PhoneNo = phone+""+rn;
	
	cityTB.sendKeys(city);
	address1TB.sendKeys(address1);
	pincodeTB.sendKeys(String.valueOf(pin));
	phoneNumberTB.sendKeys(String.valueOf(PhoneNo));
	BillingAddressContinueButton.click();
	shippingAddressContinueButton.click();
	shippingMethodContinueButton.click();
	paymentMethodContinueButton.click();
	paymentInformationContinueButton.click();
	ConfirmOrderConfirmButton.click();
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(successfullyProcessedText.isDisplayed(), true, "order is not placed");
	sa.assertAll();
	}
}

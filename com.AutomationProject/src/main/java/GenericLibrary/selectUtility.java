package GenericLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectUtility {
	
	public void selectByVisibleTextMethod(WebElement dropDown, String text)
	{
		Select sel = new Select(dropDown);
		sel.selectByVisibleText(text);
	}

}

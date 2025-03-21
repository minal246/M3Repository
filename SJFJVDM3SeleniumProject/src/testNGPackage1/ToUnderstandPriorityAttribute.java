package testNGPackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstandPriorityAttribute {
  @Test(priority= -4)
  public void login() {
	  Reporter.log("This is login", true);
  }
  
  @Test(priority= -5)
  public void register() {
	  Reporter.log("This is register", true);
  }
  @Test(priority= -3)
  public void checkAccountBalance()
  {
	  Reporter.log("This is checkAccountBalance", true);
  }
  
  @Test(priority= -2)
  public void logOut()
  {
	  Reporter.log("This is logOut", true);
  }
  
}

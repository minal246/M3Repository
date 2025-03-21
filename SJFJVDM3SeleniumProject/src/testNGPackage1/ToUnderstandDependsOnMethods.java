package testNGPackage1;

import org.testng.annotations.Test;

public class ToUnderstandDependsOnMethods {
  @Test(dependsOnGroups = "register")
  public void login() {
	  org.testng.Reporter.log("This is login method", true);
  }
  
  @Test(dependsOnGroups = "login")
  public void checkAccountBalance() {
	  org.testng.Reporter.log("This is checkAccountBalance method", true);
  }
  
  @Test
  public void register() {
	  org.testng.Reporter.log("This is register method", true);
  }
  
  @Test(dependsOnGroups = {"login", "monytransfer"})
  public void logout() {
	  org.testng.Reporter.log("This is logout method", true);
  }
  
  
  @Test(dependsOnGroups = {"login", "register"})
  public void monytransfer() {
	  org.testng.Reporter.log("This is monytransfer method", true);
  }
}

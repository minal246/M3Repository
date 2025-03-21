package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderstandAnnotations {
  @BeforeTest
  public void beforeTestMethod() {
	  Reporter.log("This is beforeTest method", true);
  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("This is afterMethod method", true);
  }
  
  @BeforeSuite
  public void beforeSuit() 
  {
	  Reporter.log("This is beforeSuit method", true);
  }
  
  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("This is afterClass method", true);
  }
  
  @AfterSuite
  public void afterSuit() 
  {
	  Reporter.log("This is afterSuit method", true);
  }
  
  
  @BeforeClass
  public void beforeClassMethod() 
  {
	  Reporter.log("This is beforeClassMethod method", true);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("This is beforeMethod method", true);
  }
  
  @AfterTest
  public void afterTestMethod() 
  {
	  Reporter.log("This is beforeTestMethod method", true);
  }
  
  @Test
  public void test1Method() 
  {
	  Reporter.log("This is test1Method method", true);
  }
  
  @Test
  public void beforeTest1() 
  {
	  Reporter.log("This is afterMethod method", true);
  }
  
  @Test
  public void afterTest1() 
  {
	  Reporter.log("This is afterMethod method", true);
  }
}

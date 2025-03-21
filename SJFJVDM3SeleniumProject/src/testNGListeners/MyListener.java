package testNGListeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class MyListener extends BaseTest implements ITestListener{
  @Override
	public void onTestStart(ITestResult result) {
	  Reporter.log("---test---"+result.getName()+"Started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("----test---"+result.getName()+"succeded", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getName();
		String ldt = LocalDateTime.now().toString();
		String timeStamp = ldt.replace(":", "-");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshots/"+failedMethod+timeStamp+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("---test---"+result.getName()+"skipped", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("---test---"+result.getName()+"successPercentage", true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("---test---"+result.getName()+"failed with Timeout", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("<test>"+context.getName()+"is started", true);
	}

	@Override	public void onFinish(ITestContext context) {
		Reporter.log("<test>"+context.getName()+"is started", true);
	}
}

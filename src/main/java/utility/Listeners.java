package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends SwagLabsPageElement implements ITestListener
{
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test is Successfull"+result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		try {
			Screenshot.takeScreenshot(driver,result.getName());
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test is Skipped"+result.getName());
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is Started"+result.getName());
	}
	
}

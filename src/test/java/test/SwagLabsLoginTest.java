package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.SwagLabsLoginPage;
import utility.ExtentReport;
import utility.SwagLabsPageElement;

@Listeners(utility.Listeners.class)

public class SwagLabsLoginTest  extends SwagLabsPageElement{
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void configureReports()
	{
		reports =ExtentReport.getReports();
	}
	@BeforeMethod
	public void launchApplication()
	{
	  driver= Browser.openChromeBrowser();
	}
	@Test 
	public void SwagLabLoginTest() throws EncryptedDocumentException, IOException 
	{
		test =reports.createTest("SwagLabLoginTest");
		SwagLabsLoginPage swaglabsloginpage =new SwagLabsLoginPage(driver);
		 swaglabsloginpage.enterUsername(0, 0);
		 
		 swaglabsloginpage.enterPassword(1,0);
		 
		 swaglabsloginpage.clickOnlogInBtn();
		 String expectedUrl ="https://www.saucedemo.com";
		 Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
	}
	@AfterMethod
	public void addResults(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,result.getName());
			
		}else if (result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,result.getName());
		}else
		{
			test.log(Status.SKIP,result.getName());
		}
	}
	@AfterTest
	public void flushReport()
	{
		reports.flush();
	}
	
	
	

}

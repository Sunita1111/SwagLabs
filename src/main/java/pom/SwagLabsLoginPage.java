package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Parametrization;

public class SwagLabsLoginPage
{
	@FindBy      (xpath="//input[@id='user-name']")private  WebElement username;
	
	@FindBy      (xpath="//input[@id='password']")private WebElement password;
	
	@FindBy      (xpath="//input[@id='login-button']")private WebElement loginBtn;
	
	
	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterUsername(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		username.sendKeys(Parametrization.TestData(row, cell, "Credentials"));
	}
	public void enterPassword(int row ,int cell) throws EncryptedDocumentException, IOException
	{
		password.sendKeys(Parametrization.TestData(row, cell,"Credentials" ));
	}
	public void clickOnlogInBtn()
	{
		loginBtn.click();
	}
	
	

}

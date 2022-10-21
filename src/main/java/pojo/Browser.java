package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser 
{
	public static WebDriver openChromeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options =new ChromeOptions();
		
		//System.setProperty("webdriver.chrome.driver", "D:\\software testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		return driver;
		
	}

}

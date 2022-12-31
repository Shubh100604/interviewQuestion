package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class base {
	
	public static WebDriver driver;
	@BeforeSuite
	public void openB() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterSuite
	public void closeB(){
		driver.quit();
	}
	
	

}

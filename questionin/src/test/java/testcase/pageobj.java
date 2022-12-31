package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class pageobj extends base {
	
	public WebElement firstN=driver.findElement(By.xpath("//input[@name='first_name']"));
	public WebElement lastN=driver.findElement(By.xpath("//input[@name='last_name']"));
	public WebElement businessN= driver.findElement(By.xpath("//input[@name='business_name']"));
	public WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
	
	
	public WebElement submitB=driver.findElement(By.xpath("//button[@id='demo']"));
	
	
	public WebElement num1= driver.findElement(By.xpath("//span[@id='numb1']"));
	public WebElement num2=driver.findElement(By.xpath("//span[@id='numb2']"));
	
	public WebElement result=driver.findElement(By.xpath("//input[@placeholder='Result ?']"));
	
	
	public void fillDetails(String firstname,String lastname,String businessname,String emailId) {
		firstN.sendKeys(firstname);
		lastN.sendKeys(lastname);
		businessN.sendKeys(businessname);
		email.sendKeys(emailId);
		result.sendKeys(num3);
	}
	public void fillResult(int num3){
		result.sendKeys();
		
	}
	
	public void clickOnsubmitB() {
		submitB.click();
	}
	
	String  num3;
	public void getText() {
		String Num1=num1.getText();
		System.out.println(Num1);
		
		String Num2=num2.getText();
		System.out.println(Num2);
		 num3=Num1+Num2;
		 int num3=Integer.parseInt(Num1)+Integer.parseInt(Num2);
		 
		 System.out.println(num3);
	}
	
	

}

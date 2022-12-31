package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestC1 extends base {
	
	@Test
	
	public void creataccount() {
		driver.get("https://phptravels.com/demo");
		pageobj pb= new pageobj();
		
		pb.getText();
		pb.fillDetails("shubham", "kumtole", "job", "shubaham@gamil.com");
	    
		pb.clickOnsubmitB();
		Assert.assertEquals(driver.getCurrentUrl(), "https://phptravels.com/demo/");
		
		
	}

}

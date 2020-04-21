package Crossasyst_Project.Crossasyst_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	public Login (WebDriver driver) {
		this.driver=driver;	
	}
	
    public void Click_Sign_In1() throws Exception {
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
	}
	
    public void Enter_registered_email_address(String EmailId) throws Exception {
    	driver.findElement(By.id("email")).sendKeys(EmailId);
    	//driver.
    }
    
    public void Enter_registered_password(String Passwd) throws Exception {
    	driver.findElement(By.id("passwd")).sendKeys(Passwd);
    }
    
    public void Click_Sign_in_rgtd() throws Exception {
    	driver.findElement(By.id("SubmitLogin")).click();
    }
	

}

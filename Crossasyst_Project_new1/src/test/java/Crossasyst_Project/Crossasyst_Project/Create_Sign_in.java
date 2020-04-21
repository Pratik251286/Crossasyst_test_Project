package Crossasyst_Project.Crossasyst_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Sign_in {
	
	WebDriver driver;
	
	public Create_Sign_in(WebDriver driver) {
		this.driver=driver;	
	}

	
	public void Click_Sign_In() throws Exception {
		
		driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
		//driver.findElement(By.id("")).
		
	}
	
	public void enter_email_add(String EmailId) throws Exception {
		
		driver.findElement(By.id("email_create")).sendKeys(EmailId);
	}
	
	public void click_create_account() throws Exception {
		
		driver.findElement(By.id("SubmitCreate")).click();
	}
	
	public void enter_personal_info() throws Exception {
		
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Pratik");
		driver.findElement(By.id("customer_lastname")).sendKeys("Vaghela");
		driver.findElement(By.id("passwd")).sendKeys("Powerpoint@123");
		
		
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByValue("25");
		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByValue("12");
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByValue("1986");
		
		//driver.findElement(By.id("firstname")).sendKeys("Pratik");
		//driver.findElement(By.id("lastname")).sendKeys("Vaghela");
		driver.findElement(By.id("company")).sendKeys("NTT Global");
		driver.findElement(By.id("address1")).sendKeys("b-45,Nirlon Complex");
		driver.findElement(By.id("address2")).sendKeys("Goregoan(East)");
		driver.findElement(By.id("city")).sendKeys("Mumbai");
		
		
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Maine");
		
		driver.findElement(By.id("postcode")).sendKeys("40110");
		driver.findElement(By.id("other")).sendKeys("This is Test Script");
		driver.findElement(By.id("phone")).sendKeys("9821796571");
		driver.findElement(By.id("phone_mobile")).sendKeys("9821796571");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("test@gmail.com");
		//driver.findElement(By.id("submitAccount")).click();
	}
	
	public void click_register() throws Exception {
		
		driver.findElement(By.id("submitAccount")).click();
	}
	
	public void click_logout() throws Exception {
		
		driver.findElement(By.xpath("//a[contains(@class,'logout')]")).click();
	}
	
	

}

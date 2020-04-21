package Crossasyst_Project.Crossasyst_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Profile_Order_History {
	
	WebDriver driver;
	
  public Profile_Order_History(WebDriver driver) {
	  this.driver=driver;
  }
  
  public void prfl_ord_hstry() throws Exception {
	  driver.findElement(By.xpath("//a[contains(@title,'View my customer account')]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[contains(text(),'Order history and details')]")).click();
	  //driver.findElement(By.xpath("Order history and details")).click();
	  Thread.sleep(1000);
	  String str =driver.findElement(By.xpath("//tr[contains(@class,'first_item')]/td[3]/span[1]")).getText();
	  
	  System.out.println(str);
	  
  }

}

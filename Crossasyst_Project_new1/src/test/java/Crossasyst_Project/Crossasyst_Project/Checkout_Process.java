package Crossasyst_Project.Crossasyst_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
//import org.junit.*;


public class Checkout_Process {
	
	WebDriver driver;
	
	
	
	public Checkout_Process(WebDriver driver) {
		this.driver= driver;
	}
	

	
public void chkout_process() throws Exception {
	
	
	String Totalprice =driver.findElement(By.id("total_price")).getText();//take total price of 2 products
	driver.findElement(By.xpath("//div[@id='order-detail-content']//following::a[contains(@title,'Proceed to checkout')]")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@name='processAddress']/span[contains(text(),'Proceed to checkout')]")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	driver.findElement(By.id("cgv")).click();
	driver.findElement(By.xpath("//button[@name='processCarrier']/span[contains(text(),'Proceed to checkout')]")).click();
	String Totalprice1 =driver.findElement(By.id("total_price")).getText();
	
	
	//Assert.assertEquals(Totalprice, Totalprice1);
	if(Totalprice.equals(Totalprice1)) {
	System.out.println("Total cost verified");
	}
	
	driver.findElement(By.xpath("//a[contains(text(),'Pay by bank wire')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
	
	
	
	
	
}
	

}

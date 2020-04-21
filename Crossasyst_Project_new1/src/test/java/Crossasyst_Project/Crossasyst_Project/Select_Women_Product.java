package Crossasyst_Project.Crossasyst_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Action;

public class Select_Women_Product {
	
	WebDriver driver;
	
	public Select_Women_Product(WebDriver driver){
		this.driver= driver;
	}
	
	public void select_product() throws Exception{
		Actions action = new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.xpath("//li[contains(@class,'sfHoverForce')]/a[1]")));
		//action.moveToElement(driver.findElement(By.xpath("//a[contains(@class,'sf-with-ul') and contains(text(),'Women')]")));
		driver.findElement(By.xpath("//a[contains(@class,'sf-with-ul') and contains(text(),'Women')]")).click();
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//img[contains(@alt,'Faded Short Sleeve T-shirts')]")));
		action.moveToElement(driver.findElement(By.xpath("//img[contains(@alt,'Faded Short Sleeve T-shirts')]/ancestor::li//span[contains(text(),'Add to cart')]")));
		action.click().build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]/span[1]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'quantity') and contains(@class,'cart_quantity_input form-control grey')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'quantity') and contains(@class,'cart_quantity_input form-control grey')]")).sendKeys("2");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		
		
		
	}

}

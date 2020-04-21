package Crossasyst_Project_Step_Def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Crossasyst_Project.Crossasyst_Project.Checkout_Process;
import Crossasyst_Project.Crossasyst_Project.Create_Sign_in;
import Crossasyst_Project.Crossasyst_Project.Login;
import Crossasyst_Project.Crossasyst_Project.Profile_Order_History;
import Crossasyst_Project.Crossasyst_Project.Select_Women_Product;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Crossasyst_Project_Step_Def {
	
	 WebDriver driver;
	
	
	@Given("^Launch Chrome and open Automation Website$")
	public void launch_Chrome_and_open_Automation_Website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Pratik_Data\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		//WebDriver driver = new WebDriver();
		//ChromeDriver driver1 = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
	}

	@Given("^Create Account under Sign In with Email Id as \"([^\"]*)\"$")
	public void create_Account_under_Sign_In_with_Email_Id_as(String EmailId) throws Exception {
	    
		Create_Sign_in csi = new Create_Sign_in(driver);
		csi.Click_Sign_In();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		csi.enter_email_add(EmailId);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		csi.click_create_account();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		csi.enter_personal_info();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		csi.click_register();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		csi.click_logout();
		
	}

	@Given("^Login with User Credentials as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_User_Credentials_as_and(String EmailId, String Passwd) throws Throwable {
		Login login = new Login(driver);
		login.Click_Sign_In1();
		login.Enter_registered_email_address(EmailId);
		login.Enter_registered_password(Passwd);
		login.Click_Sign_in_rgtd();
		
		
	}

	@Given("^Select WOMEN product and add two qty for the same$")
	public void select_WOMEN_product_and_add_qty_for_the_same() throws Throwable {
	    
		Select_Women_Product swp = new Select_Women_Product(driver);
		swp.select_product();
	}

	@Then("^Complete Checkout process and verify total cost$")
	public void complete_Checkout_process_and_verify_total_cost() throws Throwable {
		Checkout_Process chkoutprcc = new Checkout_Process(driver);
		chkoutprcc.chkout_process();
	}

	@Then("^Verify amount of order under ORDER History$")
	public void verify_amount_of_order_under_ORDER_History() throws Throwable {
		Profile_Order_History poh = new Profile_Order_History(driver);
		poh.prfl_ord_hstry();
	}


	
	
	
	
	
}

package Crossasyst_Project.Crossasyst_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Executor {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Pratik_Data\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new WebDriver();
		//ChromeDriver driver1 = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	
		Thread.sleep(1000);
		
		
		Create_Sign_in csi = new Create_Sign_in(driver);
		csi.Click_Sign_In();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//csi.enter_email_add();
		Thread.sleep(1000);
		csi.click_create_account();
		Thread.sleep(2000);
		csi.enter_personal_info();
		Thread.sleep(2000);
		csi.click_register();
		Thread.sleep(2000);
		csi.click_logout();
		
		Login login = new Login(driver);
		login.Click_Sign_In1();
		//login.Enter_registered_email_address();
		//login.Enter_registered_password();
		login.Click_Sign_in_rgtd();
		
		Select_Women_Product swp = new Select_Women_Product(driver);
		swp.select_product();
		
		Checkout_Process chkoutprcc = new Checkout_Process(driver);
		chkoutprcc.chkout_process();
		
		Profile_Order_History poh = new Profile_Order_History(driver);
		poh.prfl_ord_hstry();
		
		
		

	}

}

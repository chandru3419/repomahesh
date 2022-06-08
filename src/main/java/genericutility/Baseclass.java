package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepo.HomePage;
import pomRepo.LoginPage;

public class Baseclass {
	public WebDriver driver;
	
	@BeforeSuite
	public void configBS(){
		System.out.println("data base connectivity");
		
	}
	
	@BeforeClass
	public void lanchBrowser() throws Throwable{
		FileInputStream fis = new FileInputStream("./property.properties");
		Properties pobj = new Properties();
		
		pobj.load(fis);
		String brs = pobj.getProperty("browser");
		if (brs.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.manage().window().maximize();	
		}
		else if(brs.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		String URL = pobj.getProperty("url");
		
		System.out.println("launching browser");
		
		driver.get(URL);
		
	}
	
	@BeforeMethod
	public void loginAPP(){
		System.out.println("login into appliction");
		
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp("admin","admin");
		
//		lp.getUserNameTextFld().sendKeys("admin");
//		lp.getPasswordTextFld().sendKeys("admin");
//		lp.getLoginButton().click();
		
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		
	}
	
	@AfterMethod
	public void logoutAPP() throws InterruptedException{
		System.out.println("logout of appliction");
		HomePage hm = new HomePage(driver);
		hm.getAdminClick().click();
		hm.getSignout().click();
		
//		//Thread.sleep(2000);
//		//Actions act = new Actions(driver);
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		//act.moveToElement(lg);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
	}
	
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("closing browser");
		driver.close();
		
		
	}
	
	
	@AfterSuite
	public void configAS(){
		System.out.println("data base connectivity close");
		
	}

}

package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminClick;
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signout;
	
	@FindBy(xpath="//a[.='Contacts']")
	private WebElement createContact;
	

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateContact() {
		return createContact;
	}

	public WebElement getAdminClick() {
		return adminClick;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	
	
	

}

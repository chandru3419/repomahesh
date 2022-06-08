package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	//init
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	//rule 2===> declartion
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userNameTextFld;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordTextFld;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginButton;
	
	



	public WebElement getLoginButton() {
		return loginButton;
	}



	public WebElement getPasswordTextFld() {
		return passwordTextFld;
	}

	

	public WebElement getUserNameTextFld() {
		return userNameTextFld;
	} 
	
	
	public void loginToApp(String userName,String passWord){
		getUserNameTextFld().sendKeys(userName);
		getPasswordTextFld().sendKeys(passWord);
		getLoginButton().click();
	}
	
}

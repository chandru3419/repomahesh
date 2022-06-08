package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContact {
	public CreatingNewContact(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement CreatingNewContact;
	
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement SaveButton;
	

	public WebElement getSaveButton() {
		return SaveButton;
	}


	public WebElement getCreatingNewContact() {
		return CreatingNewContact;
	} 
	

}

package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactinform {
	public Contactinform(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[@id='dtlview_Last Name']")
	private WebElement lastnameFldVeri;

	public WebElement getLastnameFldVeri() {
		return lastnameFldVeri;
	}
	
	

}

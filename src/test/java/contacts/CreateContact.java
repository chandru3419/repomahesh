package contacts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericutility.Baseclass;
import pomRepo.Contactinform;
import pomRepo.Contacts;
import pomRepo.CreatingNewContact;
import pomRepo.HomePage;

public class CreateContact extends Baseclass {
	
	@Test
	public void createContactWithLastName(){
		
		HomePage hp = new HomePage(driver);
		hp.getCreateContact().click();
		Contacts crt = new Contacts(driver);
		crt.getClickplusButton().click();
		CreatingNewContact crtNwContct = new CreatingNewContact(driver);
		crtNwContct.getCreatingNewContact().sendKeys("mahi");
		crtNwContct.getSaveButton().click();
		Contactinform contveri = new Contactinform(driver);
		String txt = contveri.getLastnameFldVeri().getText();
		System.out.println(txt);
		assertEquals(txt, "mahi");
		System.out.println("verifeid");
		
//		driver.findElement(By.xpath("//a[.='Contacts']")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("chandru");
//	
	
	}
	
//	@Test
//	public void createContactWithOrg(){
//		
//	}

}

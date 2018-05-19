package leadsGitHub;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG.SeMethods;

public class EditLead extends SeMethods{

	@Test
	public void createLead() throws InterruptedException {
		login();
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Gopinath");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(3000);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		//verifyTitle("View Lead | open taps CRM");
		click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
		Thread.sleep(3000);
		//selectDropDownUsingText(locateElement("id", "updateLeadForm_industryEnumId"), "Computer Software");
		WebElement dropdownsourc = locateElement("id","updateLeadForm_industryEnumId");
		selectDropDownUsingText(dropdownsourc,"IND_SOFTWARE");		
		click(locateElement("xpath", "//input[@class='smallSubmit']"));			

		closeApp();
		}
	private void login() {
		login();
		
	}

	private void closeApp() {
		closeApp();
		
	}
	
}
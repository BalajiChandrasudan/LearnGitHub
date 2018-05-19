package leadsGitHub;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNG.SeMethods;

public class DeleteLead extends SeMethods{

	@Test
	public void deleteLead() throws InterruptedException {
		login();
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Gopinath");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(3000);
		String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		System.out.println(txt);
		
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		//verifyTitle("View Lead | open taps CRM");
		click(locateElement("link", "Delete"));
		
		click(locateElement("link", "Find Leads"));
		//type(locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), txt);
		
		
		//type(locateElement("xpath", "(//label[contains(text(),'Lead ID:')]/following::input)[1]"), txt);
		//type(type,txt);
		
		WebElement pp = locateElement("xpath","(//label[contains(text(),'Lead ID:')]/following::input)[1]");
		type(pp, txt);
		
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");
		closeApp();
	}
	private void closeApp() {
		closeApp();
		
	}

	private void login() {
		login();
		
	}
}	
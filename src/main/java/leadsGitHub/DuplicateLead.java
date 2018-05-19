package leadsGitHub;

import org.testng.annotations.Test;

import testNG.SeMethods;


public class DuplicateLead extends SeMethods{

	@Test
	public void dublicateLead() throws InterruptedException {
		login();
		click(locateElement("link", "Find Leads"));
		click(locateElement("xpath", "//span[contains(text(),'Phone')]"));
		type(locateElement("name", "phoneNumber"), "9597704568");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);
		String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("link", "Duplicate Lead"));
		click(locateElement("xpath", "//input[@name='submitButton']"));				
		//closeApp();
	}

	private void closeApp() {
		closeApp();
		
	}

	public void login() {
		login();
		
	}
}

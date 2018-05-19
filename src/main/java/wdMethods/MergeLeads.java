package wdMethods;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class MergeLeads extends SeMethods{

	
	@Test 
	public void mergeleads() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		clickWithNoSnap(login);	
		WebElement crmLink = locateElement("link","CRM/SFA");
		click(crmLink);
		WebElement clickLead = locateElement("link","Leads");
		click(clickLead);
		WebElement findLeads = locateElement("link","Find Leads");
		click(findLeads);
		WebElement mergeLeads = locateElement("link","Merge Leads");
		click(mergeLeads);		
		
		WebElement icon1 = locateElement("xpath","//img[@alt = 'Lookup'])[1]");
		click(icon1);
		switchToWindow(1);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement firstname = locateElement("name","firstName");
		type(firstname,"Balaji");
		
		//Clicking on Findleads button in new window
		WebElement findleads = locateElement("xpath","//button[contains(text(),'Find Leads')]");
		click(findleads);		
					
		//Getting the text of first element & clicking on First item in the link
		String leadID = getText(locateElement("xpath","//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']//a"));
		WebElement firstEntry = locateElement("xpath","//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']//a");
		click(firstEntry);
		
		switchToWindow(0);
		WebElement icon2 = locateElement("xpath","//img[@alt = 'Lookup'])[1]");
		click(icon2);
		
		switchToWindow(1);
		WebElement firstname2 = locateElement("name","firstName");
		type(firstname2,"Vignesh");
		
		//Clicking on Findleads button in new window
		WebElement findleads2 = locateElement("xpath","//button[contains(text(),'Find Leads')]");
		click(findleads2);	
				
		WebElement firstEntry2 = locateElement("xpath","//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']//a");
		click(firstEntry2);
		
		switchToWindow(0);
		//Clicking on Merge button & 'OK' button in the alert
		WebElement merge = locateElement("link","Merge");
		click(merge);		
		
		acceptAlert();
		
		//Clicking on Find leads menu & searching the leadID which we merged
		WebElement findLeadsmenu = locateElement("link","Find Leads");
		click(findLeadsmenu); 
		
		WebElement leadIDTextBox = locateElement("xpath","//div[@class='x-tab-panel-bwrap']//following::input[2]");
		type(leadIDTextBox,leadID);
		
		//Clicking on FInd leads button
		WebElement findLeadSubmit = locateElement("xpath","//div[@id='findLeads']//following::em[5]");
		click(findLeadSubmit);
		
		//here verifying the exact text of 'No Record to display' 
		WebElement text = locateElement("class", "x-paging-info");
		verifyExactText(text, "No records to display");

	}}

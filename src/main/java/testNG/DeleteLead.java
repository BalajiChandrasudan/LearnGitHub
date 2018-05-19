package testNG;

 
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

public class DeleteLead extends SeMethods{

	//homeworktestng2 @Test(dependsOnMethods = {"testNG.CreateLead.createlead"})
	
	// groupstestng @Test (groups = {"Sanity"},dependsOnGroups = {"Smoke"})
	
	@Test 
	public void deletelead() throws InterruptedException {
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

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement phonenumber = locateElement("xpath","//div[@id = 'findLeads']//following::span[5]");
		click(phonenumber);
		WebElement number = locateElement("xpath","//div[@id = 'findLeads']//following::input[7]");
		type(number,"7358845655");
		
		//Clicking on Find Leads button
		WebElement clickFind = locateElement("xpath", "//div[@id='findLeads']//following::em[5]/button");
		click(clickFind);
		
		/*After deleting the lead to confirm whether its deleted by searching it in Find leads we are getting the Lead ID here.
		cant get by getInt so getting by text & converting it into integer*/
		
		String leadID = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
				
		//Clicking on that particular lead & Clicking on Delete button in View lead page
		WebElement clickData = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		click(clickData);
		
		WebElement delete = locateElement("xpath","//div[@class='frameSectionExtra']/a[4]");
		click(delete);
		
		//clicking on Find leads in left pane
		WebElement findLeads1 = locateElement("link","Find Leads");
		click(findLeads1);
							
	/*query here we have to give the string as per wd methods - am trying to give the leadID variable which i have get at line41
		Solution: after referring the github, they have stored the getText as string instead of variable they havent used getText SeMEthod so i also commented that line41*/ 
		WebElement typeLeadID = locateElement("xpath","//div[@class='x-tab-panel-bwrap']//following::input[1]");
		type(typeLeadID,leadID);
		
		//Clicking on Find leads button
		WebElement findLeadSubmit = locateElement("xpath","//div[@id='findLeads']//following::em[5]");
		click(findLeadSubmit);
		 	
		//here we are verify the exact text of 'No Record to display' 
		WebElement text = locateElement("class", "x-paging-info");
		verifyExactText(text, "No records to display");
}		
}

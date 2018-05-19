package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class EditLead extends SeMethods{

	//classroomtestngS2 @Test(dependsOnMethods = {"testNG.CreateLead.createlead"})
	
	//homeworktestng2 @Test(dependsOnMethods = {"testNG.CreateLead.createlead"})
	
	//groupstestng @Test (groups = {"Smoke"})
	
	@Test 
	public void editlead() throws InterruptedException {
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
		WebElement firstName = locateElement("xpath","//div[@class='x-tab-panel-bwrap']//following::input[2]");
		type(firstName,"Balaji");
		WebElement lastName = locateElement("xpath","//div[@class='x-tab-panel-bwrap']//following::input[3]");
		type(lastName,"Chandra Sudan");
		WebElement findLeadSubmit = locateElement("xpath","//div[@id='findLeads']//following::em[5]");
		click(findLeadSubmit);
		Thread.sleep(9000);
		WebElement nameClick = locateElement("xpath","//table[@class = 'x-grid3-row-table']//a");
		click(nameClick);
		WebElement edit = locateElement("xpath", "//div[@class= 'contentarea']//a[3]");
		click(edit);
		WebElement companyname = locateElement("id", "updateLeadForm_companyName");
		type(companyname,"Cognizant");
		
				
		/*WebElement industry = locateElement("xpath","//select[@id='updateLeadForm_industryEnumId']");
		click(industry);
		selectDropDownUsingText(industry,"Computer Software");
		*/
		WebElement update = locateElement("xpath","//div[@class='fieldgroup-body']//following::input[15]");
		click(update);
		
		WebElement viewcompanyname = locateElement("id", "viewLead_companyName_sp");
		verifyPartialText(viewcompanyname, "Cognizant");
}	
}
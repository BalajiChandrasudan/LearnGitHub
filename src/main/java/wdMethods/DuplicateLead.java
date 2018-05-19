package wdMethods;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class DuplicateLead extends SeMethods{

	
	@Test
	public void duplicatelead() throws InterruptedException {
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
		Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		//Clicking on Email tab  & giving Email address
		WebElement email = locateElement("xpath","//*[@id = 'findLeads']//following::span[6]");
		click(email);
				
		WebElement emailAddress = locateElement("xpath","//*[@class='x-panel-footer x-panel-footer-noborder']/preceding::input[1]");
		type(emailAddress,"baji1051@gmail.com");
		
		//Clicking on Find leads
		WebElement clickFind = locateElement("xpath", "//div[@id='findLeads']//following::em[5]");
		click(clickFind);
					
		//Getting the first name text & storing it
		String firstname= getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a"));
				
		//Clicking on first name link
		WebElement clickData= locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a");
		click(clickData);
			
		//Clicking on Duplicate Lead button
		WebElement duplicate = locateElement("xpath", "//*[@class = 'subMenuButtonDangerous']/preceding-sibling::a[3]");
		click(duplicate);
				
		//Validating whether the page is in duplicate lead if yes proceeding with clicking on Create lead button
		WebElement title = locateElement("class", "x-panel-header sectionHeaderTitle");
		verifyTitle("Duplicate lead",title);
	
		WebElement clickSubmitDuplicate = locateElement("class","smallSubmit");
		click(clickSubmitDuplicate);
		
		/*Query & Solution - refer Delete lead line 56 & 57
		Here firstname1 - webelement getText of it available in verifyExactText SeM & firstname is string variable got in line40*/
		WebElement firstname1= locateElement("ID","viewLead_firstName_sp");
		verifyExactText(firstname1,firstname); 
		
		}
	
}
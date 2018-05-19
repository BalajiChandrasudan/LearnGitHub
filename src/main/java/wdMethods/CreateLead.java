package wdMethods;
 
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class CreateLead extends SeMethods{
	@Test
	public void createlead() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		//Thread.sleep(3000);
		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);		
		
		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);
		
		WebElement leads = locateElement("link","Leads");
		click(leads);
		
		
		WebElement createlead = locateElement("link","Create Lead");
		click(createlead);
		
		WebElement keyincompanyname = locateElement("id","createLeadForm_companyName");
		type(keyincompanyname,"CTS");
		
		WebElement fnname = locateElement("id","createLeadForm_firstName");
		type(fnname,"Balaji");

		WebElement lnname = locateElement("id","createLeadForm_lastName");
		type(lnname,"Chandra Sudan");
		
		WebElement phoneCountryCode = locateElement("id","createLeadForm_primaryPhoneCountryCode");
		type(phoneCountryCode,"+91"); 
		
		WebElement phoneAreaCode = locateElement("id","createLeadForm_primaryPhoneAreaCode");
		type(phoneAreaCode, "");
		
		WebElement phoneExtension = locateElement("id","createLeadForm_primaryPhoneExtension");
		type(phoneExtension, "7358845655");
				 
		WebElement dDown = locateElement("id", "createLeadForm_industryEnumId");
		selectDropDownUsingIndex(dDown, 3);
		WebElement dDown1 = locateElement("id", "createLeadForm_currencyUomId");
		selectDropDownUsingText(dDown1, "INR - Indian Rupee");

		WebElement dropdownsourc = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(dropdownsourc,"Direct Mail");
		
		WebElement primaryPhoneNumber = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(primaryPhoneNumber,"7358845655");
		
		WebElement primaryEmail = locateElement("id","createLeadForm_primaryEmail");
		type(primaryEmail,"baji1051@gmail.com");
		 		
		WebElement submitbutton = locateElement("class","smallSubmit");
		click(submitbutton);
		
	}}

		
		
//		WebElement viewlead = locateElement("id","sectionHeaderTitle_leads");
//		verifyExactText(viewlead,"View Lead");
//		
		/*
		WebElement clickEdit = locateElement("link", "Edit");
		click(clickEdit);
		WebElement editcompName = locateElement("id", "updateLeadForm_companyName");
		type(editcompName, "TL_MV");
		WebElement descrp = locateElement("id", "updateLeadForm_description");
		type(descrp, "This is the Test Description using SeMethod");	
		WebElement editSubmit = locateElement("class", "smallSubmit");
		click(editSubmit);*/
	
	

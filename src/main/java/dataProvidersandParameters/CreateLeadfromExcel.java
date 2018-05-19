package dataProvidersandParameters;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

@Test(dataProvider="fetchdata")
public class CreateLeadfromExcel extends SeMethods{

	
	public void createLead(String cname, String fname, String lname, String pno, String uname, String pwd )  throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement userName = locateElement("id","username");
		type(userName, uname);
		WebElement passWord = locateElement("id", "password");
		type(passWord, pwd);

			WebElement login = locateElement("class", "decorativeSubmit");
			click(login);	
			
			WebElement crmsfa = locateElement("link","CRM/SFA");
			click(crmsfa);
			
			WebElement leades = locateElement("link","Leads");
			click(leades);
			

		click(locateElement("link", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), pno);
		click(locateElement("name", "submitButton"));
		//closeApp();
	}	
	
	@DataProvider(name="fetchdata")
	public Object[][] getData() throws IOException
	{
		ReadExcelparameter obj = new ReadExcelparameter();
		return obj.fetchData();
	
	}
}

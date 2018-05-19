package dataProvidersandParameters;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateLeadDataProvider extends SeMethods{

	@Test(dataProvider="fetch data")
	//@Parameters({"Browser","URL","Username","password"})
	public void createLead(String cname, String fname, String lname, String pno)  throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
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
			

		click(locateElement("link", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), pno);
		click(locateElement("name", "submitButton"));
		//closeApp();
	}	
	
	
	@DataProvider(name="fetch data")
	public String[][] getData()
	{
		String [][] data =new String [2][4];
		data[0][0]="cts";
		data[0][1]="Balaji";		
		data[0][2]="C";
		data[0][3]="9900990099";
		data[1][0]="Accenture";
		data[1][1]="Miithilesh";
		data[1][2]="M";
		data[1][3]="9445870689";
	return data;
	}
}
package dataProvidersandParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wdMethods.SeMethods;

public class CreateLeadParameters extends SeMethods{

	//hw3a.xml
	//@Test
	
	//hw4a.xml
	//@Test(invocationCount=2, invocationTimeOut=120000 )
	
	//hw1a.xml
	//@Test(groups= {"smoke"})
	
	//parameterscw.xml
	@Test
	@Parameters({"Browser","URL","Username","password"})
	public void createLead(String browser, String url, String uname, String pwd)  throws InterruptedException {
			startApp(browser, url);
			//Thread.sleep(3000);
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
		type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"), "Gopinath");
		type(locateElement("id", "createLeadForm_lastName"), "Jayakumar");
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));
		//closeApp();
	}	
/*	
	@Test
	public void createLead2() {	
		login();
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"), "Gopinath");
		type(locateElement("id", "createLeadForm_lastName"), "Jayakumar");
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));
		closeApp();
	}*/
}
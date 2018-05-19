 package leadsFullProgramSource;

 
import org.openqa.selenium.chrome.ChromeDriver;
 

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching Browser & navigating to leaftaps URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
		//Logging in
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		//Entering the First Name to find the leads
		driver.findElementByXPath("//div[@class='x-tab-panel-bwrap']//following::input[2]").sendKeys("Balaji");
		
		//Clicking on Find Leads button
		driver.findElementByXPath("//div[@id = 'findLeads']//following::em[5]").click();
		Thread.sleep(6000);
		
		//Clicking on the First entry
		driver.findElementByXPath("//table[@class = 'x-grid3-row-table']//a").click();
		
		//Click on Edit button
		driver.findElementByXPath("//div[@class= 'contentarea']//a[3]").click();
		
		//Clearing the existing entry & keying new company name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Cognizant");
		
		//clicking on Update button so it navigates to View leads page
		driver.findElementByXPath("//input[@value = 'Update']").click();
		
		//So, to compare the what we have entered and what captured in the view leads, we are getting the text of it & comparing
		String companyname = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(companyname);
		
		if (companyname.equalsIgnoreCase("Cognizant"))
		System.out.println("ok");	
		

	}
			
}
		
		//driver.findElementByXPath("//div[@class = "x-panel-body x-panel-body-noheader x-panel-body-noborder"]//div [2]"; 
		//div[@class='x-tab-panel-bwrap']//following::input[2]
		


package leadsFullProgramSource;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		
		//Launching Browser & navigating to leaftaps URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		//Logging in
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(6000);
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(6000);
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		//To find Lead, clicking on Phone tab & entering phone number
		driver.findElementByXPath("//div[@id = 'findLeads']//following::span[5]").click();

		driver.findElementByXPath("//div[@id = 'findLeads']//following::input[7]").sendKeys("987654321");
		
		//Clicking on Find Leads button
		driver.findElementByXPath("//div[@id = 'findLeads']//following::em[5]").click();	
		
		Thread.sleep(6000);
		
		/*After deleting the lead to confirm whether its deleted by searching it in Find leads we are getting the Lead ID here.
		cant get by getInt so getting by text & converting it into integer*/
		
		String leadID = driver.findElementByXPath("(//table[@class = 'x-grid3-row-table']//a)[1]").getText();
		System.out.println(leadID);
		int id = Integer.parseInt(leadID);
		System.out.println(id);
						
		//Clicking on that particular lead & Clicking on Delete button in View lead page
		driver.findElementByXPath("//table[@class = 'x-grid3-row-table']//a").click();
		
		driver.findElementByXPath("//div[@class= 'contentarea']//a[4]").click();
					
		//Navigating to Find leads link in left pane
		driver.findElementByLinkText("Find Leads").click();
			
		driver.findElementByXPath("(//label[contains(text(),'Lead ID:')]/following::input)[1]").sendKeys(leadID);
			 
		//Clicking on Find Leads button
		driver.findElementByXPath("//div[@id = 'findLeads']//following::em[5]").click();
		Thread.sleep(3000);

		//Getting the msg displaying & storing it as string
		String msg = driver.findElementByClassName("x-paging-info").getText();
		System.out.println(msg);
		
		if (msg.equalsIgnoreCase("No records to display"))
			System.out.println("ok");	
			
	}
}
			
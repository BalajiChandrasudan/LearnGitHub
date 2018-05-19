/*Activity:
	To login http://leaftaps.com/opentaps & merge a lead with the existing lead */

package leadsFullProgramSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt = 'Lookup'])[1]").click();
		//To get the Number of Windows opened
		Set<String> allwindows = driver.getWindowHandles();
		
		//get option available only in List so we have to get it & switch it to that windows
		List<String> listOfWindows = new ArrayList<String>();
		listOfWindows.addAll(allwindows);
		//Assigning the variables for each window
		String firstWindow = listOfWindows.get(0);
		String secWindow = listOfWindows.get(1);
		//String thirdWindow = listOfWindows.get(2);
		
		//To move the control second window
		driver.switchTo().window(secWindow);
		driver.findElementByName("firstName").sendKeys("Balaji");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Getting the text of first element & clicking on First item in the link
		 String leadID = driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']//a").getText();
		 driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']//a").click();
		 
		 driver.switchTo().window(firstWindow); 
		 driver.findElementByXPath("(//img[@alt = 'Lookup'])[2]").click();
		 
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		//encountering error in this line
		driver.switchTo().window(secWindow);
		driver.findElementByName("firstName").sendKeys("Vignesh");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//clicking on First item in the link
		 driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']//a").click();
		 
		 driver.switchTo().window(firstWindow);
		 driver.findElementByLinkText("Merge").click();
		 
		 //Clicking 'OK' button in the alert
		 driver.switchTo().alert().accept();
		 
		 //Clicking on Find leads menu & searching the leadID which we merged
		 driver.findElementByLinkText("Find Leads").click();
		 driver.findElementByXPath("//div[@class='x-tab-panel-bwrap']//following::input[2]").sendKeys(leadID);
		
		 //Clicking on Find Leads button
		driver.findElementByXPath("//div[@id = 'findLeads']//following::em[5]").click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		

		//Getting the msg displaying & storing it as string
				String msg = driver.findElementByClassName("x-paging-info").getText();
				System.out.println(msg);
				
				if (msg.equalsIgnoreCase("No records to display"))
					System.out.println("ok");	
		}	

}

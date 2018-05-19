package leadsFullProgramSource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

		public static void main(String[] args) throws InterruptedException {
			
			//Launching Browser & navigating to leaftaps URL
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps");
			
			//Logging in
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			Thread.sleep(3000);
			driver.findElementByLinkText("CRM/SFA").click();
			Thread.sleep(3000);
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();
			
			//Clicking on Email tab
			driver.findElementByXPath("(//*[@id = 'findLeads']//following::span[6])[1]").click();
						
			//Entering the Email address 
			driver.findElementByXPath("//*[@class='x-panel-footer x-panel-footer-noborder']/preceding::input[1]").sendKeys("baji1051@gmail.com");
									
			//Clicking on Find Leads button
			driver.findElementByXPath("//div[@id = 'findLeads']//following::em[5]").click();
			Thread.sleep(6000);
				
			//Getting the first name text & storing it
			String firstName = driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']//a").getText();
			System.out.println(firstName);					
			
			//Clicking on first name link
			driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']//a").click();
			
			//Clicking on Duplicate Lead button
			driver.findElementByXPath("//*[@class = 'subMenuButtonDangerous']/preceding-sibling::a[3]").click();	
						
			//Getting the Duplicate Lead header text 
			String headerID = driver.findElementById("sectionHeaderTitle_leads").getText();
			System.out.println(headerID);
			
			//Validating whether the page is in duplicate lead if yes proceeding with clicking on Create lead button
			if (headerID.equalsIgnoreCase("Duplicate lead"))
			{driver.findElementByClassName("smallSubmit").click();}
			
			//getting the first name of newly created Duplicate Lead
			String firstName1 = driver.findElementById("viewLead_firstName_sp").getText();
			
			//Validating whether the original name (firstName) & duplicate name (firstName1) are matching
			if (firstName1.equalsIgnoreCase(firstName))
			{
			System.out.println(firstName1);
			driver.close();
			}
						
	}

}

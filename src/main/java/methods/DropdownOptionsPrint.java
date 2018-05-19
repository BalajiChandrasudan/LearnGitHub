/*Activity:
	To login http://leaftaps.com/opentaps & create a lead by giving mandatory details
*/
package methods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOptionsPrint {

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
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("vicky");
		driver.findElementById("createLeadForm_firstName").sendKeys("bala");
		/*For Dropdown its will not detect as driver.find... so after entering that give Ctrl+2+l, its mentioned as webelement  
		For Dropdown - 1. detecting it as webelement. 2. Selecting it 3)so import org... is a method & in below we are calling it
		step 34  is the obj calling*/
		WebElement dd = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select (dd); 
		dropdown.selectByValue("LEAD_EMPLOYEE");
		
		WebElement mc = driver.findElementById("createLeadForm_marketingCampaignId");
		Select mcdropdown=new Select (mc);
		//allOptions - object, here we are getting the list of options.
		List<WebElement> allOptions = mcdropdown.getOptions();
		
	
			//for each - here we are  printing eachopt by getting text of that
		for (WebElement eachOpt : allOptions) {
			
			String opt = eachOpt.getText();
			System.out.println(opt);
			
		}
		
		driver.findElementById("createLeadForm_lastName").sendKeys("bala");
		//driver.findElementByClassName("smallSubmit").click();
		
				
	}



	}


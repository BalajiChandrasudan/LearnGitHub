/*Activity:
	To login http://leaftaps.com/opentaps & create a lead by entering what are all given*/

package leadsFullProgramSource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Balaji");
		driver.findElementById("createLeadForm_lastName").sendKeys("Chandra");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Bala");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("C");

		//giving salutation
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		
		//Selecting source
		WebElement dd = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select (dd); 
		dropdown.selectByValue("LEAD_EMPLOYEE");
		
		//giving title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("650000");
		
		//Selecting Industry
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select Ind = new Select (Industry);
		Ind.selectByValue("IND_SOFTWARE");
		
		WebElement ownerShip = driver.findElementById("createLeadForm_ownershipEnumId");
		Select owner = new Select(ownerShip);
		owner.selectByVisibleText("Corporation");
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("101010");
		driver.findElementById("createLeadForm_description").sendKeys("Creating Lead");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important Note");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("7358845655");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Prod");
		
		WebElement perferredCurrency = driver.findElementById("createLeadForm_currencyUomId");
		Select currency = new Select(perferredCurrency);
		currency.selectByValue("INR");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("45");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$44445");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Mani");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.url.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Balaji");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Maruthi");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Nanganallur");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select province = new Select(state);
		province.selectByValue("AA");
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600097");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("789");
		
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketingCam = new Select(marketingCampaign);
		marketingCam.selectByValue("CATRQ_AUTOMOBILE");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7358845655");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("baji1051@gmail.com");
		driver.findElementByClassName("smallSubmit").click();
		}
	}



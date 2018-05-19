package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {

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
		
		driver.findElementById("createLeadForm_birthDate-button").click();
		WebElement bod = driver.findElementByXPath("//div[@class='calendar']//table");
		List<WebElement> allrows = bod.findElements(By.tagName("tr"));
		//List<WebElement> findElementsByTagName = driver.findElementsByTagName("tr");
		
		int rowcount = allrows.size();
		System.out.println(rowcount);
		driver.findElementByXPath("//div[@class='calendar']//table//tbody//tr[2]//td[1]").click();
		//div[@class='calendar']//table//tbody//tr[2]//td[1]
		
}}

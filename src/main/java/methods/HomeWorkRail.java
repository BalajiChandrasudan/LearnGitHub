package methods;


		import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;

		import org.openqa.selenium.Keys;

		import org.openqa.selenium.WebElement;

		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

		public class HomeWorkRail {
			public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		

				ChromeDriver driver = new ChromeDriver();	

				driver.get("https://erail.in/");		

				driver.manage().window().maximize();	

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


				driver.findElementById("txtStationFrom").clear();

				driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);


				driver.findElementById("txtStationTo").clear();

				driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);

				boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
			
				if(selected) {

					driver.findElementById("chkSelectDateOnly").click();			
				}
	
				WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
				
				List<WebElement> allRows = table.findElements(By.tagName("tr"));
				
				int rowsCount = allRows.size();
				System.out.println(rowsCount);
				
				List<String> trainName=new ArrayList<String>();
				
				//Go to the each row
				
				for (WebElement eachRow : allRows) {
					 List<WebElement> eachColumn = eachRow.findElements(By.tagName("td"));
					 String trainNames = eachColumn.get(1).getText();
					 //System.out.println(trainNames);
					 trainName.add(trainNames);
					
				}
				
				Collections.sort(trainName);
				System.out.println(trainName);
				
				
				driver.findElementByLinkText("Train Name").click();
				
		WebElement table1 = driver.findElementByXPath("//table[@class='DataTable TrainList']");
				
				List<WebElement> allRows1 = table1.findElements(By.tagName("tr"));
				List<String> trainName2=new ArrayList<String>();

				for (WebElement eachRow1 : allRows1) {
					
					List<WebElement> eachColumn1 = eachRow1.findElements(By.tagName("td"));
					String trainNames1 = eachColumn1.get(1).getText();
					System.out.println("After Clicking"+trainNames1);
						trainName2.add(trainNames1);
						}
				
				if(trainName2.equals(trainName))
				{System.out.println("Train names are in same sorted order");
				 		}
				
				//System.out.println(columns.size());
				
				//columns.get(1).click();
					}

		}
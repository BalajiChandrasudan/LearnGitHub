package methods;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import testNG.SeMethods;

public class LearnTable extends SeMethods{
	@Test
	public void run() throws InterruptedException {
		startApp("chrome", "https://erail.in/");
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);

		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);

		boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
		
		if(selected) {
			driver.findElementById("chkSelectDateOnly").click();			
		}

		WebElement table = locateElement("xpath", "//table[@class='DataTable TrainList']");
		findTableElements(table);
	
	
	
	}
	

}
package methods;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import testNG.SeMethods;

public class LearnAlerts extends SeMethods{
	@Test
	public void run() throws InterruptedException {
		startApp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame(1);
		WebElement alertPath = locateElement("xpath", "//button[@onclick='myFunction()']");
		
		click(alertPath);
		acceptAlert();
		getAlertText();
		//WebElement alertText = locateElement("xpath","//p[contains(text(),'Hello')]");
		//getAlertText(alertText);
		closeBrowser();

		//dismissAlert();

	}
	

}
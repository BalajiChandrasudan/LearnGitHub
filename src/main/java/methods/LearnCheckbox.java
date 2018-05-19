package methods;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import testNG.SeMethods;

public class LearnCheckbox extends SeMethods{
	@Test
	public void run() throws InterruptedException {
		startApp("chrome", "http://leafground.com/pages/checkbox.html");
		WebElement checkBox = locateElement("xpath", "//div[@class='example']/input[1]");
		
		verifySelected(checkBox);
		verifyDisplayed(checkBox);
	}

}
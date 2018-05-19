package methods;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import testNG.SeMethods;

public class LearnWindowHandle extends SeMethods{
	@Test
	public void run() throws InterruptedException {
		startApp("chrome", "https://www.irctc.co.in/eticketing/loginHome.jsf");
		WebElement contactUs = locateElement("link","Contact Us");
		click(contactUs);
		WebElement frameLocate = locateElement("tag","iframe");
		switchToFrame(frameLocate);
		switchToWindow(1);
	}

}
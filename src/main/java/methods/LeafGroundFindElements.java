package methods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundFindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		
		/*To find the no.of buttons, we have get the common locator as TagName 'button'
		storing the size by declaring a int data type*/
		List<WebElement> noofbuttons = driver.findElementsByTagName("button");
		int size = noofbuttons.size();
		System.out.println(size);
		
		//For printing all the buttons getText is the syntax for that
		for(WebElement btn: noofbuttons)
		{
		String bb=btn.getText();
		System.out.println(bb);
		}
		
		//for refernce we are using webelement again and clicking the last link 
		WebElement lastBtn = noofbuttons.get(size-1);
		
		lastBtn.click();
	}

}

package methods;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Object Instance creation
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Entering the URL
		driver.get("http://irctc.co.in/");
		Thread.sleep(5000);
		driver.findElementByLinkText("Contact Us").click();

		//To get the Number of Windows opened
		Set<String> allWindows = driver.getWindowHandles();
		//int wSize = allWindows.size(); or
		System.out.println(allWindows.size());

		//Create List to the list of Windows opened
		List <String> listOfWindows = new ArrayList<String>();
		listOfWindows.addAll(allWindows);

		//Assigning the varibles for each window
		String firstWindow = listOfWindows.get(0);
		String secWindow = listOfWindows.get(1);
		
		
		//To move the control second window
		
		driver.switchTo().window(secWindow);
		System.out.println(driver.getCurrentUrl());
		
		//Closes the Current Window- Window 2
		driver.close();
		
		//Moves the control to First Window

		driver.switchTo().window(firstWindow);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}


}

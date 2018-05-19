package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement no1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement no3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(no1).release(no3).perform();
		
		

 

	}}



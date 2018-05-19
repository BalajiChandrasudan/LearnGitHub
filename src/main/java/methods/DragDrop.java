package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement no1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement no3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement no5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		
		Actions builder = new Actions(driver);
		driver.getKeyboard().sendKeys(Keys.CONTROL);
		builder.click(no1).click(no3).click(no5).release().perform();
		
		//builder.clickAndHold(no1).release(no3).perform();
		

	}

}

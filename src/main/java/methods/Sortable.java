package methods;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Sortable {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://jqueryui.com/sortable/");
			WebElement frame = driver.findElementByClassName("demo-frame");
			driver.switchTo().frame(frame);
			WebElement no1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
			WebElement no2 = driver.findElementByXPath("//ul[@id='sortable']/li[2]");
			WebElement no3 = driver.findElementByXPath("//ul[@id='sortable']/li[3]");
			
			int y = no3.getLocation().getY();
						
			Actions builder = new Actions(driver);
			builder.dragAndDropBy(no1, 0, y).perform();
			
				
			//builder.clickAndHold(no1).release(no3).perform();
			

		}

	}

package methods;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ActAlertFrame {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
			
			driver.switchTo().frame("iframeResult");
			driver.findElementByXPath("//button[text()='Try it']").click();
			
			Alert myalert = driver.switchTo().alert();
			myalert.sendKeys("balaji test");
			myalert.accept();
			
			String text = driver.findElementById("demo").getText();
			System.out.println(text);
			
			
			if (text.contains("balaji test"))
				System.out.println("ok");
			
			
			//String alttext = driver.switchTo().alert().getText();
			
			
			
			
		}

	}


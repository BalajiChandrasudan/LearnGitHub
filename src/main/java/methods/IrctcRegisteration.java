/*Activity:
To sign-up irctc website and need to enter the details (no need to submit becasue Captcha cant be automated)
*/

package methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcRegisteration {

	public static void main(String[] args) throws InterruptedException {
		//To open chrome browser & maximixe it
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Lauching IRCTC website.
		driver.get("https://irctc.co.in");
		Thread.sleep(3000); //Giving 3secs for loadings
		
		//User Registeration
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("aegonuk2");
		
		/*driver.findElementByLinkText("Check Availability").click();
		driver.findElementById("userRegistrationForm:useravail").getText();
		if (getText()= 'User Id is Available..Please go ahead with the Registration Process...' )
		*/
		driver.findElementById("userRegistrationForm:password").sendKeys("Zpi220");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Zpi220");
		Thread.sleep(1000);
		
		//To select "What was the name of your first school?"
		WebElement SecurityQuestion = driver.findElementById("userRegistrationForm:securityQ");
		Select dropdown1 = new Select (SecurityQuestion);
		Thread.sleep(3000);
		dropdown1.selectByValue("1");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Sasuki");
		
		//Selecting English as langugage
		WebElement PreferredLanguage = driver.findElementById("userRegistrationForm:prelan");
		Select dropdown2 = new Select (PreferredLanguage);
		dropdown2.selectByValue("en");
		
		//Declaring personal details Name, DOB, Gender, Martial status etc.,
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Bala");
		
		driver.findElementById("userRegistrationForm:gender:0").click();
		
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		//Date 
		WebElement DoBDate = driver.findElementById("userRegistrationForm:dobDay");
		Select dropdown3= new Select (DoBDate);
		dropdown3.selectByValue("28");
		
		//Month
		WebElement DoBMonth = driver.findElementById("userRegistrationForm:dobMonth");
		Select dropdown4= new Select (DoBMonth);
		dropdown4.selectByValue("10");
		
		//Year
		WebElement DoBYear = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dropdown5= new Select (DoBYear);
		dropdown5.selectByValue("1990");
		
		//Declaring  occupation as Professional
		WebElement Occupation = driver.findElementById("userRegistrationForm:occupation");
		Select dropdown6= new Select (Occupation);
		dropdown6.selectByValue("3");
		
		//Declaring Country & Nationality as India
		WebElement Country = driver.findElementById("userRegistrationForm:countries");
		Select dropdown7= new Select (Country);
		dropdown7.selectByValue("94");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("baji1015@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("7358845655");
		
		WebElement Nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select dropdown8= new Select (Nationality);
		dropdown8.selectByValue("94");
		
		//Declaring Address
		driver.findElementById("userRegistrationForm:address").sendKeys("FF1");
		driver.findElementById("userRegistrationForm:street").sendKeys("Maruthi Bhavanam");
		driver.findElementById("userRegistrationForm:area").sendKeys("Nanganallur");
		
		//State will be loaded automatically based on Pincode so giving tab such that cursor will be placed over it
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600061",Keys.TAB);
					
		Thread.sleep(3000);
		WebElement City = driver.findElementById("userRegistrationForm:cityName");
		Select dropdown9= new Select (City);
		dropdown9.selectByValue("Kanchipuram");
		
		//Declaring Postal address & Mobile number for communication
		Thread.sleep(3000);
		WebElement PostOffice = driver.findElementById("userRegistrationForm:postofficeName");
		Select dropdown10= new Select (PostOffice);
		dropdown10.selectByValue("Nanganallur S.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("7358845655");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		}
}
	
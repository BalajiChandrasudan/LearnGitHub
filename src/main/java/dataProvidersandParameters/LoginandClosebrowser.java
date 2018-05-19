package dataProvidersandParameters;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class LoginandClosebrowser extends SeMethods {
	@Parameters({"browser","url","username","password"})
	@BeforeMethod()
		public void logIn(String bName,String urlLink,String uName,String pWrd) throws InterruptedException
	
	{
		System.out.println("BeforeMethod");
		startApp(bName, urlLink);
		WebElement userName = locateElement("id","username");
		type(userName, uName);
		WebElement passWord = locateElement("id", "password");
		type(passWord, pWrd);
		WebElement login = locateElement("class", "decorativeSubmit");
		clickWithNoSnap(login);	
	
}
	@AfterMethod()
	public void closeApp() {
		System.out.println("AfterMethod");
		
		closeBrowser();
}


}
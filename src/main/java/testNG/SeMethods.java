package testNG;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver;	
	
	int i = 1;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();			
		} else {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser is Launched");

	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id":
				return	driver.findElementById(locValue);		
			case "name":
				return	driver.findElementByName(locValue);			
			case "class":
				return	driver.findElementByClassName(locValue);			
			case "link":
				return	driver.findElementByLinkText(locValue);			
			case "tag":
				return	driver.findElementByTagName(locValue);			
			case "xpath":
				return	driver.findElementByXPath(locValue);
			default:
				break;
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The element is not found");
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The Value is Entered");
			takeSnap();
		} catch (NoSuchElementException e) {
			
			//e.printStackTrace();
			System.err.println("The element is not found");
			
		}
	finally {
		takeSnap();
	}
	}
	

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element Is Clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The element is not found");
		}
		//takeSnap();
	}

	public void clickWithNoSnap(WebElement ele) {
		
		ele.click();
		System.out.println("The Element Is now Clicked");

	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return ele.getText();
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select obj=new Select(ele) ;
			obj.selectByVisibleText(value);
			takeSnap();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element is not found for DP");
			//e.printStackTrace();
		}
		

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select obj=new Select(ele) ;
		obj.selectByIndex(index);
		takeSnap();

	}

	public boolean verifyTitle(String expectedTitle,WebElement ele) {
		String sb=ele.getText();
		if(expectedTitle.equalsIgnoreCase(sb))
			{
					System.out.println("Title matches");
					return true;
			}
			
			else
			{
				System.out.println(sb);
				System.out.println("Title does not matches");
				return false;
			}
				
		
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String sb=ele.getText();
		if(sb.equalsIgnoreCase(expectedText))
			{
					System.out.println("Title matches");
			
			}
			
			else
			{
				System.out.println(sb);
				System.out.println("Title does not matches");
				 
			}
		

	}

	public void verifyPartialText(WebElement ele,String expectedText) {
		String sb=ele.getText();
		if(expectedText.contains(sb))
			{
					System.out.println("Title matches");
			
			}
			
			else
			{
				System.out.println(sb);
				System.out.println("Title does not matches");
				
			}
		

	
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		String sb=ele.getAttribute(attribute);
		System.out.println(sb);
		if(sb.equalsIgnoreCase(value))
		{
			System.out.println("Attribute matches exactly");
		}
		else
		{
			System.out.println("Attribute does not match exactly");
		}
		
		

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String sb=ele.getAttribute(attribute);
		System.out.println(sb);
		if(sb.contains(value))
		{
			System.out.println("Attribute matches partially");
		}
		else
		{
			System.out.println("Attribute doe not match partially");
		}
		

	}

	public void verifySelected(WebElement ele) {
		boolean selected=ele.isSelected();
		if(selected)
		{
			System.out.println("Check box selected");
		}
		else
		{
			System.out.println("Checkbox not selected");
		}
		

	}

	public void verifyDisplayed(WebElement ele) {
		if(ele.isDisplayed())
		{
			System.out.println("Element displayed");
		}
		else
		{
			System.out.println("Element not displayed");
		}
				}

	public void switchToWindow(int index) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listOfWindows=new ArrayList<String>(); 
		
		listOfWindows.addAll(allWindows);
		String windowsOpen = listOfWindows.get(index);
		driver.switchTo().window(windowsOpen);
		System.out.println(driver.getCurrentUrl());
		

	}

	public void switchToFrame(WebElement ele) {
		WebDriver frame = driver.switchTo().frame(ele);
		System.out.println("switched to frame"+frame);
		

	}

	public void acceptAlert() {
		
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Alert");
		alert1.accept();
		

	}

	public void dismissAlert() {
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();

	}

	public String getAlertText() {
		Alert alertText=driver.switchTo().alert();
		
		return alertText.getText();
		
		
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
driver.quit();
	}

	public void findTableElements(WebElement ele)
	{
		List<WebElement> allRows = ele.findElements(By.tagName("tr"));
		int size = allRows.size();
		WebElement firstRow = allRows.get(3);
		List<WebElement> cols = firstRow.findElements(By.tagName("td"));
		int colsSize = cols.size();
		System.out.println("Rows:"+size);
		System.out.println("Columns:"+colsSize);
List<String> tableData=new ArrayList<String>();
		
		//Go to the each row
		for(int i=0;i<size;i++)
		{
		for (WebElement eachRow : allRows) {
			 List<WebElement> eachColumn = eachRow.findElements(By.tagName("td"));
			 String columnData = eachColumn.get(i).getText();
			 //System.out.println(trainNames);
			  tableData.add(columnData);
			 
			 
		}
		
		System.out.println(tableData);
		}
		
			}
	public static By tagName(final String name) {
	    if (name == null)
	      throw new IllegalArgumentException(
	          "Cannot find elements when the tag name is null.");

	    return new ByTagName(name);
	  }

	
	
	
}
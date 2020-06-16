package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_hover {

	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afsanakeya/Documents/Automation/selenium/Driver/chromedriver");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		User_Search_for("//*[@class='gLFyf gsfi']", "Amazon");
		driver.findElement(By.xpath("(//*[@class='gNO89b'])[1]")).sendKeys(Keys.ENTER);
		//User_Clicks_on("(//*[@class='gNO89b'])[1]");
		User_Clicks_on("(//*[@class='LC20lb DKV0Md'])[1]");
		Thread.sleep(3003);
		// Mouse hover and click on Find a Gift
		mouseOver("//*[@id='nav-link-accountList']","(//*[contains(text(),'Find a Gift')])[1]");
		Thread.sleep(3000);
		driver.quit();
		
	}		
		public static void User_Clicks_on(String Xpath) {
			//click method
			driver.findElement(By.xpath(Xpath)).click();
			
		}
	public static void User_Search_for(String Xpath,String KeyValue) {
			//send key method 
			driver.findElement(By.xpath(Xpath)).sendKeys(KeyValue);
			
		}
		
	public static  void mouseOver(String MouseHoverOn,String ClickonElement) throws Throwable {
       
        new Actions(driver).moveToElement(driver.findElement(By.xpath(MouseHoverOn))).perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath(ClickonElement)).click();
    }
	// @SuppressWarnings("deprecation")
	public void waitUntilVisibilityOfElementLocatedBy(int timeoutSec, By byElement) {
	        new WebDriverWait(driver, timeoutSec).until(ExpectedConditions.visibilityOfElementLocated(byElement));
	    }
	 
	 public void User_Clicks_on_With_wait(By byElement) {
	        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(byElement));
	        driver.findElement(byElement).click();
	    }

	
}

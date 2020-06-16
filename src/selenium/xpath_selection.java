package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_selection {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/afsanakeya/Documents/Automation/selenium/Driver/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");	
//linktext
//driver.findElement(By.linkText("Forgot account?")).click();
//partial linktext
driver.findElement(By.partialLinkText("Forgot")).click();

//CSS selector
driver.findElement(By.cssSelector("input[type=\"email\"]")).getText();


}

}

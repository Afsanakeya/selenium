package selenium;


	import java.util.concurrent.TimeUnit;

	import javax.xml.xpath.XPath;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class practice_1 {
	static WebDriver driver;
		public static void main(String[] args) throws Throwable {
			
		System.setProperty("webdriver.chrome.driver","/Users/afsanakeya/Documents/Automation/selenium/Driver/chromedriver");
	    String facebook="https://www.facebook.com/";
		//WebDriver 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(facebook);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   String title=driver.getTitle();
	   System.out.println(title);
		
		
	    if(driver.getTitle().equalsIgnoreCase(title)){
		System.out.println("the browser in verified");
		}
		else {
			System.out.println("the browser is not verified");
		}
		
		driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equalsIgnoreCase(facebook)){
			System.out.println("the url is verrified and passed");
		}
		
		else {
			System.out.println("the url in not verrified");
		}
		
		try {
			User_Pass_the_value_into_webedit("//input[@type='email']","afsanakeya@email.com");
					
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("afsanakeya@email.com");
		
		System.out.println("Email address entered");
		}
		catch (Exception email) {
			
			System.out.println("Element couldn't found and Email address couldn't entered");
			
		}
		Thread.sleep(3000);
		try {
			User_Pass_the_value_into_webedit("(//input[@type='password'])[1]","Password");
			
		//driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Password");
		System.out.println("password field found and enter password");
		}
		catch(Exception password) {
			
			System.out.println("password filed couldn't found");
		}
		Thread.sleep(3000);
		
		User_click_on("//*[@id='loginbutton']");
		//driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(3000);
		
		
	    
		
		
		
		
		driver.quit();
		
		}
		
		
		public static void User_click_on(String Xpath) {
			driver.findElement(By.xpath(Xpath)).click();
		}
		
		public static void User_Pass_the_value_into_webedit(String Xpath, String Value) {
			
			driver.findElement(By.xpath(Xpath)).sendKeys(Value);
		}

	}
		
		

		

		
		





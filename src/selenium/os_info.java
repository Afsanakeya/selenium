package selenium;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class os_info {
		
		
	static WebDriver driver;
	static final String OSinformation = System.getProperty("os.name");
	static final String Win ="WIN";
	static final String Mac ="MAC";
		
		//This method with identify the OS  and cut the OS env to 3char 
		public static final String OSinfo() {
			String OSinfo=System.getProperty("os.name");
			String info = "";
			if (OSinfo.length()>3) {
				info=OSinfo.substring(0,3);
			   }
			return info;
		}

		
		public static void main(String[] args) {	
		System.out.println(OSinformation);
			
			if(OSinfo().equalsIgnoreCase(Mac)||OSinfo().equalsIgnoreCase(Win)) {
				if(OSinfo().equalsIgnoreCase(Mac)) {
					
	System.out.println("Your machine is running on"+OSinformation+"\n"+"Chrome Driver is launching for"+OSinformation);
	//System.setProperty("webdriver.chrome.driver","/Users/afsanakeya/eclipse-workspace/Classwork/jar/chromedriver");
	System.setProperty("webdriver.chrome.driver","/Users/afsanakeya/Documents/Automation/selenium/Driver/chromedriver");
		 driver=new ChromeDriver();
		
		  }
				
				else if (OSinfo().equalsIgnoreCase(Win)) {
					
					System.out.println("Your machine is running on"+OSinformation+"\n"+"Chrome Driver is launching for"+OSinformation);
					//System.setProperty("webdriver.chrome.driver","/Users/afsanakeya/eclipse-workspace/Classwork/jar/chromedriver");
					System.setProperty("webdriver.chrome.driver","./Win_Driver/chromedriver.exe");
						 driver=new ChromeDriver();
					
					
				}
		 }	
		}

	}



package testNG;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	
	public class parallelTest {
		static WebDriver driver;
		
		@BeforeTest
		public static void openbrowser() {
			driver=new ChromeDriver();
		}
		@Test(priority=1)
		public static void orangehrm() 
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}
		@Test(priority=2)
		public static void facebook() 
		{
			driver.get("https://www.facebook.com/");
			
		}
		
		@AfterTest
		public static void closebrowser() {
			driver.quit();
		}
		
		

	}


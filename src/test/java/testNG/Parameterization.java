package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	WebDriver driver;
	
 @Parameters("browser")
 @Test
 public void check(String BrowserName) {
	 if(BrowserName.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver();
	 }
	 else if(BrowserName.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver(); 
	 }
	 else if(BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver(); 
		 }
	 driver.get("https://www.google.com");
	 
 }
}

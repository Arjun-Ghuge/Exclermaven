package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameters_testng {
static WebDriver driver;
	
	@Test
	@Parameters("Browser")
	 public void orangehrm(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("chrome");
			
		}
		if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("edge");

		}


}}

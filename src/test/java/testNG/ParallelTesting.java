package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	@Test 
	public void chrome() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	@Test 
	public void edge() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
	}
	@Test 
	public void firefox() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}

}

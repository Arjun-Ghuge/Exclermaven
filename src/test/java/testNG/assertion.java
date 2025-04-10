package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {
@Test(dataProvider="logindata")
	
	public void logintest(String username,String password) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username1=driver.findElement(By.name("username"));
		username1.sendKeys(username);
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys(password);
		WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		WebElement dash=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		Assert.assertTrue(dash.isDisplayed(),"login passed");
		
//ASSERTIONS:
		
		//validate the testcases---->
		//Hard,soft
		//Hard assertion will stop the program execution at the failed
		//test case
		//soft assertion--->high light execption or error
		//next test cases will be continued
		//SoftAssert assertobj=new SoftAssert();
		//assertobj.
		
		
		
		
		
		
		
		
		
	}


}

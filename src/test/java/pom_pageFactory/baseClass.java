package pom_pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class baseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.phptravels.net/login");
PageFactory.initElements(driver, objClass.class);
objClass.username.sendKeys("user@phptravels.com");
objClass.password.sendKeys("demouser");
objClass.loginButton.click();
objClass.myprofile.click();
objClass.lastName.sendKeys("demo");
objClass.country.click();

}
}

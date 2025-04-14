package cucumberframwork;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginsenario {

	static WebDriver driver;
	static pom_cucumbers pom_cucumber;
		@Given("Open the browser")
		public void open_the_browser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			pom_cucumber =new pom_cucumbers(driver);
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}


	@Then("Enter Username {string}")
	public void enter_username(String uname) {
		pom_cucumber.username.sendKeys(uname);
	}

	@Then("Enter password {string}")
	public void enter_password(String pwd) {
		pom_cucumber.password.sendKeys(pwd);
	    
	}

		@And("Click on login button")
		public void click_on_login_button() {
			
			pom_cucumber.loginBtn.click();
			Assert.assertTrue(pom_cucumber.dashboard.isDisplayed(), "login sucess");
			
		}

		@Then("Close the browser")
		public void close_the_browser() {
		   driver.quit();
		}
	}
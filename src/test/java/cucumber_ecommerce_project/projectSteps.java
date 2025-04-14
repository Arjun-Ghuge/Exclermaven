package cucumber_ecommerce_project;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
public class projectSteps {

	static WebDriver driver;
	static registration registration;
		@Given("Open the browser")
		public void open_the_browser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			registration =new registration(driver);
			
			driver.get("https://magento.softwaretestingboard.com/");
		}

		@Then("Click on create account")
	    public void create_account() {
	    	registration.create.click();;
	    }
	    @Then("Enter Username")
	    public void enter_username() {
	    	registration.firstname.sendKeys("demo");
	    }

	    @Then("Enter Lastname")
	    public void enter_lastname() {
	    	registration.lastname.sendKeys("user");

	    }

	    @Then("Enter Email")
	    public void enter_email() {
	    	registration.email.sendKeys("abcd456@gmail.com");

	    }

	    @Then("Enter Password")
	    public void enter_password() {
	    	registration.password.sendKeys("abcd@123");

	    }

	    @Then("Enter Confirm Password")
	    public void enter_confirm_password() {
	    	registration.concorm_password.sendKeys("abcd@123");

	    }

	    @And("Click on Create and account button")
	    public void click_create_account_button() {
	    	registration.submitbtn.click();
	    }
	}




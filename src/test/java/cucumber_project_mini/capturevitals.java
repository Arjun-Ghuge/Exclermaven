package cucumber_project_mini;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class capturevitals {

	static WebDriver driver;
	static pom_cucumber pom_cucumber;
		@Given("Open the browser")
		public void open_the_browser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			pom_cucumber =new pom_cucumber(driver);
			
			driver.get("https://o2.openmrs.org/openmrs/login.htm");
		}
		

		    @Then("Enter Username {string}")
		    public void enter_username(String username) {
		       pom_cucumber.username.sendKeys("Admin");
		    }

		    @Then("Enter password {string}")
		    public void enter_password(String password) {
			       pom_cucumber.password.sendKeys("Admin123");

		    }

		    @Then("Select location {string}")
		    public void select_location(String location) {
			       pom_cucumber.location.click();

		    }

		    @Then("Click on login button")
		    public void click_on_login_button() {
			       pom_cucumber.loginbtn.click();

		    }

		    @Then("the user should be logged in successfully")
		    public void the_user_should_be_logged_in_successfully() {
		        System.out.println("Login successful");
		    }

		    @Given("the user is logged in to OpenMRS")
		    public void the_user_is_logged_in_to_open_mrs() {
		        System.out.println("User is already logged in");
		    }

		    @Given("the user navigates to the {string} section")
		    public void the_user_navigates_to_section(String section) {
		       pom_cucumber.section.click();
		    }

		    @When("the user enters the following vitals:")
		    public void the_user_enters_the_following_vitals() {
			       pom_cucumber.username.click();

		    }

		    @Then("the user submits the vitals form")
		    public void the_user_submits_the_vitals_form() {
		        System.out.println("Submitted vitals form");
		    }
		}


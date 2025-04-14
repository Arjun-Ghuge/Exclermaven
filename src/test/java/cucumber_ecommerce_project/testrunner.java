package cucumber_ecommerce_project;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features= {"C:\\Users\\DjS\\eclipse-workspace\\MyMevenProject\\src\\test\\resources\\Features\\ecommerce.feature"},
	glue= {"cucumber_ecommerce_project"},plugin= {"pretty","html:target/htmlreport.html"})

	public class testrunner extends AbstractTestNGCucumberTests {

	}


package cucumber_project_mini;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C:\\Users\\DjS\\eclipse-workspace\\MyMevenProject\\src\\test\\resources\\Features\\openmrs.feature"},
glue= {"cucumber_project_mini"},plugin= {"pretty","html:target/htmlreport.html"})


public class Testrunner extends AbstractTestNGCucumberTests {

}

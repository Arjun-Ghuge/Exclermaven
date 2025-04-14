package cucumberframwork;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/features/login.feature"},
glue= {"cucumberframwork"},plugin= {"pretty","html:target/htmlreport.html"})

public class Testrunner extends AbstractTestNGCucumberTests {
}

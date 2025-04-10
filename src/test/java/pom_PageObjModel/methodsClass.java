package pom_PageObjModel;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.phptravels.net/login");

elementsClass.userName(driver).sendKeys("user@phptravels.com");
elementsClass.password(driver).sendKeys("demouser");
elementsClass.loginButton(driver).click();

	}

}

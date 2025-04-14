package cucumber_project_mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_cucumber {

	public pom_cucumber(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(name = "username")
	   public WebElement username;
	   @FindBy(name = "password")
	   public WebElement password;
	   @FindBy(xpath = "/html/body/div/div[3]/div/div/div/form/fieldset/ul/li[1]")
	   public WebElement location;
	   @FindBy(id = "loginButton")
	   public WebElement loginbtn;
	   
	   @FindBy(xpath = "//*[@id=\"referenceapplication-vitals-referenceapplication-vitals-extension\"]")
	   public WebElement section;
	
	   @FindBy(id = "//*[@id=\"patient-search-results-table\"]/tbody/tr[15]")
	   public WebElement userselect;
	   
	   
}

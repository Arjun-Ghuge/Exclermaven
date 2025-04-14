package cucumber_ecommerce_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registration {
	
	public registration(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	   public WebElement create;
	@FindBy(name = "firstname")
	   public WebElement firstname;
	@FindBy(name = "lastname")
	   public WebElement lastname;
	@FindBy(name = "email")
	   public WebElement email;
	@FindBy(name = "password")
	   public WebElement password;
	@FindBy(name = "password_confirmation")
	   public WebElement concorm_password;
	@FindBy(xpath= "//*[@id=\"form-validate\"]/div/div[1]/button\r\n")
	   public WebElement submitbtn;

}
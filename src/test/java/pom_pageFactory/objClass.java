package pom_pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class objClass {

	@FindBy(name="email")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(id="submitBTN")
	public static WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a")
	public static WebElement myprofile;
	
	@FindBy(name="last_name")
	public static WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"profile\"]/div/div[4]/div[1]")
	public static WebElement country;



}

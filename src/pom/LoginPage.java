package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(xpath="//input[@id='login-email']")
	private WebElement emailtb;
	@FindBy(xpath="//input[@id='login-password']")
	private WebElement passwrdtb;
	@FindBy(xpath="//input[@id='login-submit']")
	private WebElement loginbtn;
	
//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Execution
	public void email(String us)
	{
		emailtb.sendKeys(us);
	}
	public void passwrd(String pass)
	{
		passwrdtb.sendKeys(pass);
	}
	public void submitbutton( )
	{
		loginbtn.click();
	}
	

}



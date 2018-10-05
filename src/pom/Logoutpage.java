package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	@FindBy(xpath="//img[contains(@alt,'Aish Kulkarni')]")
	private WebElement prf;
	@FindBy(xpath="//a[@data-control-name='nav.settings_signout']")
	private WebElement lgt;
	
	

	public Logoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void profile()
	{
		prf.click();
	}
	public void logt()
	{
		lgt.click();
	}
	
	

}


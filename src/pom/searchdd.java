package pom;
import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class searchdd {
	@FindBy(id="jobs-tab-icon")
	public WebElement jbclk;
	@FindBy(xpath="(//input[@spellcheck='false'])[1]")
	private WebElement srch;
	//@FindBy(xpath"//section[@role='main']")
	//private WebElement box;
	
	


	public searchdd(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void job()
	{
	jbclk.click();

	}
	
	
	
	
	public void search()
	{
	srch.click();

	}
	
	public void sch(String s)
	{
	srch.sendKeys(s);
	}
}

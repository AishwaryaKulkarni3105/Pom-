package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class srch {
	@FindBy(xpath="//input[@role='combobox']")
	private WebElement sch;
	@FindBy(xpath="//h4[.='Aish, get started on LinkedIn with 3 easy steps:']")
	private WebElement pfl;
	@FindBy(xpath="//button[contains(@class,'message-anywhere-button search-result__actions--primary button-secondary-medium m5')]")
	private WebElement mes;
	@FindBy(xpath="//div[@role='textbox']")
	private WebElement ent;
	@FindBy(xpath="(//span[@class='name actor-name'])[1]")
	private WebElement clk;

	public srch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchtb()
	{
		sch.click();
		
	}
	
	public void people(String tp)
	{
		sch.sendKeys(tp);
		
	}
	public void profile()
	{
		pfl.click();
		
	}
	public void message()
	{
		mes.click();
		
	}
	public void message(String hi)
	{
		mes.sendKeys(hi);
		
	}
	public void enter(String e)
	{
		mes.sendKeys(e);
		
	}
	public void clickpf()
	{
		clk.click();
		
	}
	
}

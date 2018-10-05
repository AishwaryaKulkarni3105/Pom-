package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class write {
	@FindBy(xpath="//a[contains(@class,'sharing')]")
	private WebElement arttb;
	@FindBy(xpath="//textarea[@class='ember-text-area post-headline ember-view']")
	private WebElement headtb;
	@FindBy(xpath="//textarea[@class='ember-text-area post-headline ember-view']")
	private WebElement headtbx;
	@FindBy(xpath="//button[contains(@ class,'zen')]")
	private WebElement publsh;
	@FindBy(xpath="//body[@class='boot-complete']")
	private WebElement wrtbx ;

public write(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void article()
{
	arttb.click();
}
public void heading()
{
	headtb.click();
}
	public void headingtext(String hd)
	{
	
	headtbx.sendKeys(hd);
	}
	public void wrt()
	{
	
	wrtbx.click();
	}
	public void wrt(String wt)
	{
	
	wrtbx.sendKeys(wt);
	}
	public void publish()
	{
		publsh.click();
	}
}
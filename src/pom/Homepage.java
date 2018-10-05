package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath="//span[@id='jobs-tab-icon']")
	private WebElement jobs;
	
	
	@FindBy(xpath="//a[@class='sharing-subaction-bar__publish-post-link button-secondary-small-muted ember-view']")
	private WebElement writeart;
	
	
	@FindBy(xpath="//button[@class='Sans-17px-black-70%']")
	private WebElement article;
	
	@FindBy(xpath="//span[@id='messaging-tab-icon']")
	private WebElement messaging;
	
	@FindBy(id="search_query_top")
	private WebElement searh;
	
	@FindBy(name="submit_search")
	private WebElement searhbtn;
	
	
	@FindBy(xpath="//img[@class='nav-item__profile-member-photo nav-item__icon']")
	private WebElement logout;
	
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public void searchtb(String name)
	{
		searh.sendKeys(name);
	}
	
	public void jobm()
	{
		jobs.click();
	}
	
	public void clickonmsg()
	{
		messaging.click();
	}
	
	public void searchbtn()
	{
		searhbtn.click();
	}
	public void clickonwriteart()
	{
		writeart.click();
	}
	public void logout()
	{
		logout.click();
	}
	public void article()
	{
		article.click();
	}
}







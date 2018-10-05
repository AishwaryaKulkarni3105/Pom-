package pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class mynetwork {
		@FindBy(xpath="//a[contains(@class,'invitations')]")
		private WebElement mng;
		@FindBy(id="mynetwork-tab-icon")
		private WebElement ntwk;
		@FindBy(xpath="//a[contains(@data-control-name,'received')]")
		private WebElement rcvd;
		@FindBy(xpath="//a[contains(@data-control-name,'sent')]")
		private WebElement snt;
		
	
	public mynetwork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void network()
	{
		ntwk.click();
		
	}
	public void manage()
	{
		mng.click();
		
	}
	public void received()
	{
		rcvd.click();

	}
	public void sent()
	{
		snt.click();

	}
//
//
//	public void heading(String hd)
//	{
//
//		headtb.sendKeys(hd);
//	}

		

	}


package pom;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class jobs 
	{
		
		@FindBy(xpath="//li-icon[@type='ellipsis-horizontal-icon']")
		private WebElement jobcontent;
		
		@FindBy(xpath="(//span[@aria-hidden='true'])[2]")
		private WebElement save;
		
		@FindBy(linkText="https://media.licdn.com/dms/image/C560BAQEtjiG77AYtuA/company-logo_100_100/0?e=1546473600&v=beta&t=tnBzd170f8Rot3Z_6aYedXPMzK5ldN1WpiD4yoX5ceE")
		private WebElement icon;
		
		@FindBy(xpath="(//div[contains(@class,'job-card__image-and-sponsored-container')])[1]")
		private WebElement pic;
		
		@FindBy(xpath="//span[@class='Sans-17px-black-55%']")
		private WebElement savejob;
		
		@FindBy(xpath="(//span[@class='svg-icon-wrap'])[4]")
		private WebElement unsave;
		
		@FindBy(xpath="//span[@class='jobs-nav-count__number jobs-nav-count__number--inline Sans-17px-black-100%-semibold']")
		private WebElement savedjob;
		
		public jobs(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		
		
		public void icon()
		{
		icon.click();
		}
		
		public void clickonjob()
		{
		jobcontent.click();
		}
		public void save()
		{
		save.click();
		}
		public void pic()
		{
			pic.click();
		}
		
		public void savejob()
		{
		savejob.click();
		}
		
		
		public void savedjob()
		{
		savedjob.click();
		}
		
		
		
		
		
		public void unsave()
		{
		unsave.click();
		}
	}

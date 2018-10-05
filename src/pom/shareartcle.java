
	package pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class shareartcle {
		@FindBy(xpath="//button[.='Share an article, photo, video or idea']")
		private WebElement shr;
		@FindBy(xpath="//p[@class='mentions-texteditor__content']")
		private WebElement edit;
		
		@FindBy(xpath="//label[contains(@for,'profile-photo-upload-input-mini')]")
		private WebElement pic;
		@FindBy(xpath="//div[@role='textbox']")
		private WebElement write;
		@FindBy(xpath="//button[@data-control-name='share.post']")
		private WebElement post;

		

		public shareartcle(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
			public void addpic()
			{
			pic.click();	
			}
			public void shrclk()
			{
			shr.click();	
			}
		
		public void writearticle (String wt)
		{
			write.sendKeys(wt);
		}
		public void edtart (String wt)
		{
			edit.sendKeys(wt);
		}
		public void postarticle()
		{
		post.click();	
		}
	
		

	



}

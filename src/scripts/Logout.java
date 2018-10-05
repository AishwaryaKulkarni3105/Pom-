package scripts;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import generics.Auto_constant;
	import generics.Excel;
	import pom.LoginPage;
import pom.Logoutpage;

	public class Logout implements Auto_constant {
	static{
		System.setProperty(key,value);
	}
		public static void main(String[] args) throws InterruptedException
		{
			String us=Excel.abc(Excelpath, "Sheet1", 0, 0);
			String pass=Excel.abc(Excelpath, "Sheet1", 1, 0);
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.linkedin.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			LoginPage l=new LoginPage(driver);
			l.email(us);
		    l.passwrd(pass);
		    l.submitbutton();
		    Thread.sleep(5000);
		    Logoutpage o=new Logoutpage(driver);
			o.profile();
			Thread.sleep(5000);
		    o.logt();
		    
		}
	}

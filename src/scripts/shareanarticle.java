package scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import generics.Auto_constant;
import generics.Excel;
import pom.LoginPage;

import pom.shareartcle;
   public class shareanarticle implements Auto_constant {
		static{
			System.setProperty(key,value);
		}
			public static void main(String[] args) throws InterruptedException 
			{
				String us=Excel.abc(Excelpath, "Sheet1", 0, 0);
				String pass=Excel.abc(Excelpath, "Sheet1", 1, 0);
				String wt=Excel.abc(Excelpath, "Sheet1", 0, 1);
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.linkedin.com/");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				LoginPage l=new LoginPage(driver);
				l.email(us);
			    l.passwrd(pass);
			    l.submitbutton();
			    Thread.sleep(5000);
			    shareartcle s=new shareartcle(driver);
			    s.shrclk();
			    s.edtart(wt);
			    
			    s.postarticle();
			}
	}
	
		
		
	
		


package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import generics.Auto_constant;
import generics.Excel;
import pom.Homepage;
import pom.jobs;
import pom.LoginPage;
import pom.Logoutpage;


public class savejobs implements Auto_constant
{
	static
	{
		System.setProperty(key,value);
	}

	public static void main(String[] args) 
	{
		String us = Excel.abc(Excelpath,"Sheet1",0, 0);
		String pass=Excel.abc(Excelpath,"Sheet1",1, 0);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Linkedin.com");
		LoginPage l=new LoginPage(driver);
		l.email(us);
		l.passwrd(pass);
		l.submitbutton();
		
		Homepage h=new Homepage(driver);
		h.jobm();
		
		
		jobs j=new jobs( driver);
	
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		j.pic();
		
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		j.save();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		j.savedjob();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		j.unsave();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Logoutpage o=new Logoutpage(driver);
		o.profile();
	    o.logt();
	    
	}
}
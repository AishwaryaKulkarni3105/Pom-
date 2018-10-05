package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import generics.Auto_constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import generics.Excel;
import pom.LoginPage;
import pom.Logoutpage;
import pom.srch;

public class search implements Auto_constant{
	static{
	System.setProperty(key,value);
}

		public static void main (String[] args) throws InterruptedException, AWTException
		{
			String us=Excel.abc(Excelpath, "Sheet1", 0, 0);
			String pass=Excel.abc(Excelpath, "Sheet1", 1, 0);
			String tp=Excel.abc(Excelpath, "Sheet1", 0, 1);
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.linkedin.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			LoginPage l=new LoginPage(driver);
			l.email(us);
		    l.passwrd(pass);
		    l.submitbutton();
		    Thread.sleep(8000);
		    srch s=new srch(driver);
		    s.searchtb();
		    s.people(tp);
		    Robot r=new Robot();
		    r.keyPress(KeyEvent.VK_ENTER);
		  s.clickpf();
		  
		  Logoutpage o=new Logoutpage(driver);
			o.profile();
			Thread.sleep(3000);
		    o.logt();
}
}
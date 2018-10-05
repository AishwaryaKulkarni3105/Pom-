package scripts;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Auto_constant;
import generics.Excel;
import pom.LoginPage;
import pom.write;

public class Writeanarticle implements Auto_constant {
static{
	System.setProperty(key,value);
}
	public static void main(String[] args) throws InterruptedException
	{
		String us=Excel.abc(Excelpath, "Sheet1", 0, 0);
		String pass=Excel.abc(Excelpath, "Sheet1", 1, 0);
		String hd=Excel.abc(Excelpath, "Sheet1", 2, 0);
		String wt=Excel.abc(Excelpath, "Sheet1", 2, 1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage l=new LoginPage(driver);
		l.email(us);
	    l.passwrd(pass);
	    l.submitbutton();
	    Thread.sleep(8000);
	    
	    write w=new write(driver);
	    w.article();
	    ArrayList<String> a=new  ArrayList<String>(driver.getWindowHandles()); 
	    driver.switchTo().window(a.get(1));
	    
        w.heading();
        w.headingtext(hd);
        w.wrt();
        w.wrt(wt);
        w.publish();
        
		
		
	
		
		
	}
}




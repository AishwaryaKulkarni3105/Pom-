package scripts;

	

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import generics.Auto_constant;
import generics.Excel;
import pom.LoginPage;
import pom.srch;

	public class msg implements Auto_constant {
		static{
			System.setProperty(key,value);
		}
	
	public static void main(String[] args) throws AWTException  
		{
			String us=Excel.abc(Excelpath, "Sheet1", 0, 0);
			String pass=Excel.abc(Excelpath, "Sheet1", 1, 0);
			String tp=Excel.abc(Excelpath, "Sheet1", 0, 1);
			String hi=Excel.abc(Excelpath, "Sheet1", 1, 1);
			String e=Excel.abc(Excelpath, "Sheet1", 2, 0);
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.linkedin.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			LoginPage l=new LoginPage(driver);
			l.email(us);
		    l.passwrd(pass);
		    l.submitbutton();
		    driver.manage().window().maximize();
		    //Dimension d=new Dimension(300,300);
		   // driver.manage().window().setSize(d);
		    srch s=new srch(driver);
		    s.searchtb();
		    s.people(tp);
		    Robot r=new Robot();
		    r.keyPress(KeyEvent.VK_ENTER);
		    s.message();
		    s.message(hi);
		    s.enter(e);
//		    driver.get("file");
//		    driver.findElement(By.id("upload")).sendKeys("C:\Users\Public\Pictures\Sample Pictures\Desert.jpg");
	}
	}


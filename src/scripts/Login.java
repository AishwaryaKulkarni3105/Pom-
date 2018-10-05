package scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Excel;
import generics.Auto_constant;
import pom.LoginPage;

public class Login implements Auto_constant {
static{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
}
	public static void main(String[] args) 
	{
	String us=Excel.abc(Excelpath, "Sheet1", 0, 0);
	String pass=Excel.abc(Excelpath, "Sheet1", 1, 0);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		LoginPage l=new LoginPage(driver);
		l.email(us);
	    l.passwrd(pass);
	    l.submitbutton();
}
}
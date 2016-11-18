package roteiros;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Import page


import PageObjects.HomePage;
import PageObjects.LoginPage;

public class Qatest {
	
	private static WebDriver driver = null;
	
	@Test
	
	public void QAtest(){
		
		driver = new FirefoxDriver();
		 
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	     driver.get("http://newtours.demoaut.com");
	 
	     // Use page Object library now
	 
	     LoginPage.Login(driver);	     
	 
	     //System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	     HomePage.lnk_LogOut(driver).click();
	 
	     driver.quit();
		
	}
	
	

}

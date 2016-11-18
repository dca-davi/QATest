package PageObjects;

import org.openqa.selenium.WebDriver;
import PageObjects.HomePage;

public class LoginPage {
	
	public static void Login(WebDriver driver){
		
		HomePage.lnk_MyAccount(driver).click();
		HomePage.txtbx_UserName(driver).sendKeys("tutorial");
		HomePage.txtbx_Password(driver).sendKeys("tutorial");
		HomePage.btn_LogIn(driver).click();
		
	}
	
}

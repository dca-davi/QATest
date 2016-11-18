package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class HomePage {
	
	private static WebElement element = null;
	
	
	public static WebElement lnk_MyAccount(WebDriver driver){
		 
	    element = driver.findElement(By.linkText("SIGN-ON"));
	 
	    return element;
	 
	    }
	
	public static WebElement txtbx_UserName(WebDriver driver){
		 
        element = driver.findElement(By.name("userName"));

        return element;

        }

    public static WebElement txtbx_Password(WebDriver driver){

        element = driver.findElement(By.name("password"));

        return element;

        }

    public static WebElement btn_LogIn(WebDriver driver){

        element = driver.findElement(By.name("login"));

        return element;

        }
	 
	 public static WebElement lnk_LogOut(WebDriver driver){
	 
	    element = driver.findElement(By.linkText("SIGN-OFF"));
	 
	 return element;
	 
	    }
	

}

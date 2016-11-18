package roteiros;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.FlightFinder;

public class Ct_FlightFinder {
	
	private static WebDriver driver = null;
	
	@Test
	public void FlightFinder(){
		
		 driver = new FirefoxDriver();
		 
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	     driver.get("http://newtours.demoaut.com");
	    
	    LoginPage.Login(driver);
	    
	    FlightFinder.linkFlights(driver).click();
	    
	    FlightFinder.typeFlightRoundTrip(driver).click();
	   
	    Select SelectPassegers = new Select(FlightFinder.SelectPassengers(driver));
	    
	    SelectPassegers.selectByValue("2");
	    
	    Select SelectDepFrom = new Select(FlightFinder.SelectDepartingFrom(driver));
	    
	    SelectDepFrom.selectByValue("London");
	    
		
	}

}

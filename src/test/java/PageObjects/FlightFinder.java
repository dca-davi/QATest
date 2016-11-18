package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FlightFinder {
	
	private static WebElement element = null;
	
	public static WebElement linkFlights(WebDriver driver){
		
		element = driver.findElement(By.linkText("Flights"));
		
		return element;
	}
	
	public static WebElement typeFlightRoundTrip(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//input[@value='roundtrip']"));
	   
	    return element;
	 
	}
	
	public static WebElement typeflightOndeWay(WebDriver driver){
		
		element = driver.findElement(By.xpath("//input[@value='oneway']"));
		
		return element;
	}
	
	public static WebElement SelectPassengers(WebDriver driver){
		
		element = driver.findElement(By.name("passCount"));
		
		return element;
	}
	
	public static WebElement SelectDepartingFrom(WebDriver driver){
		
		element = driver.findElement(By.name("fromPort"));
		
		return element;
	
	}
	
	public static WebElement SelectOn(WebDriver driver){
		
		element = driver.findElement(By.name(""));
		
		return element;
	}

}

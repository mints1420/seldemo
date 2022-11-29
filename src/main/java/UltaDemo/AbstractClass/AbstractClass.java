package UltaDemo.AbstractClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UltaDemo.pageobjects.UltaSuperCategory;

public class AbstractClass {
	
	WebDriver driver;
	
	
    
	
	public AbstractClass(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void visibilityOfElementLocated(By findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	
	public void elementToBeClickable(By findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.elementToBeClickable(findBy));
		
	}
	
	
    public void invisibilityOfElementLocated(By findBy)
    {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
    }
    
    
	
    
}

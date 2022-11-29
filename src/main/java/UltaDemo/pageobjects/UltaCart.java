package UltaDemo.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UltaDemo.AbstractClass.AbstractClass;

public class UltaCart extends AbstractClass {
	
	WebDriver driver;
	
	public UltaCart(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	


	public UltaPlaceOrder cart()
	{
		driver.findElement(By.cssSelector(".ShipOrPickup__pickup")).click();
	     
	     
	     driver.findElement(By.xpath("//p[contains(.,'Change Store')]")).click();
	     
	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	     
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ChangeStoreModal__detail")));
	     
	     driver.findElement(By.cssSelector(".ChangeStoreModal__searchBar")).click();
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".InputField__label.InputField__label--active")));
	     
	     WebElement l = driver.findElement(By.cssSelector(".InputField__label.InputField__label--active"));
	     JavascriptExecutor j = (JavascriptExecutor) driver;
	     j.executeScript("arguments[0].click();", l);
	     
	     l.sendKeys("60441");
	     
	     
	     
	     driver.findElement(By.cssSelector("#searchField")).click();
	     
	     
	     
	     driver.findElement(By.cssSelector("input[name='selectStore']")).click();
	     
	     UltaPlaceOrder placeorder=new  UltaPlaceOrder();
	     return placeorder;
	}
}

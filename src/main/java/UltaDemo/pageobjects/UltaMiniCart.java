package UltaDemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import UltaDemo.AbstractClass.AbstractClass;

public class UltaMiniCart extends AbstractClass {

	WebDriver driver;
	
	By MiniCartvis=By.cssSelector("div.MiniCart");
	
	@FindBy(css="div.MiniCart") WebElement MiniCart;
	
	public UltaMiniCart(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public UltaCart Minicart()
	{
		elementToBeClickable(MiniCartvis);
		
	    MiniCart.click();
	    
	    UltaCart cart=new UltaCart(driver);
	    return cart;
		
	}
	
     
     
    
     
}

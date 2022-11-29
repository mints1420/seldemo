package UltaDemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import UltaDemo.AbstractClass.AbstractClass;

public class UltaPDP extends AbstractClass {
	
	WebDriver driver;
	
	By PDPvis=By.cssSelector("h1[class='Text-ds Text-ds--body-1 Text-ds--left']");
	@FindBy(xpath="//button[contains(.,'ADD TO BAG')]") WebElement AddToBag;
	
	@FindBy(css=".Button-ds.AddToBagButton__Add.Button-ds--withHover") WebElement InBag;
	

	public UltaPDP(WebDriver driver) {
		super(driver);
		
        this.driver=driver;
        PageFactory.initElements(driver, this);
        
        
	}
	
	
	public UltaMiniCart PDP()
	{
		visibilityOfElementLocated(PDPvis);
		try{
	 	    
	    	 Boolean dd= AddToBag.isDisplayed();
	    	 
	    	 if(dd==true)
		    	 
	    	 AddToBag.click(); 
	    	 
	    	 else
	    		 
	    		InBag.click(); 
		    	
	     }
	    	 
	    	  catch(Exception e)
	     	
	     	{
	    	InBag.click(); 
	     }
		
		UltaMiniCart MiniCart=new 	UltaMiniCart(driver);
		return MiniCart;
	}

}

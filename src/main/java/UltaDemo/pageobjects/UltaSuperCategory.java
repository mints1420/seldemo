package UltaDemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import UltaDemo.AbstractClass.AbstractClass;

public class UltaSuperCategory extends AbstractClass {
	
	WebDriver driver;
	
	By breadcrumb=By.cssSelector("h1[class='breadcrumb-heading']");
	
	@FindBy(css="div.productQvContainer") WebElement SupercatClick;
	
	public UltaSuperCategory(WebDriver driver)
	{
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public UltaPDP superCategory()
	{
		visibilityOfElementLocated(breadcrumb);
	     
		SupercatClick.click();
		
		UltaPDP PDP=new UltaPDP(driver);
		return PDP;
		
	}
}

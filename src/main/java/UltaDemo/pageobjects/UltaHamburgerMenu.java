package UltaDemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import UltaDemo.AbstractClass.AbstractClass;

public class UltaHamburgerMenu extends AbstractClass {
	
	WebDriver driver;
	
	By HamburgerMen=By.cssSelector("div[class='DesktopHeader__NavigationBar__item DesktopHeader__NavigationBar__item--userName']");
	
	@FindBy(css="div.DesktopHeader__HambMenu") WebElement Menu;
	
	By MakeupCat=By.cssSelector("a[data-nav-description='m - makeup']");
	
	@FindBy(css="a[data-nav-description='m - makeup:face:foundation']") WebElement FaceFound;
	
	
	
	
	
	public UltaHamburgerMenu(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public UltaSuperCategory HamburgerMenu()
	{
		
	visibilityOfElementLocated(HamburgerMen);
		Menu.click();
		
		
		 Actions a=new Actions(driver);
			
		a.moveToElement(driver.findElement(MakeupCat)).build().perform();
	     
	     FaceFound.click();
	     
	     UltaSuperCategory Supercategory=new UltaSuperCategory(driver);
	     return Supercategory;
		 
	}
	
	

}

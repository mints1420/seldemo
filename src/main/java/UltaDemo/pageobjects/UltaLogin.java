package UltaDemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import UltaDemo.AbstractClass.AbstractClass;

public class UltaLogin extends AbstractClass {
	
	public WebDriver driver;

	public UltaLogin(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	By SigninPageLoad=By.xpath("//label[@for='username']");
	

	@FindBy(xpath="//label[@for='username']") WebElement  usernamefieldclk;
	
	@FindBy(xpath="//input[@class='form-control form-control--active']") WebElement usernameformactive;
	
	@FindBy(xpath="//input[@class='form-control form-control--active']") WebElement email;
	
	By passwordformclick=By.xpath("//label[@for='password']");
	
	@FindBy(xpath="//label[@for='password']") WebElement passwordlabel;
	
	@FindBy(id="password") WebElement password;
	
	By Submit=By.cssSelector("div[class='LoginForm__Submit']");
	@FindBy(xpath="//button[text()='Sign In']") WebElement Submitformclk;
	
	By Loader=By.cssSelector("div[class='Loader']");
	
	
	
	public void LoginPageLoad() {
	
	elementToBeClickable(SigninPageLoad);
		
}

	
	public UltaHamburgerMenu Login(String Email1, String Password1)
	{
		
		elementToBeClickable(SigninPageLoad);
		usernamefieldclk.click();
		Actions a=new Actions(driver);
		
		a.moveToElement(usernameformactive).build().perform();
		email.sendKeys(Email1);
		elementToBeClickable(passwordformclick);
		passwordlabel.click();
		
		a.moveToElement(password).build().perform();
		password.sendKeys(Password1);
		
		visibilityOfElementLocated(Submit);
		
		a.moveToElement(driver.findElement(Submit)).build().perform();
		Submitformclk.click();
		
		
		System.out.println("*******************");
		System.out.println("GitDemo10");
		System.out.println("GitDemo11");
		System.out.println("GitDemo12");
		invisibilityOfElementLocated(Loader);
		UltaHamburgerMenu HamburgerMenu=new UltaHamburgerMenu(driver);
		return HamburgerMenu;
	    
		
	}
	
	


      
}

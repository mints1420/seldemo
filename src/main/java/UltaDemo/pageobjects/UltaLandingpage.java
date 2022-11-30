package UltaDemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UltaDemo.AbstractClass.AbstractClass;

public class UltaLandingpage extends AbstractClass {
	
	public WebDriver driver;

	By AcceptCookie=By.cssSelector("button[id='onetrust-accept-btn-handler']");
	
	By StickyEmailSignUp=By.cssSelector("div[class='StickyEmailSignUp__toggleIcon']");
	
	By SignIn=By.cssSelector("a[title='Sign in']");
	
	
	
	
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
	
	
	
	public UltaLandingpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	public UltaLogin LandingPage() {
		
		
		driver.get("https://www.ulta.com/");
		visibilityOfElementLocated(AcceptCookie);
		driver.findElement(AcceptCookie).click();
		
		visibilityOfElementLocated(StickyEmailSignUp);
		
		driver.findElement(StickyEmailSignUp).click();
		
		driver.findElement(SignIn).click();
		
		System.out.println("GitDemo1");
		System.out.println("GitDemo2");
		System.out.println("GitDemo3");
		
		
		System.out.println("*******************");
		System.out.println("GitDemo4");
		System.out.println("GitDemo5");
		System.out.println("GitDemo6");
		
		
		
       UltaLogin login=new UltaLogin(driver);
        return login;
		
        
		
		
		
		
			}
	

}

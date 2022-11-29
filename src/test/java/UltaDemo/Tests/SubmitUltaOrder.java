package UltaDemo.Tests;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import UltaDemo.TestComponents.BaseTest;
import UltaDemo.pageobjects.UltaCart;
import UltaDemo.pageobjects.UltaHamburgerMenu;
import UltaDemo.pageobjects.UltaLandingpage;
import UltaDemo.pageobjects.UltaLogin;
import UltaDemo.pageobjects.UltaMiniCart;
import UltaDemo.pageobjects.UltaPDP;
import UltaDemo.pageobjects.UltaSuperCategory;

public class SubmitUltaOrder extends BaseTest{
	
	
	@Test(dataProvider="getData", groups={"DataHan"})

	public   void UltaPlaceOrder(String Email1, String Password1) throws IOException {
		
		
		
//		UltaLandingpage LandingP=launchapp();
		
		
			//UltaLogin login=LandingP.LandingPage();
			
			
		
	
		
		
		UltaLogin login=LandingP.LandingPage();
		
		UltaHamburgerMenu HamburgerMenu=login.Login(Email1,Password1);
		
		UltaSuperCategory Supercategory= HamburgerMenu.HamburgerMenu();
		 
		 
		 
		
		 
		UltaPDP PDP= Supercategory.superCategory();
			 
		  UltaMiniCart MiniCart=	 PDP.PDP();
			 
		UltaCart cart= MiniCart.Minicart();
			 

		
	}
		
	
	
	
	
	/*public File getScreenshot(String testCaseName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File Source=ts.getScreenshotAs(OutputType.FILE);
		
		File file =new File(System.getProperty("user.dir") + "//reports//" +testCaseName +".png");
		
		FileUtils.copyFile(Source, file);
		
		return file;
	}*/
	
	
	
		
	@DataProvider
	
	public String[][] getData()
	{
		return new String[][] {{"jan@example.com","Pauljeni3$"},{"man@example.com","Pauljeni3$"}};
	}
	
  
		
		 
	
		 
		 
		 /*
		
		UltaLogin login=new UltaLogin(driver);
		login.LoginPageLoad();
		login.Login("jan@example.com","Pauljeni3$");
		UltaHamburgerMenu HamburgerMenu=new UltaHamburgerMenu(driver);
		
		HamburgerMenu.HamburgerMenu();
		
		 UltaSuperCategory Supercategory=new UltaSuperCategory(driver);
		 
		 Supercategory.superCategory();
		 
		 UltaPDP PDP=new UltaPDP(driver);
		 
		 PDP.PDP();
		 
		 UltaMiniCart MiniCart=new 	UltaMiniCart(driver);
		 MiniCart.Minicart();
		 

	     UltaCart cart=new UltaCart(driver);
	     cart.cart();
	     */
	     
		 
		 
				 
				 
		 
		 
		
		
		
		
		
		
		
		
		//driver.get("https://www.ulta.com/");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='onetrust-accept-btn-handler']")));
		
		
		//driver.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='StickyEmailSignUp__toggleIcon']")));
		
		
		//driver.findElement(By.cssSelector("div[class='StickyEmailSignUp__toggleIcon']")).click();
		
		//driver.findElement(By.cssSelector("a[title='Sign in']")).click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='username']")));
		
		//driver.findElement(By.xpath("//label[@for='username']")).click();
		
		
		
		
		/*Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//input[@class='form-control form-control--active']"))).build().perform();
		
		
		
		
		WebElement email=	driver.findElement(By.xpath("//input[@class='form-control form-control--active']"));
		
		
		email.sendKeys("jan@example.com");
		
		
		//Password***************************************************************
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='password']")));
				
		driver.findElement(By.xpath("//label[@for='password']")).click();
	
		a.moveToElement(driver.findElement(By.id("password"))).build().perform();
	  
	  
	
		WebElement password=driver.findElement(By.id("password"));
	  
		password.sendKeys("Pauljeni3$");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='LoginForm__Submit']")));
		
		
		a.moveToElement(driver.findElement(By.cssSelector("div[class='LoginForm__Submit']"))).build().perform();
		
		WebElement submit=driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		
		
		
		submit.click();
	      
	      
	     wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='Loader']")));*/
	      
	      
	     //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='DesktopHeader__NavigationBar__item DesktopHeader__NavigationBar__item--userName']")));
	      
		
	     //Click Hamburger menu
	    // driver.findElement(By.cssSelector("div.DesktopHeader__HambMenu")).click();
	     
	    // Actions a=new Actions(driver);
			
			//a.moveToElement(driver.findElement(By.cssSelector("a[data-nav-description='m - makeup']"))).build().perform();
	     
	     
	     
	     //driver.findElement(By.cssSelector("a[data-nav-description='m - makeup:face:foundation']")).click();
	     
	    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='breadcrumb-heading']")));
	     
	   //  driver.findElement(By.cssSelector("div.productQvContainer")).click();
	     
	   //Add to cart
	     
	  //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='Text-ds Text-ds--body-1 Text-ds--left']")));
	     
	   // WebElement addToCart= driver.findElement(By.xpath("//button[contains(.,'ADD TO BAG')]"));
	    
	    
	   //   WebElement Added= driver.findElement(By.cssSelector("div.AddToBagButton__Added"));
	     
	     
	              
	            
	            
	  

	/*     try{
	 	    
	    	 Boolean dd= driver.findElement(By.xpath("//button[contains(.,'ADD TO BAG')]")).isDisplayed();
	    	 
	    	 if(dd==true)
		    	 
	    	     
		    	 driver.findElement(By.xpath("//button[contains(.,'ADD TO BAG')]")).click(); 
	    	 
	    	 else
	    		 
	    		 driver.findElement(By.cssSelector(".Button-ds.AddToBagButton__Add.Button-ds--withHover")).click(); 
		    	
	     }
	    	 
	    	 
	     
	     
	     catch(Exception e)
	     	
	     	{
	    	 //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.AddToBagButton__Added")));
	    	driver.findElement(By.cssSelector(".Button-ds.AddToBagButton__Add.Button-ds--withHover")).click(); 
	    	 
	    	
	
	     }*/
	     
	     
	     
	     
	     //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.MiniCart")));
	     
	     
	    // driver.findElement(By.cssSelector("div.MiniCart")).click();
	     
	    // wait.until(ExpectedConditions.urlToBe("https://www.ulta.com/bag"));
	     
	 // **********************   
	   /*driver.findElement(By.cssSelector("div.AnchorButton")).click();
	     
	    driver.findElement(By.xpath("//button[contains(.,'Pickup in Store')]")).click();*/
	     
	    //*********************
	     
	     
	     
	     
	     
	   //  driver.findElement(By.cssSelector(".form-control.form-control--active")).click();
	     
	    // driver.findElement(By.cssSelector("input[aria-label='Current Location']")).click();
	     
	     //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".InputField__label.InputField__label--active")));
	     
	    // driver.findElement(By.cssSelector(".InputField__label.InputField__label--active")).click();
	     
	       
	     
	   //  driver.switchTo().frame(driver.findElement(By.id("snap6149157")));
	     
	    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='form-control form-control--active']")));
	     
         /*driver.findElement(By.cssSelector(".ShipOrPickup__pickup")).click();
	     
	     
	     driver.findElement(By.xpath("//p[contains(.,'Change Store')]")).click();
	     
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ChangeStoreModal__detail")));
	     
	     driver.findElement(By.cssSelector(".ChangeStoreModal__searchBar")).click();
	     
	   
	     l.sendKeys("60441");
	     
	     
	     
	     driver.findElement(By.cssSelector("#searchField")).click();
	     
	     
	     
	     driver.findElement(By.cssSelector("input[name='selectStore']")).click();*/
	     
	     
	    // driver.switchTo().defaultContent();
	     
	     
	     
	     

	     
		  



	
	

}

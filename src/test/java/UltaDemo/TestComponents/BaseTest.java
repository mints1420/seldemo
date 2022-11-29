package UltaDemo.TestComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import UltaDemo.pageobjects.UltaLandingpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	
	public UltaLandingpage LandingP;
	
	public  WebDriver initializedriver() throws IOException
	
	{
		
		
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//UltaDemo//Resources//GlobalData.properties");
		prop.load(fis);
		String browserName=System.getProperty("browser")!=null ?System.getProperty("browser"):prop.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
		driver=new ChromeDriver();
			
			
		}
	 
		
		else if(browserName.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		

		else if(browserName.equalsIgnoreCase("edge"))
		{

			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		return driver;
		
	}
	
	@BeforeMethod
	
	public UltaLandingpage launchapp() throws IOException
	{
		driver=initializedriver();
		LandingP=new UltaLandingpage(driver);
		return LandingP;
		
		
	}
	
	
	
	
	
}

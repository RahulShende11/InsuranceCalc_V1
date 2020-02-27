package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest
{

	//Execution Starts from m
	public static void main(String[] args) 
	{
		
		// launch chrome
		//System.setProperty("webdriver.chrome.driver", "C:\\SDET\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		//WebDriver driver = new ChromeDriver();		
		WebDriver driver = new InternetExplorerDriver();
		// navigate to aut http://demo.automationtalks.com/
		
		driver.get("http://demo.automationtalks.com/");
		// verify page title
		String expectedtitle = "Fill Vehicle Data";
		
		String acctualtitle = driver.getTitle();
		System.out.println(acctualtitle);
		if(expectedtitle.equals(acctualtitle))
		{
			System.out.println("Pass");
			
		
		}
		else
		{
			System.out.println("Fail");
		}
		//close browser
		driver.close();
	}
	

}

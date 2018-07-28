package testTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2 {
	
	WebDriver driver;

	@Parameters({"browser"})
	@BeforeTest
	public void testBrowser(String browser)
	{
		 try

         {

                if(browser.equalsIgnoreCase("Firefox"))

                {
                	System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
                      driver = new FirefoxDriver();

                }

                if(browser.equalsIgnoreCase("Chrome"))

                {
                	
                     
                	   System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
                       driver = new ChromeDriver();

                }

                
         }

         catch (WebDriverException e)

         {

                System.out.println("Browser not found" +e.getMessage());

         }
	}
	
	@Test
	public void testLogin()
	{
		driver.get("https://www.carrefouruae.com/mafuae/en/login");
		driver.findElement(By.id("j_username")).sendKeys("gauravkohli2005@gmail.com");
		driver.findElement(By.id("j_password")).sendKeys("Kohli@321");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
}

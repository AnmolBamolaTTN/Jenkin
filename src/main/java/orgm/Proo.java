package orgm;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Proo{

private static WebDriver driver;

	@BeforeMethod
	public void lauch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anmol Bamola\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.geogebra.org/scientific");
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  Thread.sleep(6000); 
	}
       
		@Test
		public void Home() 
		{
			driver.findElement(By.xpath("//div[@class=\"gwt-Label\"][1]")).click();
			driver.findElement(By.xpath("(//div[@class=\"gwt-Label\"])[13]")).click();
            driver.findElement(By.xpath("//div[@class=\"gwt-Label\"][1]")).click();
            String ans=driver.findElement(By.xpath("//div[@class=\"gwt-HTML\"]")).getText();
            System.out.println(ans);
			
		}
		
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}
	

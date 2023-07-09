package mvncmd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest2 {
	WebDriver driver;
	@Test
	
	public void m1()
	{
		
		String Browser=System.getProperty("browser");
		String Url = System.getProperty("url");
		
		if (Browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get(Url);
	}

}

package mvncmd;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	@Test
	public void createOrg() throws Throwable {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Random ran=new Random();
	int data = ran.nextInt(1000);
	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	// driver.switchTo().alert().dismiss();
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	String accname="soun"+data;
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(accname);
	driver.findElement(By.id("phone")).sendKeys("556788");
	driver.findElement(By.id("email1")).sendKeys("sofk@gmail.com");
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(2000);
	
	 driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	
	 Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
}
	@Test
	public void createCamp() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement input = driver.findElement(By.xpath("//a[text()='More']"));

		Actions act=new Actions(driver);
		act.moveToElement(input).perform();
		driver.findElement(By.xpath("//a[@name='Campaigns']")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("hp laptop");
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign Out")).click();
		
	}

}

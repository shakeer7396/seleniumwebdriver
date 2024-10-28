package day42_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
Steps to automate:-
1) Open application
2) test logo presence
3) login
4)close

*/

public class Webdriver_Test1_OrangeHRM {
	//InstanceVariable or classVariable or classObject we can access in every method
	WebDriver driver;  //put this inside class and outside method its works globally in all methods.
 
	@Test(priority=1)
	void openapp() {
//		WebDriver driver = new ChromeDriver();  //We use this inside method its work local this method only
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //It is used for giving the time for load
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	void testLogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo displayed is "+status);
		
	}
	@Test(priority=3)
	void testLogin() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
	}
	@Test(priority=4)
	void closeApp() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		
	}
}

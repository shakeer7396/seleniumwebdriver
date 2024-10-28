package day27WaitingMethods;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPrb3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); //declaration 10sec max for all
		
		//get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='username']")));
		txtusername.sendKeys("Admin");
		
		WebElement txtpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='password']")));
		txtpassword.sendKeys("admin123");
		
		WebElement loginbtn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=' Login ']")));
		loginbtn.click();
				
			
		

	}

}

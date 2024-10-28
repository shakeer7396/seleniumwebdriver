package day27WaitingMethods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
public class FluentWaitPrb4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//FluentWait declaration
		Wait<WebDriver> mywait =  new FluentWait <WebDriver>(driver)
		 .withTimeout(Duration.ofSeconds(30))
		 .pollingEvery(Duration.ofSeconds(5))
		 .ignoring(NoSuchElementException.class);
		
		//get(url) - opens the url on the browser
				driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
				driver.manage().window().maximize();
				
				//driver.findElement(By.xpath("//*[@placeholder='username']")).sendKeys("Admin"); // This also use directly
				//FluentWait applying
				WebElement txtusername = mywait.until(new Function<WebDriver, WebElement>() {
				     public WebElement apply(WebDriver driver) {
				       return driver.findElement(By.xpath("//*[@placeholder='username']"));
				     }
				   });
				txtusername.sendKeys("Admin");

	}

}

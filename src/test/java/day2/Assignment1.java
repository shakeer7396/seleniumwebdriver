package day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Manual test cases
1.open application "https://www.demoblaze.com/index.html"
2.Total number of links
3.Total number of images
4.Click on any product link using linkText/partialLinkText
*/
public class Assignment1 {
	public static void main(String []args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total number of links : "+links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images : "+images.size());
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("sign-username")).sendKeys("Enter User Name");
		Thread.sleep(3000);
		
		driver.findElement(By.id("sign-password")).sendKeys("Enter Password");
		Thread.sleep(3000);
		
		driver.close();
	}

}

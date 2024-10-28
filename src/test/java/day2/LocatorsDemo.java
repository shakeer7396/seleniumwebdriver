package day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsDemo {
	public static void main(String[] args) throws InterruptedException {		
		WebDriver driver = new ChromeDriver();
		//WebDriver is a interface  && ChromeDriver is a class. 
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize(); //default it open in browser small window but we use this line it opens full window
		
		//id,name,linkText,partialLinkText these are identifying specific type of single webElement
		//1.id
//		boolean TextDisplayedStatus = driver.findElement(By.id("copyright")).isDisplayed();
//		System.out.println(TextDisplayedStatus);
		
		//2.name
		//driver.findElement(By.name("newsletter")).sendKeys("Send mail");//.sendKeys are used for sending any value to the search input
		
		//3.linkText & partialLinkText -->These are used only for locating links
		driver.findElement(By.linkText("Features")).click(); // in this locator it takes full Text, it acesses the link after text,
		
		//4.partialLinkText
		//driver.findElement(By.partialLinkText("Feat")).click(); // in this locator it takes some Text, it acesses the link previous one same,
		//partialLinkText is not preferable because it takes half text also given result so other text also same so not use this use linkText.
		
		//5. & 6. tagName & className  -->These are locating or identifying group of multiple web elements
		//For locating single webElement use findElement
		//For locating multiple webElements use findElements
		
		//5.className  
		List<WebElement> classLinks = driver.findElements(By.className("col-sm-4"));
		System.out.println("Total number of classLinks "+ classLinks.size()); //.size()method shows total count
		
		//6.tagName
		//List<WebElement> is a written type it means it shows when cursor over on findElements it shows written type
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : "+links.size());
		
		List<WebElement>images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images : "+images.size());
		
		Thread.sleep(3000);
		driver.close();
	}
}

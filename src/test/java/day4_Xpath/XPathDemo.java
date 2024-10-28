package day4_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//for running this application shortcut is alt+shift+x+j 
		
		//XPath Locators are multi-direction flow you can use top to bottom or btm to top or middle also use any where by using Xpath axis
		
		//XPath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Mobiles");
		
		//XPath with multiple attributes  this one used for strong to locate xpath
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("Tablets");
		
		//XPath with 'and' 'or' operators 
		//and means both are multiple should be correct or true then only work --but or in multiple at least one correct its enough
		
		//driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("Tablets");
		//driver.findElement(By.xpath("//input[@placeholder='Search' or @name='searc']")).sendKeys("Tablets");
		
		//XPath with text() method  - innerText  It will help to find the xpath with inner-text  For empty div syntax //div[contains(.,'')] 
		//driver.findElement(By.xpath("//*[text()='Desktops']")).click();
		
//		boolean status = driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
//		System.out.println(status);
//		
//		String text = driver.findElement(By.xpath("//*[text()='Featured']")).getText();
//		System.out.println(text);
		
		//XPath with contains method  This case it take tag & contains is a method with 2 parameters attribute and Partial value any where in string
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Mobiles");
		
		//XPath with starts-with method  This case it take tag & contains is a method with 2 parameters attribute and Partial value only starting same in string
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Mobiles");
		
		
		//Handling dynamic attributes  Timer Start and Stop with same button id start stop these xpath don't generate we have to write manually
		//By or //*[@id = 'stats' or @id= 'stop']
		//By contains //*[contains(@id, 'st')]
		//By starts-with  //*[starts-with(@id,'st')]
		//By accessing inner text               //*[contains(text(),'st')]
		
		
		//Chained XPath Any attributes and inner text also not there in this element this is a combination of relative and absolute xpath It takes from parent
		boolean res = driver.findElement(By.xpath("//*[@id='logo']/a/img")).isDisplayed();
		System.out.println(res);
		
	}

}

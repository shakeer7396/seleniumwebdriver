package day26WebdriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsPrb2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//1) isDiaplayed()
		//1st-model  Xpath taken from selector hub
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println("Logo is displayed : "+ logo.isDisplayed());  //true
 
		//2nd-model  Xpath taken by me its a chained Xpath----
//		boolean status = driver.findElement(By.xpath("//*[@class='header-logo']/a/img")).isDisplayed();
//		System.out.println("Logo is displayed : "+ status);  //true
		
		//2) isEnabled()
//		boolean status = driver.findElement(By.xpath("//*[@id='small-searchterms']")).isEnabled();
//		System.out.println("Input box is Enabled : "+status);
			
		//3) isSelected()
		WebElement male_rd = driver.findElement(By.xpath("//*[@value='M']"));
		WebElement female_rd = driver.findElement(By.xpath("//*[@value='F']"));
		
		System.out.println("Before Selection..........");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false
		
		System.out.println("After Selection male..........");
		male_rd.click();
		System.out.println(male_rd.isSelected()); //true
		System.out.println(female_rd.isSelected()); //false
		
		System.out.println("After Selection female..........");
		female_rd.click();
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //true
		
	}

}

package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorsP1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//First you check devtools in website inspect and ctrl+f in search box all xpaths then cofm apply in code
		//Also use selector hub extension open directly or using inspect just go on website then click it gave output all paths
		
		//Css selector flow is top to down direction single direction
		
		//tag id    tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts"); //tag input is optional you don't put ok
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag class		tag.classname
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts"); //in every element tag is not important input
		
		
		//tag attribute 		tag[attribute="value"]
		//in java double cots inside double cots """" are not allowed if you want ("[place=\"new\"]") so put single cots ''
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Mobiles");
		
		
		//tag class attribute			tag.classname[attribute="value"] 		//same elements there then check tag class attribute
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Electronics");

	}

}

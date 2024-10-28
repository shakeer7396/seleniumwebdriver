package day26WebdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsPrb1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();

		//get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		//getTitle() - returns title of the page
		System.out.println("getting the Title from browser window is "+driver.getTitle()); //OrangeHRM

		//getCurrentUrl() - returns URL of the current page
		System.out.println("getting the currentUrl from browser window is "+driver.getCurrentUrl());
		//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		//getPageSource() - returns source code of the page  (It is a not that much imp)
		System.out.println("getting the Sorce code from browser window is "+driver.getPageSource()); //Print Source code in console


		//getWindowHandle() - returns ID of the single browser window
		//It generates Unique Id every time not same 
		
		//		String windowId = driver.getWindowHandle();
		//		System.out.println("getting the current single window ID from browser window is "+windowId);
		//48B33DDB0A8E8A9BFF752A457EE4CAF9
		//2BC5F6D48CC0899A8EEB7B7038D6C4EA

		//getWindowHandles() - returns ID's of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open the new browser windows
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("Opening two window ids are "+windowIds); //[16BF928187BF61B4B7CC49735D8ABBDE, 06B21097FB4AB0929EDA62CD0770C480]

		//<List> collection allows the duplicates also so we are not using this
		//We are using set because we window id's are unique so set collection doesn't allow the duplicates
		//All Ids are in string format so using string

	}

}

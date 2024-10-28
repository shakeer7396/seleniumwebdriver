package day1;

import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
//Everything in Selenium is an Element;
/*Manual Test Case 

1)Launch browser (chrome)
2)Open URL https://www.opencart.com/index.php?route=cms/demo
3)Validate title should be "OpenCart - Demo"
4)close browser 
 */

public class prb1 {

	public static void main(String[] args) throws InterruptedException {
		//throws InterruptedException used for slow down the loading
		
		//WebDriverManager.chromedriver().proxy("testhost:8080").setup();
		//In company have any proxy related issue it will work for solving issue
		
		//1) Launching the browser (chrome)
//		ChromeDriver driver = new ChromeDriver();//OR Its a child one for working chrome browser only
		
		WebDriver driver = new ChromeDriver(); 
		//Its a parent one you can use what ever is ok but its preferable because its also support other browsers also
		Thread.sleep(1000);
//		2)Open URL https://www.opencart.com/index.php?route=cms/demo
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		//This method will open this url in web browser directly
		Thread.sleep(1000);
//		3)Validate title should be "OpenCart - Demo"
		
		String act_title = driver.getTitle(); //For capturing the title using this method
		
		if(act_title.equals("OpenCart - Demo")) {
			System.out.println("Test Passed");
		}
		
		else {
			System.out.println("Test Failed");
			
		}
		Thread.sleep(1000); //It causes slow down the project loading,
		
//		4)close browser they have 2 methods
//		driver.close();
		//driver.quit();
	}

}

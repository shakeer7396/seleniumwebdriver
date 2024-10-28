package day1;

/*Manual Test Case 

1)Launch browser (chrome)
2)Open URL https://www.myntra.com/
3)Loading time
4)Open URL https://www.myntra.com/shop/kids
3)Validate title should be "OpenCart - Demo"
4)close browser 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prb3Asignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		driver.get("https://www.myntra.com/shop/kids");
		
		Thread.sleep(3000);
		driver.get("https://www.myntra.com/kids?f=Gender%3Aboys%2Cboys%20girls&plaEnabled=false");
		
        String act_title = driver.getTitle(); //For capturing the title using this method
		
		if(act_title.equals("Top Picks")) {
			System.out.println("Test Passed");
		}
		
		else {
			System.out.println("Test Failed");
			
		}
		
		
		
	}

}

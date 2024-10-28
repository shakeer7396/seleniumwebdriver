package day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
/*Manual Test Case 
 * 1) Launch browser (chrome)
 * 2)Open URL https://demo.nopcommerce.com/
 * 3)Validate title should be "nopCommerce demo store"
 * 4)close page
 */
public class Prb2Asignment {
	
	public static void main(String []args) throws Exception {
		
//		 1) Launch browser (chrome)
		WebDriver driver = new ChromeDriver(); //Creating the object --its for chrome
		//WebDriver driver = new EdgeDriver();  //--its for edge 
				
		//2)Open URL https://demo.nopcommerce.com/
		//This method will open this url in web browser directly
		driver.get(" https://demo.nopcommerce.com/");
		
		//3)Validate title should be "nopCommerce demo store"
		String act_demo = driver.getTitle();
		
		if(act_demo.equals("nopCommerce demo store")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		Thread.sleep(3000);
		// 4)close page
		driver.close();
		//driver.quit();
		
		
	}

}

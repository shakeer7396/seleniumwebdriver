package day27WaitingMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitPrb2 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//You will write this code once after the WebDriver, it works for all, which execution want time it take 0 to 5 sec automatically
		//Any statement don't want time, its don't take time for loading,
		//But it only wait which time you mention, statement take more time it throws error
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicit
		//get(url) - opens the url on the browser
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open the new browser windows
				
				
	}

}

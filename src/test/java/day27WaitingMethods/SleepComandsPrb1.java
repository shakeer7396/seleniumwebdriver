package day27WaitingMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepComandsPrb1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		//get(url) - opens the url on the browser
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(5000);
				
				driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open the new browser windows
				Thread.sleep(5000);
				
	}

}

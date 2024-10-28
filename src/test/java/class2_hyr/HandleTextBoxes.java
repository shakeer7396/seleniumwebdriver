package class2_hyr;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//How to handle the textboxes using selenium webdriver ?
public class HandleTextBoxes {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement usernameTxt = driver.findElement(By.id("login_field"));
		WebElement userpassword = driver.findElement(By.id("password"));
		if(usernameTxt.isDisplayed() && userpassword.isDisplayed()) {
			if(usernameTxt.isEnabled() && userpassword.isEnabled()) {
				usernameTxt.sendKeys("Please Enter Username");
				Thread.sleep(3000);
				userpassword.sendKeys("enter password");
				String enteredText = usernameTxt.getAttribute("value");
				String enteredpass = userpassword.getAttribute("value");
				System.out.println(enteredText);
				System.out.println(enteredpass);
				Thread.sleep(3000);
				usernameTxt.clear();
				userpassword.clear();
				Thread.sleep(3000);
				driver.quit();
			}
			else {
				System.err.println("user textbox is not enabled");
			}
		}
		else {
			System.err.println("user textbox is not displayed");
		}

	}

}

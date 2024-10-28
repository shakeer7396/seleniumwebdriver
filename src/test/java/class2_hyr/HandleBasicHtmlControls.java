package class2_hyr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//How to handle the links,buttons,radio buttons and checkboxes using selenium webdriver ?

public class HandleBasicHtmlControls {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //using for slow loading
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindiCbhk = driver.findElement(By.id("hindichbx"));//stored in a variable
		hindiCbhk.click(); //Check box clicking for selecting
		Thread.sleep(3000);
		if(hindiCbhk.isSelected())
			hindiCbhk.click(); //Check box clicking for unselect
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		Thread.sleep(3000);
		driver.close();
	}

}

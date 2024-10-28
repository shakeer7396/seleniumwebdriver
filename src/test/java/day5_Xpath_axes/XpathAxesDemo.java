package day5_Xpath_axes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();

		//self  - Selects the current node (Me)
		String self_text=driver.findElement(By.xpath("//a[normalize-space()='Godrej Agrovet L']/self::a")).getText();
		System.out.println(self_text);


		//parent	- Select the parent of the current node (always one)(My Dad)
		String parent_text = driver.findElement(By.xpath("//a[normalize-space()='Godrej Agrovet L']/parent::td")).getText();
		System.out.println(parent_text);


		//ancestor  //accessing text  (Select all the ancestors (parent and grandparent) etc.(My Dada)
		String ancestor_text = driver.findElement(By.xpath("//a[normalize-space()='Godrej Agrovet L']/ancestor::tr")).getText();
		System.out.println(ancestor_text);

		
		//child     //accessing count  //returning multiple webElements so take List of web elements.
		//(Select all the children of the current node (one or many)(Hamare Dada k pure bachhe--badebas,chachas,baa and phuppus)
		List<WebElement> childs_count = driver.findElements(By.xpath("//a[normalize-space()='Godrej Agrovet L']/ancestor::tr/child::td"));
		System.out.println("Total number of children_count td is "+childs_count.size());

		
		//descendant   - Select all the descendants (children, grandchildren etc) of the current nodeHamare Dada k pure bachhe--badebas,chachas,baa and phuppus & Potres,and potries)
		List<WebElement> descendant_count = driver.findElements(By.xpath("//a[normalize-space()='Godrej Agrovet L']/ancestor::tr/descendant::*"));
		System.out.println("Total number of descendant_count is "+descendant_count.size());

		
		//following		- Selects everything in the document after the closing tag of the current node(main mai self hamare dada k baad ke pure bro's,sis's)
		List<WebElement> following_count = driver.findElements(By.xpath("//a[normalize-space()='Godrej Agrovet L']/ancestor::tr/following::tr"));
		System.out.println("Total number of following_count tr is "+following_count.size());

		
		//following-siblings  -Select all siblings after the current node(My self hamare dada k badd se continue small bro's and sis's)
		List<WebElement> followingSibling_count = driver.findElements(By.xpath("//a[normalize-space()='Godrej Agrovet L']/ancestor::tr/following-sibling::tr"));
		System.out.println("Total number of following-sibling_count tr is "+followingSibling_count.size());

		
		//preceding    -Select all nodes that appear before the current node in the document(My self hamare dada se pehle k badeba ke beta and dada k continue big bro's and sis's first se dada k vupar tak )
		List<WebElement> preceding_count = driver.findElements(By.xpath("//a[normalize-space()='Godrej Agrovet L']/ancestor::tr/preceding::tr"));
		System.out.println("Total number of preceding_count tr is "+preceding_count.size());

		
		//preceding-sibling    -Select all the siblings before the current node in the document(My self hamare dada se pehle k continue big bro's and sis's first se dada k vupar tak )
		List<WebElement> precedingSibling_count = driver.findElements(By.xpath("//a[normalize-space()='Godrej Agrovet L']/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Total number of preceding-sibling_count tr is "+precedingSibling_count.size());

;


	}

}

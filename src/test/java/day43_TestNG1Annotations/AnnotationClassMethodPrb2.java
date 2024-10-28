package day43_TestNG1Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
1)Login		-->@BeforeClass		--There login can executes only once Before the test in the class
2)Search	-->@Test
3)advSearch -->@Test
4)Logout	-->@AfterClass		--There logout can executes only once After the test in the class

After class is not mandatory in this depends upon the test case we can use, particular rule is not there
 */
public class AnnotationClassMethodPrb2 {
	@BeforeClass
	void login() {
		System.out.println("This is login..");
	}
	@AfterClass
	void logout() {
		System.out.println("This is logout..");
	}
	@Test(priority=1)
	void search() {
		System.out.println("This is search..");
	}
	@Test(priority=2)
	void advancedSearch() {
		System.out.println("This is advanced Search..");
	}
	
}

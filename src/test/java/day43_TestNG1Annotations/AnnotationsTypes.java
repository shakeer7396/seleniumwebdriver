package day43_TestNG1Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
1) Login	--> @BeforeMethod is using there because it executes multiple times so declare once  --Pre requisite Entry criteria only not a test
2) Search	--> @Test Its main test functionality
3) Logout	--> @AfterMethod  because every time executing after the functionality, its came 2 times execute once --Exit criteria only not a test
4) Login	--> @
5) Adv search -> @Test Its also main test functionality
6) Logout	--> @
	Results only came from Test methods but execution will happen in all methods
 */

public class AnnotationsTypes {
	@BeforeMethod
	void login() {
		System.out.println("This is login..");
	}
	@Test(priority=1)
	void search() {
		System.out.println("This is search..");
	}
	@Test(priority=2)
	void advancedSearch() {
		System.out.println("This is advanced Search..");
	}
	@AfterMethod
	void logout() {
		System.out.println("This is logout..");
	}

}

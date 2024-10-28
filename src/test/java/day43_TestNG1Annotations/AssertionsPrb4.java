package day43_TestNG1Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsPrb4 {
@Test
	void testTitle(){		//when we use test method then compulsory start test name is important;
		//Previously we are checking equality with conditions but in testing  it will not work directly
	//Test method check only method running or not it will not check conditions inside the method that's why we are using Assertion it checks methods and conditions also
	//Assert is a pre-defined class it holds multiple methods for different type of validations
		
		String expected_title = "Opencart";
		String actual_title = "Openshop";
		
//		if(expected_title.equals(actual_title)) {
//			System.out.println("Test Passed");
//		}
//		else {
//			System.out.println("Test Failed");
//		}
		
		//It is a Assertion method mostly using this method directly for output
		//Assert.assertEquals(expected_title, actual_title);
		
		//If you want still using Assertion with conditions then use Assertion method inside condition like
		if(expected_title.equals(actual_title)) {
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}
}

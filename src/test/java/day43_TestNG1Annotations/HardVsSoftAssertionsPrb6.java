package day43_TestNG1Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertionsPrb6 {
	//@Test
	void test_hardAssertions() {
		//These are static methods
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		//In this case, This assertion is failed then above statements only printed, bellow statements are failed
		//This assertion is passed then above and below statements all printed
		//Assert.assertEquals(2,2);  //passed
		//You have to use Hard Assertions It is a last step of the assertions then use assertion after completing all the code then finally do validation with assertion
		//Are else you have more Executions there after Assertion then use Soft Assertions
		//Hard Assertion methods you can access directly from Assert class
		//Soft Assertion methods we can access from the object of Soft Assert class
		
		Assert.assertEquals(1, 2); //failed
		
		System.out.println("Testing....");
		System.out.println("Testing....");
				
	}
	@Test
	void test_softAssertions() {
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		//Soft Assertions you can't use directly you can create an object in built class SoftAssert
		//These are non static methods
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2); //failed
		
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		//End of this method we can use compulsory this one why means softAssertions by default passed as false condition
		//so we use this it check all condition and gave correct output
		sa.assertAll(); //mandatory in SoftAssertion class
	}

}

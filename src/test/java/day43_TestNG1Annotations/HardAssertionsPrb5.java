package day43_TestNG1Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsPrb5 {
@Test
	void test() {
	//Only through Automation, Only through Assertions we can do validations	
	//Number of Assertions methods which are directly involved for getting output or controlling method
	//These all are Hard Assertions they comes under static methods so we can directly access from static class

	//Assert.assertEquals("xyz","xyz");  //Its checking true value only test passed
	
	//Assert.assertEquals(123, 345);
	
	//Assert.assertEquals("abc", 123);
	
	//Assert.assertEquals("123", 123);
	
	//Assert.assertNotEquals(123, 123); //failed  //Its checking false value only test passed
	
	//Assert.assertNotEquals("abc", 123); //passed
	
	//Assert.assertTrue(true); //passed
	
	//Assert.assertTrue(false);  //failed
	
	//Assert.assertTrue(1==2);  //failed
	
	//Assert.assertTrue(1==1);  //passed
	
	//Assert.assertFalse(1==1); //failed
	
	//Assert.assertFalse(1==2);  //passed
	
	Assert.fail();  //Direct fail method without execution intentionally done
	
	
	}
}

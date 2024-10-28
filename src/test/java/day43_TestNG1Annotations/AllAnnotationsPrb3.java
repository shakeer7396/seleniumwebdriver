package day43_TestNG1Annotations;

import org.testng.annotations.*;

public class AllAnnotationsPrb3 {
@BeforeSuite	
void bs() {
	System.out.println("This is before suite..");
}

@AfterSuite
void as() {
	System.out.println("This is after suite..");
}
@BeforeTest
void bt() {
	System.out.println("This is before test..");
}
@AfterTest
void at() {
	System.out.println("This is after test..");
}
@BeforeClass
void bc() {
	System.out.println("This is before class..");
}
@AfterClass
void ac() {
	System.out.println("This is after class..");
}
@BeforeMethod
void bm() {
	System.out.println("This is before method..");
}
@AfterMethod
void am() {
	System.out.println("This is after method..");
}
@Test(priority=1)
void tm1() {
	System.out.println("This is Test method-1..");
}
@Test(priority=2)
void tm2() {
	System.out.println("This is Test method-2..");
}

}
/*
 **Annotations will control order of execution.and Annotations decide when to execute those methods
**Annotations will participate only in execution not in results

 * Output
 This is before suite..
This is before test..
This is before class..
This is before method..
This is Test method-1..
This is after method..
This is before method..
This is Test method-2..
This is after method..
This is after class..
This is after test..
This is after suite..
----
Suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
 */

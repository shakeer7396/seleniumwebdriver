package day42_TestNG;

import org.testng.annotations.Test;

/*
Test Steps:-
1) Open app  --is a one step
2) Login             --is a second step
3) Logout            --is a third step
 */
public class TestNG_Class_1 {
	//This is a method every step have multiple methods based on complexity.
	//In Java Main method is compulsory for execution the code--Same as Atleast one @TestNG is compulsory for TestNG method execution.
	//Every test method we have compulsory to put @Test annotation then only run the code in TestNG method.
	//TestNG execute test methods only if they are having @Test annotation.
	//TestNG executed below @Test methods by alphabetical order which letter come first by default.
	//By adding the priority in @TestNG(priority=num) it was controlled the order of execution.
	//Once you provide priority to the test methods, then order of methods is not considered(put any where up &down)
	//priorities can be random numbers eg..1,15,28 (no need to have consecutive numbers like eg..1,2,3).
	//If you don't provide priority any one method then default value is Zero(0).like @Test.
	//If the priorities are same then again execute methods in alphabetical order.
	//Negative values are allowed in priority wise. like (-6,-5,-4,-3,-2,-1,0,1 ..etc) first came -6.
	
	
	//it is responsible for Open app 
	@Test(priority=-1) //Its a Annotation + priority
	void openapp() {
		System.out.println("Opening application...");
	}
	//it is responsible for Logout 
		@Test(priority=8) 
		void logout() {
			System.out.println("Logout from application...");
		}
	//it is responsible for Login 
	@Test(priority=2) 
	void login() {
		System.out.println("Login to application...");
	}
	
}

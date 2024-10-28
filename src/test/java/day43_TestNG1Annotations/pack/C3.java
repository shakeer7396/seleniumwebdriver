package day43_TestNG1Annotations.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	void pqr() {
		System.out.println("This is pqr from C3..");
	}
	@BeforeSuite
	void bf() {
		System.out.println("This is BeforeSuite method");
	}
	@AfterSuite
	void af() {
		System.out.println("This is AfterSuite method");
	}

}

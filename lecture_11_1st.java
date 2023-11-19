package com.Lecture11;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lecture_11_1st {
	@BeforeSuite
	public void executionFirst() {
	System.out.println("This will execute first");
	}
	@BeforeTest
	public void executionSecond() {
	System.out.println("This will execute second");
	}
	@BeforeSuite
	public void executionThird() {
		System.out.println("This will execute third");
	}
	@BeforeMethod
	public void executionPreImportant() {
		System.out.println("We mostly use Before Method in combination with @Test annotation");
	}
	@Test
	public void testCase1() {
	System.out.println("This is test case 1");
	}
	@Test
	public void tesCase2() {
		System.out.println("This is test case 2");
	}
	@AfterMethod
	public void PostExecutionImportant() {
		System.out.println("We mostly use After Method in combination with @Test annotation");
	}
	@AfterClass
	public void executionLater() {
		System.out.println("This will execute later - AfterClass");
	}
	@AfterTest
	public void executionLaterMore() {
	System.out.println("This will execute later later -AfterTest");
	}
	@AfterSuite
	public void executeLast(){
	System.out.println("This will execute last");
	}
}




package testNG;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups= {"regression"})
	public void Test1() {
		System.out.println("Regression Test 1");
	}

	@Test(groups= {"Smoke"})
	public void Test2() {
		System.out.println("Smoke Test1");
	}

	@Test(groups= {"regression"})
	public void Test3() {
		System.out.println("Regression Test 2");
	}

	@Test(groups= {"Sanity"})
	public void Test4() {
		System.out.println("Sanity Test 1");
	}

	@Test(groups= {"Smoke","regression"})
	public void Test5() {
		System.out.println("Smoke Test 2 , Regression Test 3");
	}

}

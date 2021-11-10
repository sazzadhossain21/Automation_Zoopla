package com.smoketesting;

import org.testng.annotations.Test;

public class TestNGCount {
	@Test(invocationCount=10)
public void methodCount() {
		System.out.println("i am 10");
	
}
}

package com.smoketesting;

import org.testng.annotations.Test;

public class TestEnable {
	@Test(enabled=true)
public void method1() {
	System.out.println("i m method1");
}
	@Test(enabled=false)
public void method2() {
	System.out.println("i m method2");
}
}

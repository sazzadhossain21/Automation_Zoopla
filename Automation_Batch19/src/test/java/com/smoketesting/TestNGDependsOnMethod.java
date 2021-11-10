package com.smoketesting;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGDependsOnMethod {
	@Test
public void method1()
{    Assert.assertTrue(false);
	System.out.println("I am first method ");
	}
@Test(dependsOnMethods="method1")
public void method2() {
	System.out.println("I am second method");
}
}

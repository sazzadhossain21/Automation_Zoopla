package com.smoketesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGannotationClass {

@Test(priority=3)	
public void getPrerequiest() {
	System.out.println("I am 3");
}
@Test
public void get() {
	System.out.println("i am zero");
}
@Test(priority=-1)
public void getAction()
{
	System.out.println("I am -1");
	}
@Test(priority=1)
public void getCloseBrowser() {
	System.out.println("I am 1");
}
}

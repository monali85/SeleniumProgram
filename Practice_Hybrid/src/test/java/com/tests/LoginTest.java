package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class LoginTest extends BaseClass {

	@BeforeSuite
	public void setup()throws Exception{
		 initialization();
	}
	@Test
	public void test1()
	{
		Assert.assertTrue(false);
		
	}
}


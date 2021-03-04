package com.google.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.qa.pages.LoginPage;

public class loginTest extends BaseTest{
	LoginPage login;
	
	public loginTest() {
		login= new LoginPage();
	}
	
	
	@Test
	public void logintestCase_01() {
		login.logininitial();
		Assert.assertTrue(true);
	}
	
	@Test
	public void logintestCase_02() {
		login.logininitial();
		Assert.assertTrue(false);
	}
	
	@Test
	public void logintestCase_03() {
		System.out.println("Buscando titulo en el login");
		Assert.assertTrue(true);
	}
	
	@Test
	public void logintestCase_04() {
		System.out.println("Buscando que el titulo sea igual");
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void logintestCase_05() {
		System.out.println("Buscando que el titulo sea igual");
		Assert.assertTrue(false);
	}
	
}

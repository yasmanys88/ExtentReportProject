package com.google.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.qa.pages.HomePage;

public class HomeTest extends BaseTest{
HomePage home;

public HomeTest() {
	home= new HomePage();
}
	
@Test
public void hometestCase() {
	home.pagina();
	Assert.assertTrue(true);
}
	
@Test
public void hometestCase02() {
	home.pagina();
	Assert.assertTrue(false);
}
@Test
public void hometestCase03() {
	home.pagina();
	Assert.assertTrue(true);
}


}

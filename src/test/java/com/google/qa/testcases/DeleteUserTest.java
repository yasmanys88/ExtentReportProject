package com.google.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.qa.pages.DeleteUserPage;

public class DeleteUserTest extends BaseTest{
DeleteUserPage delet;

public DeleteUserTest() {
	delet= new DeleteUserPage();
}

@Test
public void deleteTest() {
	delet.paginaeliminar();
	Assert.assertTrue(true);
}

@Test
public void deleteTestCase() {
	delet.paginaeliminar();
	Assert.assertTrue(true);
}

@Test
public void deletesomeTest() {
	delet.paginaeliminar();
	Assert.assertTrue(false);
}


}

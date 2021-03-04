package com.google.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.qa.pages.CreateUserPage;

public class CreateUserTest extends BaseTest{
CreateUserPage create;

public CreateUserTest() {
	create= new CreateUserPage();
}
@Test
public void createTest() {
	create.pagetitle();
	Assert.assertTrue(true);
}

@Test
public void createTestCase() {
	create.title();
	Assert.assertTrue(true);
}

@Test
public void createsomeTest() {
	create.pagetitle();
	Assert.assertTrue(false);
}

@Test
public void createsomeTest02() {
	create.title();
	Assert.assertTrue(false);
}
	
	
	
}

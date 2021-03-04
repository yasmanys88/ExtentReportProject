package com.google.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.google.qa.listeners.ExtentReportListener;


@Listeners(ExtentReportListener.class)
public class BaseTest {	
	
	@BeforeClass
	public void AntesdeLaClase() {
		System.out.println("Leemos la configuracion");
	}
	
	
	@AfterClass
	public void depuesdeLaClase() {
		System.out.println("Metodo despues de cada clase");
	}
	
	@BeforeTest
	public void AntesdelTest() {
		System.out.println("Metodo antes de cada Test Case");
	}
	
	@AfterTest
	public void despuesdelTest() {
		System.out.println("Metodo depues de cada Test Case");
	}
	
	@BeforeMethod
	public void AntesdelMethodo() {
		System.out.println("Esto se ejecuta antes del metodo");
	}
	
	@AfterMethod
	public void despuesdelMetodo() {
		System.out.println("Se ejecuta despues de cada metodo");
	}
	
	
}

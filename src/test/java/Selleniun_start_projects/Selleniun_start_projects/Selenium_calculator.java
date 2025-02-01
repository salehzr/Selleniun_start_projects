package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;
public class Selenium_calculator {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String url="https://testpages.eviltester.com/styled/apps/calculator.html";
		      browser.get(url);
		
	  }
	 
	 private void enterTriangleSides(String a, String b, String c) {
	        browser.findElement(By.id("side1")).sendKeys(a);
	        browser.findElement(By.id("side2")).sendKeys(b);
	        browser.findElement(By.id("side3")).sendKeys(c);
	    }

	    private void verifySamePage() {
	        String currentPage = browser.getCurrentUrl();
	        browser.findElement(By.id("identify-triangle-action")).click();
	        assertEquals(currentPage, browser.getCurrentUrl());
	    }

	    @Test
	    public void testEquilateralTriangle() {
	        enterTriangleSides("10.0", "10.0", "10.0");
	        verifySamePage();
	    }

	    @Test
	    public void testInvalidTriangle() {
	        enterTriangleSides("1.0", "2.0", "3.0");
	        verifySamePage();
	    }

	    @Test
	    public void testIsoscelesTriangle() {
	        enterTriangleSides("5.0", "5.0", "8.0");
	        verifySamePage();
	    }

	    @Test
	    public void testIsoscelesTriangle2() {
	        enterTriangleSides("9.0", "7.0", "9.0");
	        verifySamePage();
	    }

	    @Test
	    public void testAnotherInvalidTriangle() {
	        enterTriangleSides("4.0", "4.0", "10.0");
	        verifySamePage();
	    }

	    @Test
	    public void testAnotherEquilateralTriangle() {
	        enterTriangleSides("12.0", "12.0", "12.0");
	        verifySamePage();
	    }
				
				
}
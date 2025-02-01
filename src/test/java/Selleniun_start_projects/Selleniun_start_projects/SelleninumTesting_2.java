package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelleninumTesting_2 {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		
	  }
		
	 @Test
	    public void testCase_1() {
	        validateInput("ABc123*");
	    }

	    @Test
	    public void testCase_2() {
	        validateInput("XYz@987");
	    }

	    @Test
	    public void testCase_3() {
	        validateInput("QWE$456");
	    }

	    @Test
	    public void testCase_4() {
	        validateInput("R*re789");
	    }

	    @Test
	    public void testCase_5() {
	        validateInput("UIO&012");
	    }

	    @Test
	    public void testCase_6() {
	        validateInput("PAs*345");
	    }

	    @Test
	    public void testCase_7() {
	        validateInput("DfG*678");
	    }

	    @Test
	    public void testCase_8() {
	        validateInput("HJK(901");
	    }

	    @Test
	    public void testCase_9() {
	        validateInput("LZX)234");
	    }

	    @Test
	    public void testCase_10() {
	        validateInput("CVB+567");
	    }

	    private void validateInput(String input) {
	        WebElement textBox = browser.findElement(By.name("characters"));
	        textBox.sendKeys(input);
	        String currentPage = browser.getCurrentUrl();
	        browser.findElement(By.name("validate")).click();
	        String newPage = browser.getCurrentUrl();
	        assertNotEquals("כתובת ה-URL אמורה להשתנות אחרי לחיצה על validate", currentPage, newPage);
	    }

}

package com.jenkins.tests.JenkinsTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   @BeforeTest
   public void startBrowser() {
	   App.initBrowser();
   }
   @AfterTest
   public void closeBrowser() {
	   App.terminateBrowser();
   }
   @org.testng.annotations.Test
   public void testtrue() {
	   Assert.assertEquals(true, true);
   }
//     @org.testng.annotations.Test
//     public void loadAmazonHomePage()
//     {
//     	final String siteUrl = "https://www.amazon.in/";
//     	WebDriver driver = RunEnvironment.getWebDriver();
//     	driver.get(siteUrl);
//     }
}

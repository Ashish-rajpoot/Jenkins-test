package com.jenkins.tests.JenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void initBrowser()
	    {
	        WebDriver driver;
	        final String driverPath = "/home/Ubuntu/Driver/geckodriver";
	        final String setDriverStrin = "webdriver.gecko.driver";
	        System.setProperty(driverPath, setDriverStrin);
	        driver = new ChromeDriver();
	        RunEnvironment.setWebDriver(driver);
	    }
	    public static void terminateBrowser() {
	    	RunEnvironment.getWebDriver().quit();
	    }
}

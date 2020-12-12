package com.jenkins.tests.JenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void initBrowser()
	    {
	        WebDriver driver;
	        final String driverPath = "/home/ubuntu/Drivers/geckodriver";
	        final String setDriverStrin = "webdriver.gecko.driver";
	        System.setProperty(setDriverStrin,driverPath);
	        driver = new FirefoxDriver();
	        RunEnvironment.setWebDriver(driver);
	    }
	    public static void terminateBrowser() {
	    	RunEnvironment.getWebDriver().quit();
	    }
}

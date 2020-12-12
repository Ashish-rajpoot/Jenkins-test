package com.jenkins.tests.JenkinsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import okhttp3.OkHttpClient;

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
	        OkHttpClient OkHttpClient = new OkHttpClient().newBuilder().connectTimeout(100, TimeUnit.SECONDS)
	        		.build();
	        driver = new FirefoxDriver();
	        RunEnvironment.setWebDriver(driver);
	    }
	    public static void terminateBrowser() {
	    	RunEnvironment.getWebDriver().quit();
	    }
}

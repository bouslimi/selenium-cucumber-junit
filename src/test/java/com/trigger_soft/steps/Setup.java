package com.trigger_soft.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Setup {
	public static WebDriver driver;

	// Common Setup Steps

	@BeforeAll
	public static void beforeAllSetup() {
		WebDriverManager.chromedriver().setup();
	}

	@Before
	public void beforeEachSetup() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		System.out.println("DRIVER : " + driver.toString());
	}

	@After
	public void afterEachSetup() {
		if (driver != null) {
			driver.quit();
		}
	}

	@AfterAll
	public static void afterAllSetup() {
		if (driver != null) {
			driver.quit();
		}
	}

}

package com.Flowmono.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Flowmono.pages.LoginPage;

public class LoginPageTest {
	
	WebDriver driver;
    LoginPage loginPage;
	
	@BeforeMethod 
	public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.flowmono.com/login");
	}
	
	@Test
	public void verifyLogo() {
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);		
	}
	
	@Test
	public void verifyLogin() {
		loginPage.login();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.flowmono.com/login";
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

		

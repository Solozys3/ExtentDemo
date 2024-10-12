package com.Flowmono.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By username = By.id("mat-input-0");
	By password = By.id("mat-input-1");
	By LoginBtn = By.xpath("//button[contains(text(),'Login')]");
	By logo = By.xpath("//*[@id=\"login\"]/div[2]/div/div/div[1]/a/img");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public boolean validateLogo() {
		driver.findElement(logo).isDisplayed();
		return true;
	}
	
	public void login() {
		
		driver.findElement(username).sendKeys("solomon.sunday@reventtechnologies.com");
		driver.findElement(password).sendKeys("Solomonsunday@3");
		driver.findElement(LoginBtn).click();
		
	}
}

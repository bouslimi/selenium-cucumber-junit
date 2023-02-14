package com.trigger_soft.objectrepo;

import com.trigger_soft.generic.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends GenericMethods {

    private final By emailInputLocator = By.id("email");
    private final By passwordInputLocator = By.id("password");
    private final By loginButtonLocator = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
        driver.switchTo().defaultContent();
    }

    public void login(String email, String password) {
        driver.findElement(emailInputLocator).clear();
        driver.findElement(emailInputLocator).sendKeys(email);
        driver.findElement(passwordInputLocator).clear();
        driver.findElement(passwordInputLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
    }

}

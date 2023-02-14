package com.trigger_soft.objectrepo;

import com.trigger_soft.generic.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends GenericMethods {
    private final By titleH1Locator = By.xpath("//main/h1");

    public HomePage(WebDriver driver) {
        super(driver);
        driver.switchTo().defaultContent();
    }

    public String getTitleText() {
        WebElement titleH1Element = waitForVisibilityOfElementLocatedBy(titleH1Locator);
        return titleH1Element.getText();
    }

}

package com.trigger_soft.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class GenericMethods {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor jsExecutor;

    public GenericMethods() {
    }

    public GenericMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Constants.EXPLICIT_TIMEOUT);
        jsExecutor = (JavascriptExecutor) driver;
    }

    public WebElement waitForVisibilityOfElementLocatedBy(By locator, Duration... timeoutInSeconds) {
        if (timeoutInSeconds.length > 0) {
            return (new WebDriverWait(driver, timeoutInSeconds[0]))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public Boolean waitForInvisibilityOfElementLocatedBy(By locator, Duration... timeoutInSeconds) {
        if (timeoutInSeconds.length > 0) {
            return (new WebDriverWait(driver, timeoutInSeconds[0]))
                    .until(ExpectedConditions.invisibilityOfElementLocated(locator));
        }
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public WebElement waitForVisibilityOfElement(WebElement element, Duration... timeoutInSeconds) {
        if (timeoutInSeconds.length > 0) {
            return (new WebDriverWait(driver, timeoutInSeconds[0])).until(ExpectedConditions.visibilityOf(element));
        }
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public Boolean waitForInvisibilityOfElement(WebElement element, Duration... timeoutInSeconds) {
        if (timeoutInSeconds.length > 0) {
            return (new WebDriverWait(driver, timeoutInSeconds[0])).until(ExpectedConditions.invisibilityOf(element));
        }
        return wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForPageToLoad() {
        wait.until((ExpectedCondition<Boolean>) wd -> {
            assert wd != null;
            return ((JavascriptExecutor) wd)
                    .executeScript("return document.readyState").equals("complete");
        });
    }

    public void pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollIntoViewOfElement(WebElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getOSName() {
        return System.getProperty("os.name");
    }

    public Boolean isLinuxOS() {
        return getOSName().contains("nux");
    }

    public Boolean isWindowsOS() {
        return getOSName().contains("win");
    }

    public Boolean isMacOS() {
        return getOSName().contains("mac");
    }

    public String getBrowserNameAndVersion() {
        Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
        return capabilities.getBrowserName() + "-" + capabilities.getBrowserVersion();
    }

}

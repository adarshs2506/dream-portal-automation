package tests;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.ScreenshotUtil;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePage() {

        driver.get("https://arjitnigam.github.io/myDreams/index.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(),'My Dreams')]")
        ));

        // 📸 Screenshot 1
        ScreenshotUtil.takeScreenshot(driver, "home_page");

        // store old tab
        String parent = driver.getWindowHandle();

        // click
        driver.findElement(By.xpath("//*[contains(text(),'My Dreams')]")).click();

        // wait for new tab
        wait.until(driver -> driver.getWindowHandles().size() > 1);

        // switch to new tab
        Set<String> tabs = driver.getWindowHandles();

        for (String tab : tabs) {
            if (!tab.equals(parent)) {
                driver.switchTo().window(tab);
            }
        }

        // wait page load
        wait.until(ExpectedConditions.urlContains("dreams"));

        // 📸 Screenshot 2 (NOW WORKS)
        ScreenshotUtil.takeScreenshot(driver, "home_validated");

        // verify
        Assert.assertTrue(driver.getCurrentUrl().contains("dreams"));
    }
}
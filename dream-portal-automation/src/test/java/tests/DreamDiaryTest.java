package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DiaryPage;
import utils.ScreenshotUtil;

public class DreamDiaryTest extends BaseTest {

    @Test
    public void verifyDiary() {

        driver.get("https://arjitnigam.github.io/myDreams/dreams-diary.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr")));

        // 📸 SCREENSHOT HERE (after page load)
        ScreenshotUtil.takeScreenshot(driver, "diary_page");

        DiaryPage diary = new DiaryPage(driver);

        List<WebElement> rows = diary.getRows();

        Assert.assertEquals(rows.size(), 10);

        for (WebElement row : rows) {

            String type = row.findElement(By.xpath("./td[3]")).getText();

            Assert.assertTrue(type.equals("Good") || type.equals("Bad"));
        }

        // 📸 FINAL SCREENSHOT AFTER VALIDATION
        ScreenshotUtil.takeScreenshot(driver, "diary_validated");
    }
}
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SummaryPage;
import utils.ScreenshotUtil;

public class DreamSummaryTest extends BaseTest {

    @Test
    public void verifySummary() {

        driver.get("https://arjitnigam.github.io/myDreams/dreams-total.html");

        SummaryPage page = new SummaryPage(driver);

        String good = page.getValue("Good Dreams");
        String bad = page.getValue("Bad Dreams");
        String total = page.getValue("Total Dreams");
        String recurring = page.getValue("Recurring Dreams");

        // 📸 Screenshot BEFORE validation (optional)
        ScreenshotUtil.takeScreenshot(driver, "summary_page");

        Assert.assertEquals(good, "6");
        Assert.assertEquals(bad, "4");
        Assert.assertEquals(total, "10");
        Assert.assertEquals(recurring, "2");

        // 📸 Screenshot AFTER validation (important)
        ScreenshotUtil.takeScreenshot(driver, "summary_validated");
    }
}
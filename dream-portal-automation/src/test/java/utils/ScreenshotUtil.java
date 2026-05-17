package utils;

import java.io.File;
import org.openqa.selenium.*;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String name) {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String path = System.getProperty("user.dir")
                + "/screenshots/" + name + ".png";

        File dest = new File(path);

        src.renameTo(dest);

        System.out.println("Screenshot saved: " + path);
    }
}
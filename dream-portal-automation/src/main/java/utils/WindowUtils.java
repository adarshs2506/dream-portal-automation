package utils;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class WindowUtils {

    public static void switchToNewWindow(WebDriver driver) {

        String main = driver.getWindowHandle();

        Set<String> all = driver.getWindowHandles();

        for (String win : all) {
            if (!win.equals(main)) {
                driver.switchTo().window(win);
            }
        }
    }

    public static void switchBack(WebDriver driver, String main) {
        driver.switchTo().window(main);
    }
}
package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiaryPage {

    WebDriver driver;

    public DiaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getRows() {
        return driver.findElements(By.xpath("//table/tbody/tr"));
    }
}
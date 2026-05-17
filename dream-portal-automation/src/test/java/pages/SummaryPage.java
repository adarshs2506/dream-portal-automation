package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPage {

    WebDriver driver;

    public SummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getValue(String label) {
        return driver.findElement(By.xpath("//td[contains(text(),'" + label + "')]/following-sibling::td"))
                     .getText();
    }
}
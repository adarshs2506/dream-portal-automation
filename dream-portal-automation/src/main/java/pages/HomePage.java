package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By myDreams = By.xpath("//*[contains(text(),'My Dreams')]");

    public void open() {
        driver.get("https://arjitnigam.github.io/myDreams/index.html");
    }

    public void clickMyDreams() {
        driver.findElement(myDreams).click();
    }
}
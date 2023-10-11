package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_HomePage {
    //ToDo: define locators
    private final By UserProfile = By.xpath("//li[@class='oxd-userdropdown']");

    WebDriver driver;

    //ToDo: define driver
    public P02_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public boolean CheckProfilePage() {
        return driver.findElement(this.UserProfile).isDisplayed();
    }
}
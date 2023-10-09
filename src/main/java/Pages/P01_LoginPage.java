package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LoginPage {

    //ToDo: define locators
    private final By Username = By.name("username");
    private final By Password = By.name("password");
    private final By LoginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    private final By ValidationMessage = By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]");
    WebDriver driver;

    //ToDo: define driver
    public P01_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public P01_LoginPage EnterUsername(String email) {
        driver.findElement(this.Username).sendKeys(email);
        return this;
    }

    public P01_LoginPage enterPassword(String Password) {
        driver.findElement(this.Password).sendKeys(Password);
        return this;
    }

    public P01_LoginPage clickLoginButton() {
        driver.findElement(this.LoginButton).click();
        return this;
    }

    public boolean ValidationMessage() {
        return driver.findElement(this.ValidationMessage).getText().equals("Invalid credentials");
    }
}
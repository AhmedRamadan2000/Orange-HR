package testcases;

import Pages.P01_LoginPage;
import Pages.P02_HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.Utilities;

import java.util.concurrent.TimeUnit;

import static utility.Utilities.softAssert;

public class TC01_LoginPage extends TestBase {
    //define test data
    static String Username = Utilities.getExcelData(1, 0, "Sheet1");
    static String Password = Utilities.getExcelData(1, 1, "Sheet1");


    //ToDo: create test case to check login with valid emila nad password
    @Test(priority = 1)
    public void loginWithValidUsernameAndValidPassword_P() throws Exception {
        new P01_LoginPage(driver).EnterUsername(Username).enterPassword(Password).clickLoginButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "ValidLoginImage");
//        SoftAssert.assertTrue(new P02_HomePage(driver).CheckProfilePage());
        softAssert.assertTrue(new P02_HomePage(driver).CheckProfilePage());
    }

    //Negative test cases
    @Test(priority = 2)
    public void loginWithValidEmailAndInvalidPassword_N() {
        Password = "dsfsd";
        //ToDo: Login with invalid mail and invalid password
        new P01_LoginPage(driver).EnterUsername(Username).enterPassword(Password).clickLoginButton();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "InvalidPasswordImage");
        Assert.assertTrue(new P01_LoginPage(driver).ValidationMessage());
    }

    @Test(priority = 3)
    public void loginWithInvalidEmailAndValidPassword_N() {

        Username = "djdd";
        //ToDo: Login with invalid mail and invalid password
        new P01_LoginPage(driver).EnterUsername(Username).enterPassword(Password).clickLoginButton();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "InvalidUsernameImage");
        Assert.assertTrue(new P01_LoginPage(driver).ValidationMessage());
    }

    @Test(priority = 4)
    public void loginWithInvalidEmailAndInvalidPassword_N() {
        Username = "djdd";
        Password = "dsfsd";
        //ToDo: Login with invalid mail and invalid password
        new P01_LoginPage(driver).EnterUsername(Username).enterPassword(Password).clickLoginButton();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "invalidUsernameAndPasswordImage");
        Assert.assertTrue(new P01_LoginPage(driver).ValidationMessage());
    }
}
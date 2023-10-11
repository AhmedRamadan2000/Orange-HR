package testcases;

import Pages.P01_LoginPage;
import Pages.P02_HomePage;
import Pages.P03_NavigateBetweenPages;
import org.testng.annotations.Test;
import utility.Utilities;

import java.util.concurrent.TimeUnit;

import static testcases.TC01_LoginPage.Password;
import static testcases.TC01_LoginPage.Username;
import static utility.Utilities.softAssert;

public class TC03NavigateBetweenPagesTests extends TestBase {

    //ToDo: create test case to check login with valid emila nad password
    @Test(priority = 1)
    public void NavigateToAllPages_P() {
        new P01_LoginPage(driver).EnterUsername(Username).enterPassword(Password).clickLoginButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "ValidLoginImage");
        softAssert.assertTrue(new P02_HomePage(driver).CheckProfilePage());

        new P03_NavigateBetweenPages(driver).ClickOnAdminTab();
        Utilities.Capturescreenshots(driver, "AdminPage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).systemUserPage());

        new P03_NavigateBetweenPages(driver).ClickOnPimTab();
        Utilities.Capturescreenshots(driver, "PimPage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).employeeInformationTable());

        new P03_NavigateBetweenPages(driver).ClickOnLeaveTab();
        Utilities.Capturescreenshots(driver, "LeaveListPage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).leaveListTable());

        new P03_NavigateBetweenPages(driver).ClickOnTimeTab();
        Utilities.Capturescreenshots(driver, "TimePage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).selectEmployeeTable());

        new P03_NavigateBetweenPages(driver).ClickOnRecruitmentTab();
        Utilities.Capturescreenshots(driver, "RecruitmentPage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).recruitmentPage());

        new P03_NavigateBetweenPages(driver).ClickOnMyInfoTab();
        Utilities.Capturescreenshots(driver, "MyInfoPage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).profileImage());

        new P03_NavigateBetweenPages(driver).ClickOnPerformanceTab();
        Utilities.Capturescreenshots(driver, "PerformancePage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).employeeReviewTable());

        new P03_NavigateBetweenPages(driver).ClickOnDashboardTab();
        Utilities.Capturescreenshots(driver, "DashboardPage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).dashboardPage());

        new P03_NavigateBetweenPages(driver).ClickOnDirectoryTab();
        Utilities.Capturescreenshots(driver, "DirectoryPage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).directoryPage());

        new P03_NavigateBetweenPages(driver).ClickOnMaintenanceTab();
        Utilities.Capturescreenshots(driver, "MaintenancePage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).administrationPage());
        driver.navigate().back();

        new P03_NavigateBetweenPages(driver).ClickOnClaimTab();
        Utilities.Capturescreenshots(driver, "ClaimPage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).employeeClaimPage());

        new P03_NavigateBetweenPages(driver).ClickOnBuzzTab();
        Utilities.Capturescreenshots(driver, "BuzzPage");
        softAssert.assertTrue(new P03_NavigateBetweenPages(driver).buzzPage());
    }
}
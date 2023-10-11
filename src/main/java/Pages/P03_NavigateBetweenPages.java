package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_NavigateBetweenPages {
    //ToDo: define locators
    private final By adminTab = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    private final By systemUserPage = By.xpath("//div[h5]");
    private final By pimTab = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
    private final By employeeInformationTable = By.xpath("//div[h5]");
    private final By leaveTab = By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']");
    private final By leaveListTable = By.xpath("//div[h5]");
    private final By timeTab = By.xpath("//a[@href='/web/index.php/time/viewTimeModule']");
    private final By selectEmployeeTable = By.xpath("//div[@class='orangehrm-card-container']");
    private final By recruitmentTab = By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']");
    private final By recruitmentPage = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");
    private final By myInfoTab = By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']");
    private final By profileImage = By.xpath("//img[@class=\"employee-image\"]");
    private final By performanceTab = By.xpath("//a[@href='/web/index.php/performance/viewPerformanceModule']");
    private final By employeeReviewTable = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");
    private final By dashboardTab = By.xpath("//a[@href='/web/index.php/dashboard/index']");
    private final By dashboardPage = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    private final By directoryTab = By.xpath("//a[@href='/web/index.php/directory/viewDirectory']");
    private final By directoryPage = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    private final By maintenanceTab = By.xpath("//a[@href='/web/index.php/maintenance/viewMaintenanceModule']");
    private final By administrationPage = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-admin-access-title']");
    private final By ClaimTab = By.xpath("//a[@href='/web/index.php/claim/viewClaimModule']");
    private final By employeeClaimPage = By.xpath("//h5[@class=\"oxd-text oxd-text--h5 oxd-table-filter-title\"]");
    private final By BuzzTab = By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']");
    private final By buzzPage = By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-text--card-title orangehrm-buzz-newsfeed-title\"]");

    WebDriver driver;

    //ToDo: define driver
    public P03_NavigateBetweenPages(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public P03_NavigateBetweenPages ClickOnAdminTab() {
        driver.findElement(this.adminTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnPimTab() {
        driver.findElement(this.pimTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnLeaveTab() {
        driver.findElement(this.leaveTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnTimeTab() {
        driver.findElement(this.timeTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnRecruitmentTab() {
        driver.findElement(this.recruitmentTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnMyInfoTab() {
        driver.findElement(this.myInfoTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnPerformanceTab() {
        driver.findElement(this.performanceTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnDashboardTab() {
        driver.findElement(this.dashboardTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnDirectoryTab() {
        driver.findElement(this.directoryTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnMaintenanceTab() {
        driver.findElement(this.maintenanceTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnClaimTab() {
        driver.findElement(this.ClaimTab).click();
        return this;
    }

    public P03_NavigateBetweenPages ClickOnBuzzTab() {
        driver.findElement(this.BuzzTab).click();
        return this;
    }

    public boolean systemUserPage() {
        return driver.findElement(this.systemUserPage).isDisplayed();
    }

    public boolean employeeInformationTable() {
        return driver.findElement(this.employeeInformationTable).isDisplayed();
    }

    public boolean selectEmployeeTable() {
        return driver.findElement(this.selectEmployeeTable).isDisplayed();
    }

    public boolean recruitmentPage() {
        return driver.findElement(this.recruitmentPage).isDisplayed();
    }
    public boolean leaveListTable() {
        return driver.findElement(this.leaveListTable).isDisplayed();
    }
    public boolean profileImage() {
        return driver.findElement(this.profileImage).isDisplayed();
    }

    public boolean employeeReviewTable() {
        return driver.findElement(this.employeeReviewTable).isDisplayed();
    }

    public boolean dashboardPage() {
        return driver.findElement(this.dashboardPage).isDisplayed();
    }

    public boolean directoryPage() {
        return driver.findElement(this.directoryPage).isDisplayed();
    }

    public boolean administrationPage() {
        return driver.findElement(this.administrationPage).isDisplayed();
    }

    public boolean employeeClaimPage() {
        return driver.findElement(this.employeeClaimPage).isDisplayed();
    }

    public boolean buzzPage() {
        return driver.findElement(this.buzzPage).isDisplayed();
    }
}

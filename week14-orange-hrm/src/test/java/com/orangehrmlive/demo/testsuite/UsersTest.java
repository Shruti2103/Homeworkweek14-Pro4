package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsersTest extends TestBase {
    AddUserPage addUserPage;
    AdminPage adminPage;
    DashboardPage dashboardPage;
    HomePage homePage;
    LoginPage loginPage;
    ViewSystemUserPage viewSystemUserPage;

    @BeforeMethod
    public void inIt() {
        addUserPage = new AddUserPage();
        adminPage = new AdminPage();
        dashboardPage = new DashboardPage();
        homePage = new HomePage();
        loginPage = new LoginPage();
        viewSystemUserPage = new ViewSystemUserPage();


    }

    @Test(groups = {"sanity", "snoke", "regression"})
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickloginButton();
        homePage.clickonadmin();
        softAssert.assertEquals(viewSystemUserPage.varifysystemuserText(), "System Users", "Not navigate to system");
        viewSystemUserPage.clickonaddbutton();
        softAssert.assertEquals(addUserPage.addUserTxtvarify(), "Add User", "not navigate to page");
        Thread.sleep(2000);
        addUserPage.selectfromuserRoledroppdown("Admin");
        addUserPage.setployeeName("Ananya Dash");
        addUserPage.setuserName("Govinda");
        addUserPage.selectfromstatusrdroppdown("Disabled");
        addUserPage.setPassword("prime123");
        addUserPage.setConfirmPassword("prime123");
        addUserPage.clickonsavebutton();


    }

    @Test(groups = {"smoke", "regression"})
    public void searchTheUserCreatedAndVerifyIt() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickloginButton();
        homePage.clickonadmin();
        softAssert.assertEquals(viewSystemUserPage.varifysystemuserText(), "System Users", "Not navigate to system");
        viewSystemUserPage.setuserName("Govinda");
        viewSystemUserPage.selectfromuserdroppdown("Admin");
        viewSystemUserPage.selectstatusdroppdown("Disabled");
        viewSystemUserPage.clickonsearchbutton();

    }

    @Test(groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickloginButton();
        homePage.clickonadmin();
        softAssert.assertEquals(viewSystemUserPage.varifysystemuserText(), "System Users", "Not navigate to system");
        viewSystemUserPage.setuserName("Govinda");
        viewSystemUserPage.selectfromuserdroppdown("Admin");
        viewSystemUserPage.selectstatusdroppdown("Disabled");
        viewSystemUserPage.clickonsearchbutton();
        viewSystemUserPage.clickoncheckbox();


    }

    @Test(groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickloginButton();
        homePage.clickonadmin();
        softAssert.assertEquals(viewSystemUserPage.varifysystemuserText(), "System Users", "Not navigate to system");
        viewSystemUserPage.setuserName("Govinda");
        viewSystemUserPage.selectfromuserdroppdown("Admin");
        viewSystemUserPage.selectstatusdroppdown("Disabled");
        viewSystemUserPage.clickonsearchbutton();
        softAssert.assertEquals(viewSystemUserPage.verifyNoRecordsFound(), "No Records Found", "Not navigate to page");


    }


}

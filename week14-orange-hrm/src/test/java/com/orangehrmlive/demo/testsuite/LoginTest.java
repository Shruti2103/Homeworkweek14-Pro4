package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
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

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldLoginSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickloginButton();
        softAssert.assertEquals(loginPage.verifyWelcomeText().substring(1, 7), "WelCome", "not navigate to page");


    }

    @Test(groups = {"smoke","regression"})
    public void verifyThatTheLogoDisplayOnHomePage() {


        SoftAssert softAssert = new SoftAssert();
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickloginButton();
    //     softAssert.assertEquals(loginPage.logovarify(),"Logo","logo not display");

    }

    @Test(groups = {"regression"})
    public void erifyUserShouldLogOutSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickloginButton();
         loginPage.clickonuserprofilelogo();
         loginPage.clickonlogout();
     //   softAssert.assertEquals(loginPage.loginpanalvarrify(),"Login Pane","not navigate to page");

    }


}

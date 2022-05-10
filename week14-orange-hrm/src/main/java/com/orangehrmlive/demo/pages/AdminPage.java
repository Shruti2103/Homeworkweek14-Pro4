package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//UserManagement, Job, Organization Tabs Locators and it's actions
public class AdminPage extends Utility {
    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    // UserManagement clcik
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagementclick;

    public void clickonuserManagement() {
        Reporter.log("Clicking on user Management click click"+ userManagementclick.toString()+ "<br>");
        clickOnElement(userManagementclick);
    }

    //Job
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement job;

    public void clickonjob() {
        Reporter.log("Clicking on job "+ job.toString()+ "<br>");
        clickOnElement(job);
    }


    //Organization Tabs
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement organizationtabs;

    public void clickonorganizationtabs() {
        Reporter.log("Clicking on organization tabs "+ organizationtabs.toString()+ "<br>");
        clickOnElement(organizationtabs);
    }


}

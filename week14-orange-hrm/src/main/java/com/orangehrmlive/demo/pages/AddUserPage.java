package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//User Role Drop Down, Employee Name, Username, Status Drop Down,
//Password, Confirm Password,
//Save and Cancle Button Locators and it's actions
public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    // Add user Text varrify
    @FindBy(xpath = "//h1[contains(text(),'Add User')]")
    WebElement addUserTxt;

    public String addUserTxtvarify() {
        Reporter.log("getting add Usertext from "+addUserTxt.toString()+"<br>");
        return getTextFromElement(addUserTxt);
    }


    //User Role Drop Down
    @FindBy(id = "systemUser_userType")
    WebElement userRole;

    public void selectfromuserRoledroppdown(String text) {
        Reporter.log("Selecting day"+text+" from dropdown "+userRole.toString() + "<br>");
       selectByVisibleTextFromDropDown(userRole, text);
    }


    //Employee Name
    @FindBy(id = "systemUser_employeeName_empName")
    WebElement employeeName;

    public void setployeeName(String name) {
        Reporter.log("Enter email"+name+ " to email field "+employeeName.toString() + "<br>");
        sendTextToElement(employeeName, name);
    }


    //Username
    @FindBy(id = "systemUser_userName")
    WebElement userName;

    public void setuserName(String name) {
        Reporter.log("Enter email"+name+ " to email field "+userName.toString() + "<br>");
        sendTextToElement(userName, name);
    }


    //Status Drop Down
    @FindBy(id = "systemUser_status")
    WebElement status;

    public void selectfromstatusrdroppdown(String text) {
        Reporter.log("Selecting day"+text+" from dropdown "+status.toString() + "<br>");
        selectByVisibleTextFromDropDown(status, text);
    }


    //Password
    @FindBy(id = "systemUser_password")
    WebElement password;

    public void setPassword(String name) {
        Reporter.log("Enter email"+name+ " to email field "+password.toString() + "<br>");
        sendTextToElement(password, name);
    }


    // Confirm Password
    @FindBy(id = "systemUser_confirmPassword")
    WebElement confirmPassword;

    public void setConfirmPassword(String name) {
        Reporter.log("Enter email"+name+ " to email field "+confirmPassword.toString() + "<br>");
        sendTextToElement(confirmPassword, name);
    }


    // save button
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveBtn;

    public void clickonsavebutton() {
        Reporter.log("Clicking on save Btn "+ saveBtn.toString()+ "<br>");
        clickOnElement(saveBtn);
    }


    // cancel button
    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancelBtn;

    public void clickoncancelbutton() {
        Reporter.log("Clicking on cancel Btn"+ cancelBtn.toString()+ "<br>");
        clickOnElement(cancelBtn);
    }


}

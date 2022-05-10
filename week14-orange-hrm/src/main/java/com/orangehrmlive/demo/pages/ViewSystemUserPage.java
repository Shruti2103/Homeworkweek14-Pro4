package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//- System Users Text, Username Field, User Roll dropDown,
//Employee Name Field,
//Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and
//it's action
public class ViewSystemUserPage extends Utility {
    public ViewSystemUserPage() {
        PageFactory.initElements(driver, this);
    }

    // System Users Text
    @FindBy(xpath = "//a[contains(text(),'>')]")
    WebElement varrifysystemUsersText;

    public String varifysystemuserText() {
        Reporter.log("getting varrify system Users text from "+varrifysystemUsersText.toString()+"<br>");
        return getTextFromElement(varrifysystemUsersText);
    }


    //Username Field
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement username;

    public void setuserName(String name) {
        Reporter.log("Enter name "+name+ " to email field "+username.toString() + "<br>");
        sendTextToElement(username, name);
    }


    //User Roll dropDown
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userdroppdown;

    public void selectfromuserdroppdown(String text) {
        Reporter.log("Selecting day"+text+" from dropdown "+userdroppdown.toString() + "<br>");
        selectByVisibleTextFromDropDown(userdroppdown, text);
    }


    //Employee Name Field
    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement emplyeename;

    public void setemplyeeName(String name) {
        Reporter.log("Enter email"+name+ " to email field "+emplyeename.toString() + "<br>");
        sendTextToElement(emplyeename, name);
    }


    //Status Drop Down
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusdroppdown;

    public void selectstatusdroppdown(String text) {
        Reporter.log("Selecting day"+text+" from dropdown "+statusdroppdown.toString() + "<br>");
        selectByVisibleTextFromDropDown(statusdroppdown, text);
    }


    // Search Button
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement clickonsearchbutton;

    public void clickonsearchbutton() {
        Reporter.log("Clicking on search button "+ clickonsearchbutton.toString()+ "<br>");
        clickOnElement(clickonsearchbutton);
    }


    //Reset Button
    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement resetbutton;

    public void clickonresetbutton() {
        Reporter.log("Clicking on reset button"+ resetbutton.toString()+ "<br>");
        clickOnElement(resetbutton);
    }


    //Add Button
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addbutton;

    public void clickonaddbutton() {
        Reporter.log("Clicking on add button"+ addbutton.toString()+ "<br>");
        clickOnElement(addbutton);
    }


    //Delete Button
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deletebutton;

    public void clickondeletebutton() {
        Reporter.log("Clicking on delete button"+ deletebutton.toString()+ "<br>");
        clickOnElement(deletebutton);
    }

    //click on checkbox
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement checkboxclick;

    public void clickoncheckbox() {
        Reporter.log("Clicking on check box "+ checkboxclick.toString()+ "<br>");
        clickOnElement(checkboxclick);
    }

    //verify message "No Records Found"
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecordsfoundText;

    public String verifyNoRecordsFound() {
        Reporter.log("getting no Records found Text  from "+noRecordsfoundText.toString()+"<br>");
        return getTextFromElement(noRecordsfoundText);


    }
}
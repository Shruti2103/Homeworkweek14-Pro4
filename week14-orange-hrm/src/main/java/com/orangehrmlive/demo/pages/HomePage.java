package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Store OrangeHRM logo, Admin, PIM, Leave,Dashboard, Welcome Text
 * locatoresCreated by Jay Vaghani
 */
public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    // Store OrangeHRM logo
    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement orangeHrmLogo;
    public String hrmlogo(){
        Reporter.log("getting orange HrmLogo text from "+orangeHrmLogo.toString()+"<br>");
        return getTextFromElement(orangeHrmLogo);
    }



    //Admin
    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminLink;
    public void clickonadmin(){
        Reporter.log("Clicking on admin Link"+ adminLink.toString()+ "<br>");
        clickOnElement(adminLink);
    }


   //PIM
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement clickonPIM;
    public void setClickonPIM(){
        Reporter.log("Clicking on click on PIM"+ clickonPIM.toString()+ "<br>");
        clickOnElement(clickonPIM);
    }
    //Dashboard
    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement clickondashboard;
    public void clickonDashboard(){
        Reporter.log("Clicking on click on dashboard"+ clickondashboard.toString()+ "<br>");
        clickOnElement(clickondashboard);
    }

    //Welcome Text
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement verifywelcometext;
    public String welcometextvarify(){
        Reporter.log("getting verify welcome text from "+verifywelcometext.toString()+"<br>");
        return getTextFromElement(verifywelcometext);
    }




}

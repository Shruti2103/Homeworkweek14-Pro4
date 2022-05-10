package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * - Store usename, password, Login Button and LOGIN Panel text Locators
 * and create appropriate methods for it.
 */
public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);

    }

    //store username
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement username;

    public void setUsername(String name) {
        Reporter.log("Enter name "+name+ " to email field "+username.toString() + "<br>");
        sendTextToElement(username, name);
    }


    // store password
    @FindBy(id = "txtPassword")
    WebElement password;

    public void setPassword(String password1) {
        Reporter.log("Enter email"+password1+ " to email field "+password.toString() + "<br>");
        sendTextToElement(password, password1);
    }


    // login button
    @FindBy(id = "btnLogin")
    WebElement loginBtn;

    public void clickloginButton() {
        Reporter.log("Clicking on login Btn"+ loginBtn.toString()+ "<br>");
        clickOnElement(loginBtn);
    }


    // login button text
    @FindBy(xpath = "//div[text()='LOGIN Panel']")
    WebElement loginPanelTxt;

    public String varifyloginText() {
        Reporter.log("getting login Panel Txt text from "+loginPanelTxt.toString()+"<br>");
        return getTextFromElement(loginPanelTxt);
    }


    //Welcometext varrify
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;

    public String verifyWelcomeText() {
        Reporter.log("getting welcometext from "+welcomeText.toString()+"<br>");
        return getTextFromElement(welcomeText);
    }
    // varrify logo
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement varifylogo;
    public String logovarify(){
        Reporter.log("getting varify logo text from "+varifylogo.toString()+"<br>");
        return getTextFromElement(varifylogo);
    }
     //user profile logo
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement userprofilelogo;
    public void clickonuserprofilelogo(){
        Reporter.log("Clicking on use rprofile logo"+ userprofilelogo.toString()+ "<br>");
        clickOnElement(userprofilelogo);
    }
    //logoutclick
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement logout;
    public void clickonlogout(){
        Reporter.log("Clicking on logout"+ logout.toString()+ "<br>");
        clickOnElement(logout);

    }
   // varify login panal is displayed
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
     WebElement varifyloginpanal;
    public String loginpanalvarrify(){
        Reporter.log("getting varify loginpanal text from "+varifyloginpanal.toString()+"<br>");
       return getTextFromElement(varifyloginpanal);
    }






}

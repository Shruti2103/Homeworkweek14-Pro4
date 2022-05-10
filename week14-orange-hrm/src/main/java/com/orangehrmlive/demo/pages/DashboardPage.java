package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//Dashboard text Locator
//and create appropriate methods for it.
public class DashboardPage extends Utility {
    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    //Dashboard text Locator
    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement verifydashboardText;

    public String welcometextvarify() {
        Reporter.log("getting verify dashboard Text  from "+verifydashboardText.toString()+"<br>");
        return getTextFromElement(verifydashboardText);
    }


}

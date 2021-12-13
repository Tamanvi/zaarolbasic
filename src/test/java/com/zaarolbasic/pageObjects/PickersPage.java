package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.channels.Pipe;

public class PickersPage extends BusinessUtilities {
    public PickersPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Elements
    @FindBy(xpath = "//div[contains(text(),'Pickers')]")
    private WebElement pickersNav;

    @FindBy(xpath = "//span[contains(text(),'Pickers')]")
    private WebElement pickersBreadCrum;

    // Page Object Methods
    public void PickersPageCheck() throws InterruptedException {
        leftPaneNavigation(pickersNav);
        isDisplayed(pickersBreadCrum);
    }
}

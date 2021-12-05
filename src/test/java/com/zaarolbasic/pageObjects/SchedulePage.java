package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchedulePage extends BusinessUtilities {
    public SchedulePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //WebElements
    @FindBy(xpath = "//div[contains(text(),'Schedule')]")
    private WebElement scheduleNav;

    @FindBy(xpath = "//span[contains(text(),'Schedule')]")
    private WebElement scheduleBreadCrum;

    // PageObjects

    public void schedulePageCheck() throws InterruptedException {
        leftPaneNavigation(scheduleNav);
        isDisplayed(scheduleBreadCrum);
    }


}

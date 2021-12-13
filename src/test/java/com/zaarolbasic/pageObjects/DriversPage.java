package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriversPage extends BusinessUtilities {
    public DriversPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(text(),'Drivers')]")
    private WebElement driversNav;

    @FindBy(xpath = "//span[contains(text(),'Drivers')]")
    private WebElement driverBreadCrum;

    // PageObjects
    public void DriverPageCheck() throws InterruptedException {
        leftPaneNavigation(driversNav);
        isDisplayed(driverBreadCrum);
    }
}

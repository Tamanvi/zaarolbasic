package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BusinessUtilities {

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//div[contains(text(), 'Dashboard')]")
    private WebElement dashBoardNav;

    @FindBy(xpath = "//div[contains(text(), 'Total Customers Registered')]")
    private WebElement totalCxRegTile;


    //PageObjects

    public void dashboardPageCheck() {
        try {
            leftPaneNavigation(dashBoardNav);
            isDisplayed(totalCxRegTile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

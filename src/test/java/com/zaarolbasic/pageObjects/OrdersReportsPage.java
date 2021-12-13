package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersReportsPage extends BusinessUtilities {
    public OrdersReportsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // WebElements
    @FindBy(xpath = "//div[contains(text(),'Reports')]")
    private WebElement ordersReportsNav;

    @FindBy(xpath = "//span[contains(text(),'Reports')]")
    private WebElement ordersReportsBreadCrum;

    // Page Object Methods
    public void OrdersReportsPageCheck() throws InterruptedException {
        leftPaneNavigation(ordersReportsNav);
        isDisplayed(ordersReportsBreadCrum);
    }
}

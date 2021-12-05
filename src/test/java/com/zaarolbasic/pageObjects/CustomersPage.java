package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage extends BusinessUtilities {
    public CustomersPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // Elements
    @FindBy(xpath = "//div[contains(text(),'Customers')]")
    private WebElement customerNav;

    @FindBy(xpath = "//span[contains(text(),'Customers')]")
    private WebElement customerBreadCrum;

    //PageObjects Action class
    public void customerPageCheck() throws InterruptedException {
        leftPaneNavigation(customerNav);
        isDisplayed(customerBreadCrum);
    }

}

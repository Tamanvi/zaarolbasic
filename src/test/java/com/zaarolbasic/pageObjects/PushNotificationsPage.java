package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushNotificationsPage extends BusinessUtilities {
    public PushNotificationsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Elements
    @FindBy(xpath = "//div[contains(text(),'Push Notification')]")
    private WebElement pushNotificationsNav;

    @FindBy(xpath = "//span[contains(text(),'Push-Notification')]")
    private WebElement pushNotificationBreadCrum;

    // Page Object
    public void PushNotificationPageCheck() throws InterruptedException {
        leftPaneNavigation(pushNotificationsNav);
        isDisplayed(pushNotificationBreadCrum);
    }
}

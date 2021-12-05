package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvertisementsPage extends BusinessUtilities {
    public AdvertisementsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    // Elements
    @FindBy(xpath = "//div[contains(text(),'Advertisements')]")
    private WebElement advetisementsNav;

    @FindBy(xpath = "//span[contains(text(),'Advertisements')]")
    private WebElement advertisementsBreadCrum;

    //Page objects
    public void AdvertisementsPageCheck() throws InterruptedException {
        leftPaneNavigation(advetisementsNav);
        isDisplayed(advertisementsBreadCrum);
    }

}

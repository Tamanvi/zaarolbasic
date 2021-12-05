package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage extends BusinessUtilities {
    public SettingsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // Web elements
    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/section[1]/a[19]/div[2]")
    private WebElement settingsNav;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/h2[1]/section[1]/div[1]/span[3]/span[1]")
    private WebElement settingsBreadCrum;

    //  PageObjects
    public void SettingsPageCheck() throws InterruptedException {
        leftPaneNavigation(settingsNav);
        isDisplayed(settingsBreadCrum);
    }


}

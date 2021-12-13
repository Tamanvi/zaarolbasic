package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeoFencePage extends BusinessUtilities {
    public GeoFencePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //Elements
    @FindBy(xpath = "//div[contains(text(),'Geofence')]" )
    private WebElement geoFenceNav;

    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/h2[1]/section[1]/div[1]/span[3]/span[1]")
    private WebElement geoFenceBreadCrums;

    //Page Object Methods
    public void GeoFencePageCheck() throws InterruptedException {
        leftPaneNavigation(geoFenceNav);
        isDisplayed(geoFenceBreadCrums);
    }
}

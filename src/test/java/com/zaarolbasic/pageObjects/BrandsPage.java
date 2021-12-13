package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandsPage extends BusinessUtilities {
    public BrandsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Elements
    @FindBy(xpath = "//div[contains(text(),'Brands')]")
    private WebElement brandsNav;

    @FindBy(xpath = "//span[contains(text(),'Brands')]")
    private WebElement brandsBreadCrum;

    //PageObject action method
    public void brandsPageCheck() throws InterruptedException {
        leftPaneNavigation(brandsNav);
        isDisplayed(brandsBreadCrum);
    }
}

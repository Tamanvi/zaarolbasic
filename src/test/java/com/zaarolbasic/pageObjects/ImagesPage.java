package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImagesPage extends BusinessUtilities {
    public ImagesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    // Web Elements
    @FindBy(xpath = "//div[contains(text(),'Images')]")
    private WebElement imagesNav;

    @FindBy(xpath = "//span[contains(text(),'Images')]")
    private WebElement imagesBreadCrum;

    // PageObject Method
    public void ImagesPageCheck() throws InterruptedException {
        leftPaneNavigation(imagesNav);
        isDisplayed(imagesBreadCrum);
    }
}

package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoresPage extends BusinessUtilities {
    public StoresPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //WebElements
    @FindBy(xpath = "//div[contains(text(),'Stores')]")
    private WebElement storesNav;

    @FindBy(xpath = "//span[contains(text(),'Stores')]")
    private WebElement storeBreadCrum;

    //Page object methods
    public void StoresPageCheck() throws InterruptedException {
        leftPaneNavigation(storesNav);
        isDisplayed(storeBreadCrum);
    }
}

package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreCategoriesPage extends BusinessUtilities {
    public StoreCategoriesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Elements
    @FindBy(xpath = "//div[contains(text(),'Store Categories')]")
    private WebElement storeCategoriesNav;

    @FindBy(xpath = "//span[contains(text(),'Store-Categories')]")
    private WebElement storeCategoriesBreadCrum;

    // PageObject
    public void StoreCategoriesPageChecking() throws InterruptedException {
        leftPaneNavigation(storeCategoriesNav);
        isDisplayed(storeCategoriesBreadCrum);
    }

}

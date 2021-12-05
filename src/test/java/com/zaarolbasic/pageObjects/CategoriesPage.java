package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage extends BusinessUtilities {
    public CategoriesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Elements
    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/section[1]/a[6]/div[2]")
    private WebElement categoriesNav;

    @FindBy(xpath = "//span[contains(text(),'Categories')]")
    private WebElement categoriesBreadCrum;

    //PageObject action classes
    public void categoriesPageCheck() throws InterruptedException {
        leftPaneNavigation(categoriesNav);
        isDisplayed(categoriesBreadCrum);
    }
}

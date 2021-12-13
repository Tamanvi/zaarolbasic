package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BusinessUtilities {
    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Elements
    @FindBy(xpath = "//div[contains(text(),'Products')]")
    private WebElement productNav;

    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/h2[1]/section[1]/div[1]/span[3]/span[1]")
    private WebElement productBreadCrum;


    //PageObject action Method
    public void ProductPageCheck() throws InterruptedException {
        leftPaneNavigation(productNav);
        isDisplayed(productBreadCrum);
    }
}

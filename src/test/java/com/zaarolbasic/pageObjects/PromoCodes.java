package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromoCodes extends BusinessUtilities {
    public PromoCodes(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //WebElements
    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/section[1]/a[14]/div[2]")
    private WebElement promoCodesNav;

    // Active Page
    @FindBy(xpath = "//div[contains(text(),'Active')]")
    private WebElement promoCodeActiveNav;

    @FindBy(xpath = "//span[contains(text(),'Active')]")
    private WebElement promoCodeActiveBreadCrumb;

    // Inactive page
    @FindBy(xpath = "//div[contains(text(),'Inactive')]")
    private WebElement promoCodeInactiveNav;

    @FindBy(xpath = "//span[contains(text(),'In-Active')]")
    private WebElement promoCodeInactiveBreadCrumb;

    public void PromoCodesPageCheck() throws InterruptedException {
        // Promo codes page
        leftPaneNavigation(promoCodesNav);

        //Active page
        leftPaneNavigation(promoCodeActiveNav);
        isDisplayed(promoCodeActiveBreadCrumb);

        //Inactive page
        leftPaneNavigation(promoCodeInactiveNav);
        isDisplayed(promoCodeInactiveBreadCrumb);


    }

}

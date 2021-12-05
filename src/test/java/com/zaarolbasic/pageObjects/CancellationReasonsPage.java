package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancellationReasonsPage extends BusinessUtilities {
    public CancellationReasonsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //Elements
    @FindBy(xpath = "//div[contains(text(),'Cancellation Reasons')]")
    private WebElement cancellationReasonsNav;

    @FindBy(xpath = "//span[contains(text(),'Cancellation-Reasons')]")
    private WebElement cancellationReasonBreadCrum;

    //Page object
    public void CancellationReasonsPageCheck() throws InterruptedException {
        leftPaneNavigation(cancellationReasonsNav);
        isDisplayed(cancellationReasonBreadCrum);
    }
}

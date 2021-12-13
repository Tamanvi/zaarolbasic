package com.zaarolbasic.pageObjects;

import com.zaarolbasic.businessUtilities.BusinessUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoleManagementPage extends BusinessUtilities {

    public RoleManagementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // WebElements

    @FindBy(xpath = "//div[contains(text(), 'Role Management')]")
    private WebElement roleManagementNav;

    @FindBy(xpath = "//span[contains(text(), 'Role-Management')]")
    private WebElement roleMgmtBreadCrumb;

    //PageObjects

    public void roleManagementPageCheck(){
        leftPaneNavigation(roleManagementNav);
        isDisplayed(roleMgmtBreadCrumb);
    }

}
